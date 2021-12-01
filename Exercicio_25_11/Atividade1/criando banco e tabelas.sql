
-- criando e usando o banco de dados
create database db_rh_service;
use db_rh_service;

-- criando a tabela de funcionaries do banco
create table funcionaries(
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    sobrenome VARCHAR(100) NOT NULL,
    setor VARCHAR(60) NOT NULL,
    cargaH BIGINT NOT NULL,
    folgando BOOLEAN NOT NULL
);

-- adicionando a coluna salario na tabela
ALTER TABLE funcionaries ADD salario FLOAT NOT NULL;


