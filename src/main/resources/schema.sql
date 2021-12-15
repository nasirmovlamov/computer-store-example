create
database computer_store;

create schema computer_store;

create table computer_store.users
(
    id         bigserial
        constraint users_pk primary key,
    username   varchar(255),
    password   varchar(255),
    first_name varchar(255),
    last_name  varchar(255),
    address    varchar(255),
    phone      varchar(255)
);

create table computer_store.accessors
(
    id           bigserial
        constraint users_pk primary key,
    category_id  bigserial,
    model_number varchar(255),
    model_name   varchar(255),
    description  varchar(255),
    price        float4,
    discount     float4,
    constraint category_id foreign key (category_id) references computer_store.categories (id)
);

create table computer_store.categories
(
    id   bigserial
        constraint users_pk primary key,
    name varchar(255),
);

create table computer_store.purchases
(
    id          bigserial
        constraint users_pk primary key,
    user_id     bigserial,
    accessor_id bigserial,
    quantity    int,
    order_date  date,
    order_time  time,
    constraint user_id foreign key (user_id) references computer_store.users (id),
    constraint accessor_id foreign key (accessor_id) references computer_store.accessors (id)
);