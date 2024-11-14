FROM openjdk:17-slim

WORKDIR /app

# Copy the JAR file to /app/app.jar in the container
COPY build/libs/Demo-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
