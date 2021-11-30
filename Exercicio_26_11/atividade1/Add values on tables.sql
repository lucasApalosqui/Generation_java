insert into tbl_classe (classe, arma, vida, mana)
values ("ranger", "arco ou besta", 1200, 350),									-- 1
	   ("mage", "cajado ou livro de feitiços", 1300, 750), 						-- 2
       ("brawler", "punhos", 2500, 450), 										-- 3
       ("enginner", "maquinas e bugigangas", 2000, 500), 						-- 4
       ("dragon slayer", "escudos e espadas", 2300, 500); 						-- 5
       
insert into tbl_personagem (nome, dificuldade, nivel, id_classe)
values ("tellanas", "fácil", 12, 1),
	   ("ishar", "normal", 10, 2),
       ("qi", "intermediário", 15, 3),
       ("moren", "fácil", 4, 4),
       ("maloch", "normal", 1, 5),
       ("brunhild", "iniciante", 17, 4),
       ("raz", "impossivel", 120, 3),
       ("annete", "dificil", 57, 2),
       ("elsu", "fácil", 45, 1);

