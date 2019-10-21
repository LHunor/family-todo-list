INSERT INTO comment (content) VALUES ('Befejeztem a matek házit');
INSERT INTO comment (content) VALUES ('Elkészítettem a szerveroldali REST API-t, nem kell tesztelni biztos jó.');

INSERT INTO groups (name) VALUES ('Rajz szakkör');
INSERT INTO groups (name) VALUES ('alkfejl csopi');

INSERT INTO restriction_type(name) VALUES('type_1');
INSERT INTO restriction_type(name) VALUES('type_2');
INSERT INTO restriction_type(name) VALUES('type_3');

INSERT INTO user_type(name) VALUES('guest_user');
INSERT INTO user_type(name) VALUES('an_other_type_of_user');
INSERT INTO user_type(name) VALUES('yet_another_type_of_user');

insert into user (user_type_id, name) values (1, 'Mézga Géza');
insert into user (user_type_id, name) values (1, 'Cékla Cecil');
insert into user (user_type_id, name) values (3, 'Sapkás Salamon');

insert into issue (title, description, place, created_at, updated_at) values ('The issue #1', 'Fatallica', 'PC42', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into issue (title, description, place, created_at, updated_at) values ('MegaIssue', 'MegaFatal', 'PC12', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into issue (title, description, place, created_at, updated_at) values ('Unknown issue', 'U.F.O', 'Air', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());
insert into issue (title, description, place, created_at, updated_at) values ('Broken Windows 10', 'Everywhere', 'PCxxx', CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());

insert into stage(name) values ('New');
insert into stage(name) values ('In Progress');
insert into stage(name) values ('Done');
insert into stage(name) values ('Cancelled');

INSERT INTO task(title, description, created_at, updated_at, stage_id, restriction_type_id) VALUES('Mosogatás', 'Mosogasson már el vki pls...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 1, 2);
INSERT INTO task(title, description, created_at, updated_at, stage_id, restriction_type_id) VALUES('Takarítás', 'Már épp ideje...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 2, 3);
INSERT INTO task(title, description, created_at, updated_at, stage_id, restriction_type_id) VALUES('Alvás', 'Zzz...', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 4, 1);

insert into tag(name) values ('Red');
insert into tag(name) values ('Green');
insert into tag(name) values ('Blue');

insert into tasks_tags (tasks_id, tags_id) values (1, 1);
insert into tasks_tags (tasks_id, tags_id) values (1, 2);
insert into tasks_tags (tasks_id, tags_id) values (2, 2);
insert into tasks_tags (tasks_id, tags_id) values (2, 3);
insert into tasks_tags (tasks_id, tags_id) values (3, 3);

INSERT INTO assignments (task_id, user_id) VALUES (1, 1);
INSERT INTO assignments (task_id, user_id) VALUES (1, 2);
INSERT INTO assignments (task_id, user_id) VALUES (1, 3);
INSERT INTO assignments (task_id, user_id) VALUES (2, 1);

INSERT INTO groups_users (group_id, user_id) VALUES (1, 1);
INSERT INTO groups_users (group_id, user_id) VALUES (1, 2);
INSERT INTO groups_users (group_id, user_id) VALUES (1, 3);
INSERT INTO groups_users (group_id, user_id) VALUES (2, 1);
INSERT INTO groups_users (group_id, user_id) VALUES (2, 3);
