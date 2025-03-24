FROM openjdk:21-jdk-slim

# Copy the built JAR from target folder into the container
COPY target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "/app.jar"]
