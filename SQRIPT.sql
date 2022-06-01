
Create table package_info
(
    package_id          tinyint             identity constraint package_id primary key,

    package_n       int                 not NULL,
	Weight			int 		        NOT NULL,		
	Package_type	varchar (30)			NOT NULL,	   
    Package_status  varchar (30)            NOT NULL,
    Country_out     varchar (50)            NOT NULL,   
    Country_in      varchar (50)            NOT NULL,
    Fio_out         varchar (80)            NOT NULL,    
    Fio_in          varchar (80)            NOT NULL,
    Post_num        varchar (20)            NOT NULL,    
    Post_index      varchar (20)            NOT NULL,
    adres_in        varchar (50)            NOT NULL,
    Date_in         date                    NULL,
    Date_out        date                    NULL,
	RW				rowversion
)
Create table client
(
client_id          tinyint             identity constraint client_id primary key,

Fio                varchar (80)        NOT NULL CHECK(Fio NOT LIKE '%[0-9]%'),
Age                tinyint             NOT NULL,
Sex				   varchar(6)		   NOT NULL,
Id_number          varchar(30)         NOT NULL,    
IIN                varchar(30)         NOT NULL,
Adress             varchar(50)         NOT NULL,
Serv               varchar(50)         NOT NULL,
Package_cl         tinyint             NULL,
RW				rowversion
)

alter table client
add constraint Package_cl
foreign key(Package_cl) references package_info (package_id)

alter table package_info
add constraint Package_cl
foreign key(Package_cl) references package_info (package_id)


INSERT INTO package_info
(package_n,Weight,Package_type,Package_status,Country_out,Country_in,Fio_out,Fio_in,Post_num,Post_index,adres_in,Date_in)
VALUES
(32,1,'Мелкий','Вручено','Казахстан','Китай','Владимир','Сергиенко','Гопс 76','А00256','Абая 27','16-04-2019')

 
INSERT INTO client
(Fio, Age,Sex,  Id_number, IIN,Adress,Serv,Package_cl)
VALUES
('Владимир Сергиенко',22, 'male',  '990328529','990650524' ,'Абая 27','Отправка',11)


select * From client

select * From package_info

drop table package_form
drop table package_info
drop table client
drop table cashier
drop table ServiceT
drop table PackageT