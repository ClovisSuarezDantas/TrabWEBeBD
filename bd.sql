CREATE TABLE refeicoes (
    id SERIAL PRIMARY KEY,
    data DATE,
    entrada VARCHAR(255),
    principal VARCHAR(255),
    sobremesa VARCHAR(255)
);
