--liquibase formatted sql

-- changeset liquibase:1
create table if not exists product
(
    id            serial primary key,
    description   varchar(666),
    price         numeric(10, 2) not null,
    qty_available integer     not null
);