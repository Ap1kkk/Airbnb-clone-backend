#FROM gradle:jdk21-alpine AS builder
#ENV APP_DIR=/app
#WORKDIR $APP_DIR
#
#COPY . .
#
#RUN --mount=type=cache,target=/root/.gradle \
#    gradle build -i --no-daemon -x test

FROM openjdk:21-slim-buster

WORKDIR $APP_DIR
COPY /build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
LABEL org.opencontainers.image.source=https://github.com/Ap1kkk/Airbnb-clone-backend