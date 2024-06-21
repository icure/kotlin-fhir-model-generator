FROM eclipse-temurin:21.0.1_12-jdk-alpine

ARG repoUsername
ARG repoPassword
ENV ORG_GRADLE_PROJECT_repoUsername=$repoUsername
ENV ORG_GRADLE_PROJECT_repoPassword=$repoPassword

WORKDIR /build
COPY . ./

RUN apk --no-cache add bash # for git-version plugin

RUN ./gradlew -x test run --args "./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R4/ r4"
RUN ./gradlew -x test run --args "./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R4B/ r4b"
RUN ./gradlew -x test run --args "./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R5/ r5"
RUN ./gradlew -x test run --args "./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/6.0.0-ballot1/ r6"
RUN ./gradlew -x test publish
