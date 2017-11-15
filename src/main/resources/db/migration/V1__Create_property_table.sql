create table property (
id integer generated always as identity(start with 100) primary key,
housenumber varchar(10),
street varchar(50),
unitnumber varchar(10),
city varchar(30),
postalcode varchar(6),
bedrooms integer,
bathrooms integer);