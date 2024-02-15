FROM openjdk:latest
COPY ./target/SoftwareEngineeringMethods-1.0-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SoftwareEngineeringMethods-1.0-jar-with-dependencies.jar"]