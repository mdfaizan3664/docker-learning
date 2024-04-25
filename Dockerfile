FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD build/libs/docker-learning-1.jar docker-learning.jar
ENTRYPOINT ["java", "-jar", "/docker-learning.jar"]