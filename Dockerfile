FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/seMethods-0.1.0.2.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]