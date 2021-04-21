#!/bin/bash
docker start alex-db > /dev/null 2>&1 || \
docker run -d -p 5432:5432 --name "alex-db" -e "POSTGRES_USER=sample" -e "POSTGRES_PASSWORD=letsrecruityou" -e "POSTGRES_DB=development" postgres:13
