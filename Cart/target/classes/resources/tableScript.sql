create SEQUENCE hibernate_sequbence start with 1001 increment by 1;

CREATE TABLE PRODUCT(
productId int primary key,
productName varchar(20),
productCategory varchar(15),
productPrice float(6),
productImage BLOB
); 

create table CUSTOMER(
customerId int primary key,
Name varchar(20),
Email varchar(20) unique,
mobileNumber int,
password varchar(20),
address varchar(50),
customerType varchar(1)
);
insert into CUSTOMER values(1001,'RIJU','rijujain@gmail.com',9620949331,'HelloWorld','mig 502,laxmikanth nagara','c');
create table ORDERDETAILS(
orderId int primary key,
productId int,
customerid int,
orderDate date
);


drop table CUSTOMER;
desc PRODUCT;