CREATE TABLE app_user (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR NOT NULL,
    age INTEGER,
    number_cigarettes_smoked INTEGER
);
