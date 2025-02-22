create table if not exists customers
(
    id       serial primary key,
    nickname varchar(32)
);

create table if not exists orders
(
    id          serial primary key,
    customer_id int references customers (id)
);

insert into customers (nickname)
values ('first_customer'), ('second_customer');

insert into orders (customer_id)
select 1
from generate_series(1, 5);

insert into orders (customer_id)
select 2
from generate_series(1, 5)
