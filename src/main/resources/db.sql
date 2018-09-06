create table items (
id mediumint not null auto_increment,
name char(30) not null,
price float(8,4) not null,
primary key(id)
);

insert into items(name,price) values('Jack Daniels',1700.00);
insert into items(name,price) values('Bacardi',1500.00);

create table bill(
billNumber mediumint not null auto_increment,
billDate date not null,
billAmount float not null,
primary key (billNumber)
);


create table billdetails(
itemNumber mediumint not null auto_increment,
billNumber mediumint not null,
itemName char(50) not null,
quantity mediumint not null,
price float not null,
primary key (itemNumber),
foreign key  (billNumber) 
references bill(billNumber)
on update cascade
on delete cascade

);

insert into bill(billDate,billAmount) values('2018-09-04',10500.50);
insert into billdetails(billNumber,itemName,quantity,price) values(1,'Jack Daniels',5,5000.00);
insert into billdetails(billNumber,itemName,quantity,price) values(1,'Bacardi',5,5500.00);

