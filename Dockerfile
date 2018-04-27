FROM java:8-jre
COPY config.yml /opt/hello/
COPY build/libs/Dockerwizard.jar /opt/hello/
EXPOSE 8080
WORKDIR /opt/hello
CMD ["java", "-Xms128m", "-Xmx1500m", "-Dfile.encoding=UTF-8", "-jar", "Dockerwizard.jar", "server", "config.yml"]
