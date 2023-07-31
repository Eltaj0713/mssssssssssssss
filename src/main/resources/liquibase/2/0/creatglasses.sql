use fistdatabase;
CREATE TABLE glasses(
    id int auto_increment NOT NULL,
    name varchar(255) NOT NULL,
    price varchar(255),
    image varchar(255),
    currency varchar(255),
    country varchar(255),
    company varchar(255),
    material varchar(255),
    expiration_date varchar(255),
    purpose_use_product varchar(255),
    PRIMARY KEY (id)
);