insert into tbl_categoria (categoria, setor)
values ("cosméticos","cosméticos e acessorios"),
	   ("acessorios","cosméticos e acessorios"),
       ("remédios", "farmaceutico"),
       ("anabolizantes", "fitness");
       
insert into tbl_produto (produto, descricao, preco, estoque, id_categoria)
values ("colonia real", "perfume de colonia", 30.66, true, 1),
	   ("camisinha durex", "preservativos", 9.90, true, 1),
       ("antilerg", "antialergico", 10.50, true, 3),
       ("wheyymax", "whey", 65.80, false, 4),
       ("dipirona", "remedio para dor de cabeça", 7.80, true, 3),
       ("halss preto", "balas consumiveis", 5.00, true, 1),
       ("eight", "maço de cigarros", 10.00, true, 1),
       ("faixa", "faixas para curativo", 6.00, false, 2);
	
