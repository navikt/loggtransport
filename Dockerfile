FROM europe-north1-docker.pkg.dev/cgr-nav/pull-through/nav.no/jdk:openjdk-25

# Working dir for RUN, CMD, ENTRYPOINT, COPY and ADD (required because of nonroot user cannot run commands in root)
WORKDIR /app

COPY target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]