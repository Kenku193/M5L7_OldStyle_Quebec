CREATE TABLE IF NOT EXISTS customers (
                                         id BIGSERIAL PRIMARY KEY,
                                         login VARCHAR(50),
                                         password VARCHAR(50)
);

INSERT INTO customers(login, password) VALUES ( 'YuraLogin', 'qwerty');
INSERT INTO customers(login, password) VALUES ( 'DemoLogin', 'ytrewq');
INSERT INTO customers(login, password) VALUES ( 'add', 'qqq');
INSERT INTO customers(id, login, password) VALUES (10, 'add', 'qqq');

DROP TABLE customers;