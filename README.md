# Dockerwizard

How to start the Dockerwizard application
---

1. Run `gradle build` to build your application
1. Start application with `java -jar build/libs/Dockerwizard.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

To start inside a Docker container 
###Build Docker conatiner with
```
docker build --tag=helloDocker .
```
Run Docker container with

```
docker run -p 18080:8080 -t -i myapp
```

To check that your application is running enter url `http://localhost:18080/hello-world`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
