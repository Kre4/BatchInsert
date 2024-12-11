create table if not exists dummy
(
    id       bigserial primary key,
    name     text,
    some_int int
);

create table if not exists dummy_with_seq
(
    id       bigint primary key,
    name     text,
    some_int int
);

create sequence if not exists dummy_id_sequence start with 100 increment 50;
alter database batches set log_statement = 'all';
