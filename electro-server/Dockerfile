FROM curlimages/curl:8.2.1 AS download
ARG OTEL_AGENT_VERSION="1.32.0"
RUN curl --silent --fail -L "https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_AGENT_VERSION}/opentelemetry-javaagent.jar" \
    -o "$HOME/opentelemetry-javaagent.jar"

# Start a new stage for the build
FROM maven:3.6.3-openjdk-11 AS build
ADD . /electro-server
RUN cd /electro-server && mvn package --quiet -DskipTests

# Start the final stage
FROM openjdk:11-jre-slim
COPY --from=build /electro-server/target/electro-0.0.1-SNAPSHOT.jar /electro-server.jar
COPY --from=download /home/curl_user/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar
ENTRYPOINT ["java", \
  "-javaagent:/opentelemetry-javaagent.jar", \
  "-jar", "/electro-server.jar" \
]
