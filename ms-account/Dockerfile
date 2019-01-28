FROM java:8

ADD target/ms-account-0.0.1-SNAPSHOT.jar  ms-account.jar

RUN bash -c 'touch /ms-account.jar'

EXPOSE 8081

ENTRYPOINT ["java","-jar","/ms-account.jar"]