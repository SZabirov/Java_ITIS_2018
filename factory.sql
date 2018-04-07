ALTER TABLE product ADD COLUMN facory_id INTEGER;
drop table factory;
CREATE TABLE factory (
	id SERIAL PRIMARY KEY, 
	name VARCHAR(255), 
	manager_name VARCHAR(255) REFERENCES people(name),
	phone VARCHAR(255)
);
select * from product;
select * from factory;
INSERT INTO product VALUES (1, 'молоко', 24, 35, 1);
INSERT INTO product VALUES (2, 'сметана', 45, 10, 1);
INSERT INTO product VALUES (3, 'хлеб', 45, 10, 3);

INSERT INTO factory (name, manager_name, phone) 
VALUES ('ЗМК', 'Иванов И.', '322223223322');

INSERT INTO factory (name, manager_name, phone) 
VALUES ('Хлебзавод N3', 'Петров И.', '225225225');

select * from factory;

select p.id, p.name, p.price, f.name
from product p, factory f
WHERE p.facory_id = f.id;






