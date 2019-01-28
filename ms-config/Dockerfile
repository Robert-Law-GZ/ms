FROM java:8

ADD target/ms-config-0.0.1-SNAPSHOT.jar  ms-config.jar

RUN bash -c 'touch /ms-config.jar'

EXPOSE 8080

ENTRYPOINT ["java","-jar","/ms-config.jar"]