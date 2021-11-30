create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tbl_categoria(
	id_categoria int auto_increment primary key not null,
    categoria varchar(50) not null,
    tamanho varchar(50) default "médio",
    motoboy boolean not null
);

create table tbl_pizza(
	id_pizza int auto_increment primary key not null,
    sabor varchar(15) not null,
    ingredientes varchar(100) not null,
    borda boolean not null,
    id_categoria int not null,
    constraint fk_pizza_categoria foreign key(id_categoria)
    references tbl_categoria(id_categoria)
);



