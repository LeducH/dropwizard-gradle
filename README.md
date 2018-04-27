# Dockerwizard

How to start the Dockerwizard application
---

1. Run `gradle build` to build your application
1. Start application with `java -jar build/libs/Dockerwizard.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
