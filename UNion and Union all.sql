use foreignK;
create table CustomerDetails(customerID int (50),address varchar(50),zipcode int(10),primary key(customerID));
create table OrderDetails2(OrderID int (50),customerID int(50),Amount int(50),date varchar(50),primary key(OrderID),foreign key(customerID) REFERENCES CustomerDetails(customerID)ON DELETE cascade);
create table OrderDetails(OrderID int (50),customerID int(50),Amount int(50),date varchar(50),primary key(OrderID),foreign key(customerID) REFERENCES CustomerDetails(customerID));

insert into CustomerDetails values (12345,'delhi',110095);
insert into CustomerDetails values (123456,'delhi',210095);
insert into CustomerDetails values (1234567,'delhi',510095);


insert into OrderDetails2 values (1234523,12345,110095,'april');

delete from CustomerDetails where customerID=12345;
select * from CustomerDetails;
select * from OrderDetails2;
insert into OrderDetails2 values (12345323,12345747,110095,'april');
insert into CustomerDetails values (12345747,'Delhi',1100);
insert into OrderDetails2 values (12345323,12345747,110095,'april');


delete  from OrderDetails2 where customerID=12345747;
