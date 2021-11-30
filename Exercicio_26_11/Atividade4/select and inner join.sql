select produto, tipo, qualidade, preco from tbl_produto
inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where preco > 50;

select produto, tipo, qualidade, preco from tbl_produto
inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where preco between 4 and 60;

select produto, tipo, qualidade, preco from tbl_produto
inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where produto like "C%";

select produto, tipo, qualidade, preco from tbl_produto
inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where tipo like "%aves";