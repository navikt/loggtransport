FROM gcr.io/distroless/java17-debian12

COPY target/lib/*.jar ./lib/
COPY target/app.jar .