FROM java:8

ADD target/ms-eureka-server-0.0.1-SNAPSHOT.jar  ms-eureka-server.jar

RUN bash -c 'touch /ms-eureka-server.jar'

EXPOSE 8671

ENTRYPOINT ["java","-jar","/ms-eureka-server.jar"]