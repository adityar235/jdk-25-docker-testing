#FROM openjdk:25-jdk

#ADD target/rest-demo.jar rest-demo.jar
#
#ENTRYPOINT ["java", "-jar", "/rest-demo.jar"]
# It behaves like a fixed executable and doesn’t depend on working directory

#FROM openjdk:25-jdk-slim
#FROM openjdk:25-jdk AS build
FROM eclipse-temurin:25-jdk

WORKDIR /app

COPY target/rest-demo.jar /app/rest-app.jar

#EXPOSE 8080

CMD ["java", "-jar", "rest-app.jar"]
# CMD is flexible and depends on WORKDIR.