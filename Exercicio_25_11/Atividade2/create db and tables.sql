
-- creating database and use
CREATE DATABASE db_ecommerce;
USE db_ecommerce;

-- creating tables
CREATE TABLE tbl_produtos (
	cod_barras INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome_produto VARCHAR(80) NOT NULL,
    descricao VARCHAR(200) NULL,
    estoque BOOLEAN NOT NULL,
    varejista VARCHAR(60) NOT NULL
);

-- update tables and add a new column
ALTER TABLE tbl_produtos ADD preco BIGINT NOT NULL;

ALTER TABLE tbl_produtos modify preco FLOAT NOT NULL;
