insert into curriculum(id, name, active, core) values (1, 'Core Java', true, true);
insert into skill_id(skillid_id, skill_external_id) values (1, 1);
insert into skill_id(skillid_id, skill_external_id) values (2, 2);
insert into curriculum_skill(curriculum_id, skill_id) values (1, 1);
insert into curriculum_skill(curriculum_id, skill_id) values (1, 2);