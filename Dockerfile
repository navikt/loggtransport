FROM gcr.io/distroless/java17-debian12

#LABEL org.opencontainers.image.source=https://github.com/navikt/fp-soknad

COPY target/classes/logback*.xml conf/
COPY target/lib/*.jar lib/
COPY target/*.jar .