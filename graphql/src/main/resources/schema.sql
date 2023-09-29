
create schema test;
CREATE TABLE test.vehicle
(
    ID          int,
    type        text,
    model_code  text,
    brand_name  text,
    launch_date date
);
Insert into test.vehicle
values (1, 'q', 'q', 'q', '2023-09-28')