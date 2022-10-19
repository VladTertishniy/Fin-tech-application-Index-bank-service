FROM openjdk:17-alpine

ARG USER_GRUOP_NAME=AdAppGroup
ARG USER_NAME=AdApp

RUN addgroup -S ${USER_GRUOP_NAME} && adduser -S ${USER_NAME} -G ${USER_GRUOP_NAME}
USER ${USER_NAME}:${USER_GRUOP_NAME}

COPY /target/index-bank-integration-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar", "index-bank-integration-0.0.1-SNAPSHOT.jar"]
