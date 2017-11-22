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

create table ORDERDETAILS(
orderId int primary key,
productId int,
customerid int,
orderDate date
);


drop table ORDERDETAILS;
desc PRODUCT;