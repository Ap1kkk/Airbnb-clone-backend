FROM gradle:jdk21-alpine AS builder

WORKDIR /app
COPY ../settings.gradle settings.gradle
COPY ../common ./common
COPY ../housing-category-service ./housing-category-service

RUN ls -1 /app/housing-category-service

RUN gradle build -x test

FROM openjdk:21-slim-buster

WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]