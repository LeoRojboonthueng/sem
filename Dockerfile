FROM openjdk:latest
COPY ./target/SoftwareEngineeringMethods-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SoftwareEngineeringMethods-0.1.0.2-jar-with-dependencies.jar"]