FROM maven:3.8.3-openjdk-17

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean install

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]