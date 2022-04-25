drop table if exists project3."users" cascade;
drop table if exists project3."posts" cascade;
drop table if exists project3."likes" cascade;

create table project3."users" (
	"id" serial primary key,
	"username" text not null,
	"password" text not null,
	"follower_count" integer default 0,
	"points" integer default 0,
	"first_name" text not null,
	"last_name" text not null,
	"email" text not null,
	"about_me" text
);

create table project3."posts" (
	"id" serial primary key,
	"contents" text not null,
	"likes" integer default 0,
	"post_time" text default current_timestamp,
	"userid" integer not null references project3."users"(id),
	"parent_post" integer default 0 references project3."posts"(id)
);

create table project3."likes" (
	"id" serial primary key,
	"userid" integer not null references project3."users"(id),
	"postid" integer not null references project3."posts"(id)
);

CREATE OR REPLACE FUNCTION update_modified_column() 
RETURNS TRIGGER AS $$
BEGIN
    NEW.post_time = now();
    RETURN NEW; 
END;
$$ language 'plpgsql';

CREATE TRIGGER update_customer_modtime BEFORE UPDATE ON project3."posts" FOR EACH ROW EXECUTE PROCEDURE  update_modified_column();