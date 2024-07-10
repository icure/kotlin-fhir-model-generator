FROM eclipse-temurin:21.0.1_12-jdk-alpine

ARG repoUsername
ARG repoPassword
ENV ORG_GRADLE_PROJECT_repoUsername=$repoUsername
ENV ORG_GRADLE_PROJECT_repoPassword=$repoPassword

WORKDIR /build
COPY . ./

# Add gradle properties to disable daemon
RUN echo "org.gradle.daemon=false" >> gradle.properties

RUN apk --no-cache add bash # for git-version plugin

# build the fat jar
RUN ./gradlew :fatJar --stacktrace --debug --no-daemon

# Move and rename the fat jar
RUN mv ./build/libs/*-fhirModelGenerator.jar ./build/libs/fhirModelGenerator.jar

RUN java -jar ./build/libs/fhirModelGenerator.jar ./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R4/ r4
RUN java -jar ./build/libs/fhirModelGenerator.jar ./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R4B/ r4b
RUN java -jar ./build/libs/fhirModelGenerator.jar ./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/R5/ r5
RUN java -jar ./build/libs/fhirModelGenerator.jar ./gen/src/main/kotlin ./gen/src/test/kotlin ./gen/src/main/resources/samples https://hl7.org/fhir/6.0.0-ballot1/ r6
RUN ./gradlew -x :test -x :kspKotlin publish
