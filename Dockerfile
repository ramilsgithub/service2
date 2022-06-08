FROM openjdk:8-jdk-alpine
ADD target/service2-1.0-SNAPSHOT.jar service2-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","service2-1.0-SNAPSHOT.jar"]
EXPOSE 8082