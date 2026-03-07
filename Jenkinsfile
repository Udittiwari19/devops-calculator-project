pipeline {
    agent any
    environment {
        COMMIT_AUTHOR_EMAIL = sh(returnStdout: true, script: 'git log -1 --format="%ae"').trim()
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Build & Tag') {
            steps {
                sh 'docker build -t calculator-app:1.0 .'
                sh 'docker tag calculator-app:1.0 udit019/calculator-app:1.0'
            }
        }
        stage('Docker Push') {
            steps {
                withCredentials([usernamePassword(
                        credentialsId: 'dockerhub-creds',
                        usernameVariable: 'DOCKER_USER',
                        passwordVariable: 'DOCKER_PASS')]) {
                    sh '''
                        echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin
                        docker push udit019/calculator-app:1.0
                    '''
                }
            }
        }
        stage('Deploy using Ansible') {
            steps {
                sh '''
                    cd ansible
                    ansible-playbook -i inventory.ini deploy.yml
                    '''
            }
        }
    }
    post {
        success {
            emailext(
                subject: "SUCCESS: Build ${env.BUILD_NUMBER}",
                body: """
                    Build Successful
        
                    Job: ${env.JOB_NAME}
                    Build URL: ${env.BUILD_URL}
                    """,
                to: "${COMMIT_AUTHOR_EMAIL}"
            )
        }
    
        failure {
            emailext(
                subject: "FAILED: Build ${env.BUILD_NUMBER}",
                body: """
                    Build Failed
        
                    Job: ${env.JOB_NAME}
                    Build URL: ${env.BUILD_URL}
                    """,
                to: "${COMMIT_AUTHOR_EMAIL}"
            )
        }
    }
}
