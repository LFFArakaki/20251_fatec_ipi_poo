-- DELETE FROM tb_pessoa WHERE cod_pessoa = 2;

-- SELECT * FROM tb_pessoa ORDER BY cod_pessoa DESC;

-- UPDATE tb_pessoa SET nome = 'Ana Maria' WHERE cod_pessoa = 2;

-- SELECT nome, email FROM tb_pessoa WHERE cod_pessoa IN (1, 3);

-- SELECT * FROM tb_pessoa;

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES
-- ('Pedro', '87298738', 'pedro@email.com'),
-- ('Mariano', '78389237', 'marianovieiro@gmail.com');

-- INSERT INTO tb_pessoa(nome, fone, email)
-- VALUES ('Luisa', '998750098', 'luisa_araraki@gmail.com');

-- CREATE TABLE tb_pessoa(
--     cod_pessoa SERIAL PRIMARY KEY,
--     nome VARCHAR(200) NOT NULL,
--     fone VARCHAR(200) NOT NULL,
--     email VARCHAR(200) NULL
-- );