#!/usr/bin/env bash
NETWORK='my-network'

docker network rm $NETWORK
docker network create $NETWORK

docker build -t spring:2.0 --file docker/Dockerfile .
docker build -t mysql:1.0 --file docker/mysql/Dockerfile .

docker rm -f -v spring-app
docker rm -f -v mysql-db

docker run -d -ti --name mysql-db -e MYSQL_ROOT_PASSWORD="root" --network $NETWORK mysql:1.0
docker run -d -ti --name spring-app --network $NETWORK -p 8091:8080 spring:2.0
