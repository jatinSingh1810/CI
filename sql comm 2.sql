use union1;
create table college(id int(20),name varchar(50));

insert into college values (53,'tim');
insert into college values (643,'ben');
insert into college values (223,'tam');
insert into college values (574,'sam');
insert into college values (422,'ram');
insert into college values (983,'joe');
insert into college values (5399,'ten');
insert into college values (5399,'ten');
insert into college values (574,'null');
insert into college values (5399,'ten');

create table Results(id int(20),name varchar(50));
insert into Results values (9893,'tina');
insert into Results values (53,'tim');
insert into Results values (24,'harsh');
insert into Results values (575459,'sam');
insert into Results values (887,'jack');
insert into Results values (98003,'joepp');


select * from college union (select * from Results);
select * from college union all (select * from Results);

select id from results;

#exists

select * from college where exists (select * from college where name='rama');




create table marks(score int,name varchar(20));

insert into marks values (45,'tina');
insert into marks values (23,'tim');
insert into marks values (64,'Harsh');
insert into marks values (65,'tam');
insert into marks values (99,'sam');
insert into marks values (34,'jack');


select * from marks;

create table constant(flightid varchar(20),flightid11 integer Not Null);
describe constant;
insert into constant values ('AWS',null);
create table constanq(flightid varchar(20),flightid11 integer);
insert into constanq values('AWS',null);

create table Defualt (name varchar (20), age int default 25);

insert into Defualt(name) values ('jatin');
select * from Defualt;
 insert into Defualt values('jatin',34);
 
create table Unique1(name varchar(20), ID integer unique);

insert into Unique1 values ('jatin',21);

create table PrimaryKey(name varchar(20),empid int,age int ,primary key(empid));

insert into PrimaryKey values ('jatin',21,21);
insert into PrimaryKey values ('jatin',21,22);









