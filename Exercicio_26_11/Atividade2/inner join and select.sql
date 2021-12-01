select sabor, ingredientes, borda, categoria, tamanho, preco, motoboy
from tbl_pizza inner join tbl_categoria on tbl_pizza.id_categoria = tbl_categoria.id_categoria
where preco > 45 order by preco and categoria;

select sabor, ingredientes, borda, categoria, tamanho, preco, motoboy
from tbl_pizza inner join tbl_categoria on tbl_pizza.id_categoria = tbl_categoria.id_categoria
where preco between 29 and 60;

select sabor, ingredientes, borda, categoria, tamanho, preco, motoboy
from tbl_pizza inner join tbl_categoria on tbl_pizza.id_categoria = tbl_categoria.id_categoria
where sabor like "c%";

select sabor, ingredientes, borda, categoria, tamanho, preco, motoboy
from tbl_pizza inner join tbl_categoria on tbl_pizza.id_categoria = tbl_categoria.id_categoria
where categoria like "%doce%";


