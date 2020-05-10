# spring-jwt-demo

A MySQL server is needed to run this application. You can start a MySQL server through Docker by running:
docker container run --publish 3306:3306 --detach --name mysql --env MYSQL_RANDOM_ROOT_PASSWORD=yes mysql

Then obtain root password and place it in the application.properties file
