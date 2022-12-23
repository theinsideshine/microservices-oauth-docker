FROM openjdk:12
VOLUME /tmp
EXPOSE 8761
ADD ./target/springboot-servicio-zuul-server-0.0.1-SNAPSHOT.jar eureka-zuul.jar
ENTRYPOINT ["java","-jar","/eureka-zuul.jar"]