insert into org_structure_schema.department (name, creation_date)
values ('Департамент 1', '2014-12-28');
insert into org_structure_schema.department (name, creation_date)
values ('Департамент 2', '2013-05-11');
insert into org_structure_schema.department (name, creation_date)
values ('Департамент 3', '2011-03-04');

insert into org_structure_schema.grade(grade_value)
values ('A');
insert into org_structure_schema.grade(grade_value)
values ('B');
insert into org_structure_schema.grade(grade_value)
values ('C');
insert into org_structure_schema.grade(grade_value)
values ('D');
insert into org_structure_schema.grade(grade_value)
values ('E');

insert into org_structure_schema.language(title)
values ('English');
insert into org_structure_schema.language(title)
values ('German');
insert into org_structure_schema.language(title)
values ('French');

insert into org_structure_schema.position (title)
values ('Разработчик');
insert into org_structure_schema.position (title)
values ('Тестировщик');
insert into org_structure_schema.position (title)
values ('Аналитик');
insert into org_structure_schema.position (title)
values ('Руководитель');

insert into org_structure_schema.specialization(title)
values ('Java');
insert into org_structure_schema.specialization(title)
values ('PHP');
insert into org_structure_schema.specialization(title)
values ('.Net');
insert into org_structure_schema.specialization(title)
values ('Android');
insert into org_structure_schema.specialization(title)
values ('Автотестирование');
insert into org_structure_schema.specialization(title)
values ('Системный аналитик');
insert into org_structure_schema.specialization(title)
values ('Бизнес аналитик');
insert into org_structure_schema.specialization(title)
values ('Линейный руководитель');
insert into org_structure_schema.specialization(title)
values ('Руководитель проекта');
insert into org_structure_schema.specialization(title)
values ('Руководитель департамента');

insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, specialization_id, is_department_manager)
values (1, 'Петров', 'Алексей', 'Васильевич', 'М', '1986-04-02', '+71234567890', 'petrov.av@test.com',
        '2012-07-26', 4, 250000.0, 5, 10, true);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, specialization_id)
values (1, 'Алексеев', 'Петр', 'Петрович', 'М', '1975-03-06', '+71234567891', 'aleks.p@test.com',
        '2010-06-20', 4, 150000.0, 4, 8);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, line_manager_id, grade_id, specialization_id)
values (1, 'Васильев', 'Дмитрий', 'Дмитриевич', 'М', '1990-11-04', '+71234567892', 'vasdd@test.com',
        '2017-01-16', 1, 65000.0, 2, 2, 1);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, dismissal_date, position_id,
                                           salary, line_manager_id, grade_id, specialization_id)
values (1, 'Дмитриева', 'Варвара', 'Юрьевна', 'Ж', '1989-10-13', '+71234567893', 'dmitr666@test.com',
        '2016-01-16', '2018-04-14', 1, 55000.0, 2, 1, 4);

insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, is_department_manager, specialization_id)
values (2, 'Кондратьев', 'Петр', 'Сергеевич', 'М', '1981-04-28', '+71234567812', 'kon55@test.com',
        '2009-10-04', 4, 210000.0, 4, true, 10);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, specialization_id)
values (2, 'Петренко', 'Анна', 'Вячеславовна', 'Ж', '1980-10-13', '+71234567894', 'petr123@test.com',
        '2010-12-04', 4, 120000.0, 3, 8);
insert into org_structure_schema.employee (department_id, last_name, first_name, sex, birth_date,
                                           phone_number, email, employment_date, dismissal_date, position_id,
                                           salary, line_manager_id, grade_id, specialization_id)
values (2, 'Александров', 'Владимир', 'М', '1987-08-09', '+71234567895', 'ava@test.com',
        '2012-08-01', '2013-04-14', 3, 25000.0, 6, 2, 6);

insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, is_department_manager, specialization_id)
values (3, 'Андреев', 'Андрей', 'Александрович', 'М', '1987-12-01', '+71234567832', 'aaa333@test.com',
        '2013-02-20', 4, 220000.0, 5, true, 10);
insert into org_structure_schema.employee (department_id, last_name, first_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, grade_id, specialization_id)
values (3, 'Абдулаев', 'Эльмир', 'М', '1988-01-09', '+71234567896', 'abd55@test.com',
        '2014-08-01', 4, 80000.0, 4, 8);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, dismissal_date, position_id,
                                           salary, line_manager_id, grade_id, specialization_id)
values (3, 'Кораблёва', 'Евгения', 'Петровна',  'Ж', '1992-05-05', '+71234567897', 'korabl@test.com',
        '2018-08-01', '2019-01-14', 2, 30000.0, 9, 1, 5);
insert into org_structure_schema.employee (department_id, last_name, first_name, mid_name, sex, birth_date,
                                           phone_number, email, employment_date, position_id,
                                           salary, line_manager_id, grade_id, specialization_id)
values (3, 'Иванова', 'Мария', 'Александровна',  'Ж', '1970-07-22', '+71234567898', 'ivanova215974@test.com',
        '2013-07-01', 3, 75000.0, 9, 3, 7);

insert into org_structure_schema.project(title)
values ('Проект 1');
insert into org_structure_schema.project(title)
values ('Проект 2');
insert into org_structure_schema.project(title)
values ('Проект 3');
insert into org_structure_schema.project(title)
values ('Проект 4');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (1, 1, 'UPPER_INTERMEDIATE');
insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (1, 2, 'INTERMEDIATE');
insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (1, 3, 'ELEMENTARY');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (2, 1, 'UPPER_INTERMEDIATE');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (3, 1, 'UPPER_INTERMEDIATE');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (4, 1, 'INTERMEDIATE');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (5, 1, 'INTERMEDIATE');
insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (5, 2, 'ELEMENTARY');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (6, 1, 'ELEMENTARY');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (7, 1, 'INTERMEDIATE');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (8, 1, 'ADVANCED');

insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (10, 1, 'INTERMEDIATE');
insert into org_structure_schema.language_proficiency (employee_id, language_id, level)
values (10, 3, 'ELEMENTARY');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (1, 'ООО Компания А', '2008-01-25', '2010-05-01');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (1, 'ЗАО Компания Б', '2011-02-24', '2012-06-20');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (2, 'ОАО Супер Компания', '2007-06-20', '2010-06-01');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (3, 'ОАО Девелопмент', '2014-06-20', '2014-12-20');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (3, 'ОАО Супер Девелопмент', '2015-01-15', '2016-05-11');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (3, 'ОАО Супер Девелопмент', '2016-06-02', '2016-12-25');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (4, 'Test Company', '2013-06-03', '2014-11-20');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (4, 'Test Company B', '2014-12-10', '2015-11-28');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (5, 'Test Company 111', '2000-11-11', '2008-02-05');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (6, 'ООО Тестовая компания', '2000-10-10', '2005-03-07');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (6, 'ООО Тестовая компания Б', '2005-04-10', '2010-11-04');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (7, 'ООО Тест', '2005-04-10', '2012-07-20');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (9, 'ООО Тест 222', '2005-06-25', '2013-08-11');

insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (11, 'ООО Тест 3', '2008-07-20', '2010-04-30');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (11, 'ООО Новый Тест', '2010-05-01', '2011-04-20');
insert into org_structure_schema.previous_experience (employee_id, company, start_date, end_date)
values (11, 'ООО Чистый Код', '2011-05-01', '2013-05-21');