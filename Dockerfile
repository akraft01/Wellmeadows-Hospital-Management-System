# build application
FROM gradle:jdk17 AS build
RUN apt-get update && \
    apt-get install dos2unix && \
    apt-get clean
WORKDIR /workspace
COPY . .
RUN dos2unix gradlew
RUN chmod +x gradlew
RUN  ./gradlew bootJar --no-daemon
# extract jar
FROM eclipse-temurin:21-jdk-alpine AS extraction
WORKDIR workspace
ARG JAR_FILE=workspace/build/libs/*.jar
COPY --from=build ${JAR_FILE} app.jar
RUN java -Djarmode=layertools -jar app.jar extract
# setup image
FROM eclipse-temurin:21-jdk-alpine AS image
RUN addgroup -S appgroup && adduser -S spring -G appgroup
USER spring
WORKDIR workspace
COPY --from=extraction workspace/dependencies/ ./
COPY --from=extraction workspace/spring-boot-loader/ ./
COPY --from=extraction workspace/snapshot-dependencies/ ./
COPY --from=extraction workspace/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]