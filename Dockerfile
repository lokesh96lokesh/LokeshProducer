FROM eclipse-temurin:17
COPY target/lokeshproducer.jar lokeshproducer.jar 
CMD [ "java","-jar","lokeshproducer.jar"]