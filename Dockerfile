# Use a stable OpenJDK runtime as a parent image
FROM openjdk:24-jdk-slim

# Install any required packages
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
    openssl \
    ca-certificates && \
    rm -rf /var/lib/apt/lists/*

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container at /app/docker.jar
COPY target/docker-0.0.1-SNAPSHOT.jar /app/docker.jar

# Expose the port that the application will run on
EXPOSE 8080

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "docker.jar"]
