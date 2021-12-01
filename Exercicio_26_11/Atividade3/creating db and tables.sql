create database db_farmacia_do_bem;
use db_farmacia_do_bem;


create table tbl_categoria(
	id_categoria int not null auto_increment primary key,
    categoria varchar(50),
    setor varchar(50)
);

create table tbl_produto(
	id_produto int not null auto_increment primary key,
    produto varchar(60) not null,
    descricao varchar(100) null default "indefinido",
    preco float not null,
    estoque boolean not null,
    id_categoria int not null,
    constraint fk_produto_categoria foreign key(id_categoria)
    references tbl_categoria(id_categoria)
);



