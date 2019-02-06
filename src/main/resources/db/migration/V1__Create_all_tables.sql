CREATE TABLE org_structure_schema.department (
	id                   serial  NOT NULL ,
	name                 varchar(255)  NOT NULL ,
	creation_date        date  NOT NULL ,
	CONSTRAINT pk_department_id PRIMARY KEY ( id )
 );

CREATE TABLE org_structure_schema.grade ( 
	id                   serial  NOT NULL ,
	grade_value          varchar(1) DEFAULT 'A' NOT NULL ,
	CONSTRAINT pk_grade_id PRIMARY KEY ( id ),
	CONSTRAINT uq_grade UNIQUE ( grade_value ) 
 );

CREATE TABLE org_structure_schema."language" ( 
	id                   serial  NOT NULL ,
	title                varchar(255)  NOT NULL ,
	CONSTRAINT pk_language_id PRIMARY KEY ( id ),
	CONSTRAINT uq_language_title UNIQUE ( title ) 
 );

CREATE TABLE org_structure_schema."position" ( 
	id                   serial  NOT NULL ,
	title                varchar(255)  NOT NULL ,
	CONSTRAINT pk_position_id PRIMARY KEY ( id ),
	CONSTRAINT uq_position UNIQUE ( title ) 
 );

CREATE TABLE org_structure_schema.project ( 
	id                   serial  NOT NULL ,
	title                varchar(255)  NOT NULL ,
	CONSTRAINT pk_project_id PRIMARY KEY ( id ),
	CONSTRAINT uq_project_title UNIQUE ( title ) 
 );

CREATE TABLE org_structure_schema.specialization ( 
	id                   serial  NOT NULL ,
	title                varchar(255)  NOT NULL ,
	CONSTRAINT pk_specialization_id PRIMARY KEY ( id ),
	CONSTRAINT uq_specialization UNIQUE ( title ) 
 );

CREATE TABLE org_structure_schema.employee ( 
	id                   serial  NOT NULL ,
	department_id        integer  NOT NULL ,
	last_name            varchar(255)  NOT NULL ,
	name                 varchar(255)  NOT NULL ,
	mid_name             varchar(255)   ,
	sex                  varchar(1)  NOT NULL ,
	birth_date           date  NOT NULL ,
	phone_number         varchar(255)  NOT NULL ,
	email                varchar(255)  NOT NULL ,
	employment_date      date  NOT NULL ,
	dismissal_date       date   ,
	position_id          integer  NOT NULL ,
	salary               float8  NOT NULL ,
	is_department_manager bool DEFAULT FALSE NOT NULL ,
	line_manager_id      integer  NOT NULL ,
	grade_id             integer  NOT NULL ,
	specialization_id    integer  NOT NULL ,
	CONSTRAINT pk_employee_id PRIMARY KEY ( id )
 );

CREATE TABLE org_structure_schema.employee_doc ( 
	id                   serial  NOT NULL ,
	employee_id          integer  NOT NULL ,
	file_name            varchar(255)  NOT NULL ,
	doc                  bytea  NOT NULL ,
	CONSTRAINT pk_employee_doc_id PRIMARY KEY ( id )
 );

CREATE TABLE org_structure_schema.internal_project_experience ( 
	id                   serial  NOT NULL ,
	employee_id          integer  NOT NULL ,
	project_id           integer  NOT NULL ,
	position_id          integer  NOT NULL ,
	project_manager_id   integer  NOT NULL ,
	start_date           date  NOT NULL ,
	end_date             date   ,
	CONSTRAINT pk_internal_project_experience_id PRIMARY KEY ( id )
 );

CREATE TABLE org_structure_schema.language_proficiency ( 
	id                   serial  NOT NULL ,
	employee_id          integer  NOT NULL ,
	language_id          integer  NOT NULL ,
	"level"              varchar(255)  NOT NULL ,
	CONSTRAINT pk_language_proficiency_id PRIMARY KEY ( id ),
	CONSTRAINT uq_language_proficiency UNIQUE ( employee_id, language_id ) 
 );

CREATE TABLE org_structure_schema.previous_experience ( 
	id                   serial  NOT NULL ,
	employee_id          integer  NOT NULL ,
	company              varchar(255)  NOT NULL ,
	start_date           date  NOT NULL ,
	end_date             date  NOT NULL ,
	CONSTRAINT pk_previous_experience_id PRIMARY KEY ( id )
 );

ALTER TABLE org_structure_schema.employee ADD CONSTRAINT fk_employee_department FOREIGN KEY ( department_id ) REFERENCES org_structure_schema.department( id );

ALTER TABLE org_structure_schema.employee ADD CONSTRAINT fk_employee_position FOREIGN KEY ( position_id ) REFERENCES org_structure_schema."position"( id );

ALTER TABLE org_structure_schema.employee ADD CONSTRAINT fk_employee_employee FOREIGN KEY ( line_manager_id ) REFERENCES org_structure_schema.employee( id );

ALTER TABLE org_structure_schema.employee ADD CONSTRAINT fk_employee_grade FOREIGN KEY ( grade_id ) REFERENCES org_structure_schema.grade( id );

ALTER TABLE org_structure_schema.employee ADD CONSTRAINT fk_employee_specialization FOREIGN KEY ( specialization_id ) REFERENCES org_structure_schema.specialization( id );

ALTER TABLE org_structure_schema.employee_doc ADD CONSTRAINT fk_employee_doc_employee FOREIGN KEY ( employee_id ) REFERENCES org_structure_schema.employee( id );

ALTER TABLE org_structure_schema.internal_project_experience ADD CONSTRAINT fk_internal_project_experience_employee FOREIGN KEY ( employee_id ) REFERENCES org_structure_schema.employee( id );

ALTER TABLE org_structure_schema.internal_project_experience ADD CONSTRAINT fk_internal_project_experience_project FOREIGN KEY ( project_id ) REFERENCES org_structure_schema.project( id );

ALTER TABLE org_structure_schema.internal_project_experience ADD CONSTRAINT fk_internal_project_experience FOREIGN KEY ( project_manager_id ) REFERENCES org_structure_schema.employee( id );

ALTER TABLE org_structure_schema.internal_project_experience ADD CONSTRAINT fk_internal_project_experience_position FOREIGN KEY ( position_id ) REFERENCES org_structure_schema."position"( id );

ALTER TABLE org_structure_schema.language_proficiency ADD CONSTRAINT fk_language_proficiency_employee FOREIGN KEY ( employee_id ) REFERENCES org_structure_schema.employee( id );

ALTER TABLE org_structure_schema.language_proficiency ADD CONSTRAINT fk_language_proficiency_language FOREIGN KEY ( language_id ) REFERENCES org_structure_schema."language"( id );

ALTER TABLE org_structure_schema.previous_experience ADD CONSTRAINT fk_previous_experience FOREIGN KEY ( employee_id ) REFERENCES org_structure_schema.employee( id );

