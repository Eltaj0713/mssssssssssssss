use fistdatabase;
create table about(
    id    int auto_increment,
    title varchar(400)  not null,
    text  varchar(900) not null,
    photo varchar(400) not null,
        primary key (id)
);