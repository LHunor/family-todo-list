insert into stage(name) values ('New');
insert into stage(name) values ('In Progress');
insert into stage(name) values ('Done');
insert into stage(name) values ('Cancelled');

INSERT INTO task(title, description, created_at, updated_at, stage_id) VALUES('Mosogatás', 'Mosogasson már el vki pls...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1);
INSERT INTO task(title, description, created_at, updated_at, stage_id) VALUES('Takarítás', 'Már épp ideje...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 2);
INSERT INTO task(title, description, created_at, updated_at, stage_id) VALUES('Alvás', 'Zzz...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 4);

insert into tag(name) values ('Red');
insert into tag(name) values ('Green');
insert into tag(name) values ('Blue');

insert into tasks_tags (tasks_id, tags_id) values (1, 1);
insert into tasks_tags (tasks_id, tags_id) values (1, 2);
insert into tasks_tags (tasks_id, tags_id) values (2, 2);
insert into tasks_tags (tasks_id, tags_id) values (2, 3);
insert into tasks_tags (tasks_id, tags_id) values (3, 3);
