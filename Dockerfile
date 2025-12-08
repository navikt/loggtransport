FROM europe-north1-docker.pkg.dev/cgr-nav/pull-through/nav.no/jre:openjdk-17

COPY target/app.jar .

CMD ["-jar", "app.jar"]