create table if not exists user_authentication (
	user_id int(5) not null primary key,
	username varchar(50) not null,
	passcode varchar(100) not null,
	enabled int(1) check(enabled in (1,0))
);