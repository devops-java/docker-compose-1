# docker-compose-1
java backend | mysql
# Install Docker Compose
https://docs.docker.com/compose/install/


# Target Activity
To connect with mysql from java servlet code. Here java servlet code and mysql both are diffrenet containers. Java Servlet Code is running as `web_app` container. MySQL is running as `mysql_db` container. Both of these containers are connected to same network `metrics-nw`. Look at the docker-compose.yml file in this repository.


# Bridge Network In Docker
In terms of Docker, a bridge network uses a software bridge which allows containers connected to the same bridge network to communicate, while providing isolation from containers which are not connected to that bridge network. The Docker bridge driver automatically installs rules in the host machine so that containers on different bridge networks cannot communicate directly with each other.

![image](https://user-images.githubusercontent.com/17001948/120603291-7a748980-c469-11eb-902a-69ca469161b4.png)



# Used Commands
* stop all containers with docker compose: docker-compose down
* start all containers: docker-compose -f docker-compose.yml up -d
* list networks: docker network ls
* inspect netowrk: docker network inspect network_name
* access the endpoint to see mysql connection: curl localhost:8080/app/connect. Below screenshot prints the mysql connection.
* ![image](https://user-images.githubusercontent.com/17001948/120604197-6b420b80-c46a-11eb-9ed7-0abe8f3adb0c.png)




# Additional Docker Commands
* build docker image: docker build -t web_db_connect .
* docker tag for image: docker tag web_db_connect rkp201/web_db_connect:1.8 
* push image to docker hub: docker push rkp201/web_db_connect:1.8


