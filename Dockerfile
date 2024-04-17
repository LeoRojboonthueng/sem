# Build app with maven
FROM maven:latest AS build
WORKDIR /app
COPY . /app
RUN mvn package

# Run docker compose and start app
FROM openjdk:latest
WORKDIR /tmp
COPY ./target/SoftwareEngineeringMethods-0.1.0.2-jar-with-dependencies.jar /tmp
ENTRYPOINT ["java", "-jar", "SoftwareEngineeringMethods-0.1.0.2-jar-with-dependencies.jar"]