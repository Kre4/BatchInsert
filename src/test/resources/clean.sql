delete from dummy;
delete from dummy_with_seq;
delete from dummy_uuid;
select setval('dummy_id_seq', 1);
select setval('dummy_id_sequence', 100);
