FROM openjdk@sha256:08e043b6875d739727843ea48d7e79c1be842248c0931f282f3a7c623c2375d3
ARG JAR_FILE=SalutiWeb-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} app.jar
#chiediamo al container di esporre questa porta
EXPOSE 8050
#all'avvio del container partirà direttamente l'applicativo
ENTRYPOINT ["java","-jar","/app.jar"]
