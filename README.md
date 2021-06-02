# docker-compose-1
java backend | mysql

# commands
docker-compose down

docker-compose up

docker build -t web_db_connect .

docker tag web_db_connect rkp201/web_db_connect:1.8 

docker push rkp201/web_db_connect:1.8

curl localhost:8080/app/connect
