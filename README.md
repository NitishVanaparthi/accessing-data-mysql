# accessing-data-mysql

Search for mysql on docker hub
docker run -d -e MYSQL_ROOT_PASSWORD=dummypassword -e MYSQL_DATABASE=todos -e MYSQL_USER=todos-user -e MYSQL_PASSWORD=dummytodos -p 3306:3306 mysql:5.7
