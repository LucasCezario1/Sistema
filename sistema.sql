
create table "user"
(
    id SERIAL PRIMARY KEY NOT NULL,
    login VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255),
    created_date TIMESTAMP,
    updated_date TIMESTAMP
);



insert into "sistema" (login, email, senha, updated_date, created_date) VALUES ('Quenobe', 'lucas@gmail.com','123456' , now(), now());




http://localhost:8080/swagger-ui.html#/
docker run -d -p 3306:3306 -e POSTGRES_PASSWORD=password --name sistema postgres
