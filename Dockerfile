# Use official Java 21 image
FROM eclipse-temurin:21-jre-alpine

# Set working directory inside container
WORKDIR /app

# Copy jar file into container
COPY target/scientific-calculator-1.0-SNAPSHOT.jar app.jar

# Run the application

