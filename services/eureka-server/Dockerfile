FROM gradle:jdk21-alpine AS builder
ENV APP_DIR=/app
WORKDIR $APP_DIR

COPY gradle $APP_DIR/gradle
COPY build.gradle settings.gradle gradlew  $APP_DIR
COPY . .
RUN --mount=type=cache,target=/root/.gradle \
    ./gradlew build --no-daemon -x test

FROM openjdk:21-slim-buster

WORKDIR $APP_DIR
COPY --from=builder /app/build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
LABEL org.opencontainers.image.source=https://github.com/Ap1kkk/Airbnb-clone-backend