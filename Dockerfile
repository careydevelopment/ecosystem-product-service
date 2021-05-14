FROM adoptopenjdk/openjdk11:jre-11.0.10_9-alpine
COPY ./target/ecosystem-product-service.jar /
EXPOSE 32030
ENTRYPOINT ["java", "-jar", "./ecosystem-product-service.jar"]
