FROM eclipse-temurin:17.0.10_7-jdk-alpine

ARG repoUsername
ARG repoPassword
ENV ORG_GRADLE_PROJECT_repoUsername=$repoUsername
ENV ORG_GRADLE_PROJECT_repoPassword=$repoPassword

WORKDIR /build
COPY . ./

RUN apk --no-cache add bash # for git-version plugin

RUN ./gradlew -x test publish
