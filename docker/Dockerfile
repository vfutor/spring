FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
RUN mkdir -p /build
WORKDIR /build/
COPY src /build/src/
COPY pom.xml /build/

RUN mvn package

FROM tomcat:9.0-jre8-alpine
COPY --from=MAVEN_TOOL_CHAIN /build/target/1.0-1.0-SNAPSHOT.jar /build/target/
CMD java -jar /build/target/1.0-1.0-SNAPSHOT.jar



