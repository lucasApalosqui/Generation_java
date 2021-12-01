create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tbl_categoria(
	id_categoria int auto_increment not null primary key,
    tipo varchar(50) not null
);

create table tbl_produto(
	id_produto int auto_increment not null primary key,
    produto varchar(35) not null,
    qualidade varchar(20) not null,
    preco float not null,
    id_categoria int not null,
    constraint fk_produto_categoria foreign key(id_categoria)
    references tbl_categoria(id_categoria)
);
