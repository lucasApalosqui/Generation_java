-- mostrando salários maiores do que 2000
select * from funcionaries where salario > 2000;

-- mostrando salários menores do que 2000
select * from funcionaries where salario < 2000;



-- alterando valores na tabela
SET SQL_SAFE_UPDATES = 0;
UPDATE funcionaries SET sobrenome = "Octavio Apalosqui"
WHERE nome = "Lucas";

