create database db_generation_game_online;
use db_generation_game_online;

create table tbl_classe(
	id_classe int auto_increment primary key not null,
	classe varchar(50) not null,
    arma varchar(120) not null,
    vida bigint not null,
    mana bigint not null
);

create table tbl_personagem(
	id_personagem int auto_increment primary key not null,
    nome varchar(60) not null,
    dificuldade varchar(50) default 'normal',
    nivel bigint default 1,
    id_classe int not null,
    constraint fk_classe_personagem foreign key (id_classe)
    references tbl_classe(id_classe)
);



