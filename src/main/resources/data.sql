--create table Course(ID NAME PRIMARY KEY, NAME VARCHAR(255));

INSERT INTO course(id, name) VALUES (10001,'Tekstowo');
INSERT INTO course(id, name) VALUES (10002,'Tekstowo2');
INSERT INTO course(id, name) VALUES (10003,'Tekstowo3');
INSERT INTO course(id, name) VALUES (10004,'Tekstowo4');
INSERT INTO course(id, name) VALUES (10005,'Tekstowo5');

insert into passport(id, number) values (40001, 'A123');
insert into passport(id, number ) values (40002,'B321');
insert into passport(id, number ) values (40003,'C435');
insert into passport(id, number) values (40004,'D987');

insert into student(id, name, passport_id)values (30001,'Andrzej', 40001);
insert into student(id, name, passport_id)values (30002,'Marian', 40002);
insert into student(id, name, passport_id )values (30003,'Jasiek', 40003);
insert into student(id, name, passport_id)values (30004,'Mike', 40004);