create database ecommerce;

create schema ecommerce;

create table ecommerce.users
(
    id         bigserial constraint users_pk primary key,
    username   varchar(255),
    password   varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    address    varchar(255),
    phone      varchar(255)
);

create table ecommerce.products
(
    id          bigserial constraint users_pk primary key,
    category_id bigserial,
    name        varchar(255),
    description varchar(255),
    price       float4,
    discount    float4,
    constraint  category_id foreign key (category_id) references ecommerce.categories (id)
);

create table ecommerce.categories
(
    id   bigserial constraint users_pk primary key,
    name varchar(255),
);

create table ecommerce.orders
(
    id         bigserial constraint users_pk primary key,
    user_id    bigserial,
    product_id bigserial,
    quantity   int,
    order_date date,
    order_time time,
    constraint user_id foreign key (user_id) references ecommerce.users (id),
    constraint product_id foreign key (product_id) references ecommerce.products (id)
);