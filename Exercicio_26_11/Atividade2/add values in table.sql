insert into tbl_categoria (categoria, tamanho, motoboy)
values ("salgada", "normal", true),
	   ("salgada", "familia", true),
       ("doce", "normal", true),
       ("doce", "familia", true);
	
insert into tbl_pizza (sabor, ingredientes, borda, id_categoria)
values ("prestigio", "coco com chocolate", false, 3),
	   ("banana", "banana com canela", true, 4),
       ("nuterango", "nutella com morangos", true, 3),
       ("brigadeiro", "brigadeiro com confeitos", false, 3),
       ("portuguesa", "ovo, ervilha, presunto e queijo", false, 1),
       ("calabresa", "rodelas de linguiça calabresa com cebolas", true, 2),
       ("4 queijos", "mussarela, provolone, gorgonzola e parmesão", true, 2),
       ("calabacon", "rodelas de calabresa com bacon picado", false, 1);
       
alter table tbl_pizza add preco float not null;

update tbl_pizza set preco = 45.00 where id_pizza = 8;
	