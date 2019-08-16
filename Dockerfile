FROM maven:3-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:8
LABEL "MAINTAINER"="David Li <legendarilylwq@gmail.com>"

COPY --from=build /usr/src/app/target/gateway-0.0.1.jar /usr/app/gateway.jar  

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/usr/app/gateway.jar"]

EXPOSE 28899