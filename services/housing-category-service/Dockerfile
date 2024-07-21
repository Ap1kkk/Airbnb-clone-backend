FROM gradle:jdk21-alpine AS builder
#ENV SERVICE_NAME=housing-category-service
ENV APP_DIR=/app
WORKDIR $APP_DIR
#COPY ../gradle.properties $APP_DIR

#COPY ./$SERVICE_NAME $APP_DIR
COPY . .

RUN --mount=type=cache,target=/root/.gradle \
    gradle build -i --no-daemon -x test

FROM openjdk:21-slim-buster

WORKDIR $APP_DIR
COPY --from=builder /app/build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
LABEL org.opencontainers.image.source=https://github.com/Ap1kkk/Airbnb-clone-backend