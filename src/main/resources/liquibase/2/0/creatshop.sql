use fistdatabase;
create table shop(
    id    int auto_increment not null ,
    title varchar(400)  not null,
    text  varchar(800) not null,
    photo varchar(400) not null,
        primary key (id)
);