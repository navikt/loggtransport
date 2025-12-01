FROM gcr.io/distroless/java17-debian12

COPY build/libs/*.jar /app/

WORKDIR /app

CMD ["app.jar"]