FROM europe-north1-docker.pkg.dev/cgr-nav/pull-through/nav.no/jre:openjdk-25

COPY target/lib/*.jar ./lib/
COPY target/app.jar .

CMD ["-jar", "app.jar"]