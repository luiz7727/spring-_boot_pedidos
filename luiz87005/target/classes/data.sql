INSERT INTO tb_pedido_luiz87005(data_hora, status) VALUES('2023-07-19',
'CONFIRMADO');

INSERT INTO tb_item_do_pedido_luiz87005(quantidade, descricao, pedido_id)
VALUES(1, 'Smart TV Samsung', 1);

-- Acrescentando mais um registro para a tabela pedido
INSERT INTO tb_pedido_luiz87005(data_hora, status) VALUES('2023-09-04',
'PAGO');


-- Acrescentando mais dois itens para o novo pedido
INSERT INTO tb_item_do_pedido_luiz87005(quantidade, descricao, pedido_id)
VALUES(2, 'IPHONE 14 Plus', 2);

INSERT INTO tb_item_do_pedido_luiz87005(quantidade, descricao, pedido_id)
VALUES(2, 'PC GAMER', 2);

commit;