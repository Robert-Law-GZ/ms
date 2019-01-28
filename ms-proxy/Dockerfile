FROM java:8

ADD target/ms-proxy-0.0.1-SNAPSHOT.jar  ms-proxy.jar

RUN bash -c 'touch /ms-proxy.jar'

EXPOSE 8040

ENTRYPOINT ["java","-jar","/ms-proxy.jar"]