docker run --rm --name my-db -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=used-car-dealership -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -p 3306:3306 -d mysql

docker run --rm --name my-redis -p 6380:6379 -d redis
