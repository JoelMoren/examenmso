#!/usr/bin/env sh


cd msomonitoreo
mvn clean package
docker build -t joerk/msomonitoreo:1.0.0 .

cd ..

cd msoservicediscovery
mvn clean package
docker build -t joerk/msoservicediscovery:1.0.0 .

cd ..

cd msousuarios
mvn clean package
docker build -t joerk/msousuarios:1.0.0 .

cd ..

cd msopublicaciones
mvn clean package
docker build -t joerk/msopublicaciones:1.0.0 .

cd ..

cd msomensajeria
mvn clean package
docker build -t joerk/msomensajeria:1.0.0 .

cd ..

cd front
mvn clean package
docker build -t joerk/msofront:1.0.0 .

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
