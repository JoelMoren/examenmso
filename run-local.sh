#!/usr/bin/env sh


cd msomonitoreo
mvn clean package

cd ..

cd msoservicediscovery
mvn clean package 

cd ..

cd msousuarios
mvn clean package

cd ..

cd msopublicaciones
mvn clean package

cd ..

cd msomensajeria
mvn clean package

cd ..

cd front
mvn clean package

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
