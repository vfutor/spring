Run App
mvn package && java -jar target/1.0-1.0-SNAPSHOT.jar 

Docker
# Run docker build
docker build --file docker/Dockerfile -t spring:2.0 .

# Run with volume and interactive bash
docker run -v /Users/vfutoryanskyy/java/spring/docker-volume:/tmp/volume/:rw --rm -it -t spring:2.0 bash

# Run with opened ports in daemon
docker run -v /Users/vfutoryanskyy/java/spring/docker-volume:/tmp/volume/:rw --rm -it -p 8090:8080 -d -t spring:2.0
