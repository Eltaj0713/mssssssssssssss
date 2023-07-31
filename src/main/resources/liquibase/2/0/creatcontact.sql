use fistdatabase;
create table contact(
    id    int auto_increment,
    full_name varchar (70),
    email  varchar(70),
    message  varchar(70),
    phone_number varchar(70),
        primary key (id)
);