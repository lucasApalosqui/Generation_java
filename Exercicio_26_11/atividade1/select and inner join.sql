select nome, dificuldade, nivel, classe, arma, vida, mana from tbl_personagem
inner join tbl_classe on tbl_personagem.id_classe = tbl_classe.id_classe
where tbl_classe.mana < 500;

select nome, dificuldade, nivel, classe, arma, vida, mana from tbl_personagem
inner join tbl_classe on tbl_personagem.id_classe = tbl_classe.id_classe
where tbl_classe.vida > 1500 and  tbl_classe.vida < 3000;

select nome, dificuldade, nivel, classe, arma, vida, mana from tbl_personagem
inner join tbl_classe on tbl_personagem.id_classe = tbl_classe.id_classe
where tbl_personagem.nome like "r%";

select nome, dificuldade, nivel, classe, arma, vida, mana from tbl_personagem
inner join tbl_classe on tbl_personagem.id_classe = tbl_classe.id_classe
where tbl_classe.classe = "brawler";

