select produto, descricao, categoria, setor, preco, estoque
from tbl_produto inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where preco > 50 order by preco and categoria;

select produto, descricao, categoria, setor, preco, estoque
from tbl_produto inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where preco between 3 and 60 order by preco;

select produto, descricao, categoria, setor, preco, estoque
from tbl_produto inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where produto like "c%";

select produto, descricao, categoria, setor, preco, estoque
from tbl_produto inner join tbl_categoria on tbl_produto.id_categoria = tbl_categoria.id_categoria
where categoria like "%cosmético%";