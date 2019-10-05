INSERT INTO task(title, description, created_at, updated_at) VALUES('Mosogatás', 'Mosogasson már el vki pls...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO task(title, description, created_at, updated_at) VALUES('Takarítás', 'Már épp ideje...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO task(title, description, created_at, updated_at) VALUES('Alvás', 'Zzz...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into tag(name)
values ('Red');
insert into tag(name)
values ('Green');
insert into tag(name)
values ('Blue');

insert into task_tags (tasks_id, tags_id)
values (1, 1);
insert into task_tags (tasks_id, tags_id)
values (1, 2);
insert into task_tags (tasks_id, tags_id)
values (2, 2);
insert into task_tags (tasks_id, tags_id)
values (2, 3);
insert into task_tags (tasks_id, tags_id)
values (3, 3);