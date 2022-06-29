create table Department (Department_id INT,department_head_id INT,department_name VARCHAR(50),location VARCHAR(50), PRIMARY KEY (`Department_id`));
insert into Department (Department_id, department_head_id, department_name, location) values (1, 1, 'Emergency', '02017 Bluestem Plaza');

create table Doctor (Doctor_id INT,Department_id INT,first_name VARCHAR(50),middle_name VARCHAR(50),last_name VARCHAR(50),gender VARCHAR(50),Phone VARCHAR(50), PRIMARY KEY (`Doctor_id`, `Department_id`));
insert into Doctor (Doctor_id, Department_id, first_name, middle_name, last_name, gender, Phone) values (1, 1, 'Walton', 'Isidro', 'Seeviour', 'M', '693-995-3568');
insert into Doctor (Doctor_id, Department_id, first_name, middle_name, last_name, gender, Phone) values (2, 2, 'Omero', 'Shermy', 'Liquorish', 'M', '945-240-5536');
insert into Doctor (Doctor_id, Department_id, first_name, middle_name, last_name, gender, Phone) values (3, 3, 'Wittie', 'Carlos', 'Scarlan', 'M', '347-576-5634');
insert into Doctor (Doctor_id, Department_id, first_name, middle_name, last_name, gender, Phone) values (4, 4, 'Dorian', 'Myrtle', 'Parmby', 'F', '726-695-6187');
insert into Doctor (Doctor_id, Department_id, first_name, middle_name, last_name, gender, Phone) values (5, 5, 'Myron', 'Bartie', 'Dust', 'M', '575-255-0049');

create table Emergency_contact (patient_id INT,name VARCHAR(45),address VARCHAR(50),gender VARCHAR(50),phone VARCHAR(50),relationship VARCHAR(50),  PRIMARY KEY (`Patient_id`));
insert into Emergency_contact (patient_id, Name, address, gender, phone, relationship) values (1, 'lea', '4 Petterle Place', 'F', '477-916-6935', 'Mother');
insert into Emergency_contact (patient_id,Name, address, gender, phone, relationship) values (2, 'bob', '00 Schlimgen Circle', 'M', '949-646-1484', 'Father');
insert into Emergency_contact (patient_id,Name, address, gender, phone, relationship) values (3, 'valerie', '6 Mandrake Point', 'F', '573-153-9104', 'Sister');
insert into Emergency_contact (patient_id,Name, address, gender, phone, relationship) values (4, 'grace', '267 Kennedy Pass', 'F', '957-475-3775', 'Mother');
insert into Emergency_contact (patient_id,Name, address, gender, phone, relationship) values (5, 'dan','3 Loomis Park', 'M', '582-201-1534', 'Uncle');

create table Patient (Patient_id INT,first_name VARCHAR(50),middle_name VARCHAR(50),last_name VARCHAR(50),gender VARCHAR(50),Phone VARCHAR(50),address VARCHAR(50),DOB DATE,EMC_P_name VARCHAR(50), PRIMARY KEY (`Patient_id`),
  INDEX `fk_Patient_Dependent1_idx` (`EMC_P_name` ASC));
insert into Patient (Patient_id, first_name, middle_name, last_name, gender, Phone, address, DOB, EMC_P_name) values (1, 'Roseanne', 'Stormie', 'Glasbey', 'F', '364-580-1483', '442 Surrey Pass', '1984-12-5', 'Cynthy');
insert into Patient (Patient_id, first_name, middle_name, last_name, gender, Phone, address, DOB, EMC_P_name) values (2, 'Ber', 'Padget', 'Magenny', 'M', '485-232-8173', '124 Shoshone Terrace', '1984-4-10', 'Syman');
insert into Patient (Patient_id, first_name, middle_name, last_name, gender, Phone, address, DOB, EMC_P_name) values (3, 'Parrnell', 'Alanson', 'Lant', 'M', '584-375-4929', '5858 Sheridan Trail', '1984-10-1', 'Niko');
insert into Patient (Patient_id, first_name, middle_name, last_name, gender, Phone, address, DOB, EMC_P_name) values (4, 'Giorgia', 'Cindee', 'Cruden', 'F', '411-265-4000', '25 Fordem Point', '1984-7-17', 'Sherry');
insert into Patient (Patient_id, first_name, middle_name, last_name, gender, Phone, address, DOB, EMC_P_name) values (5, 'Konstance', 'Bonny', 'Stot', 'F', '111-441-0082', '62 Northview Hill', '1982-4-1', 'Jonis');



create table Test (Test_id INT,Test_name VARCHAR(50),Date_time VARCHAR(50),fee REAL,PRIMARY KEY (`Test_id`));
insert into Test (Test_id, Test_name, Date_time, fee) values (1, 'Blood Test', '1985-2-6', 93);
insert into Test (Test_id, Test_name, Date_time, fee) values (2, 'Blood Test', '1985-10-6', 52);
insert into Test (Test_id, Test_name, Date_time, fee) values (3, 'Sugar Test', '1985-2-9', 69);
insert into Test (Test_id, Test_name, Date_time, fee) values (4, 'Heart', '1986-2-6', 60);

create table Visit (Doctor_id INT,Patient_P_id INT,Patient_Room_Room_No INT,Test_id INT,P_record_infor INT, PRIMARY KEY (`Doctor_id`, `Patient_P_id`, `Patient_Room_Room_No`, `Test_id`),
  INDEX `fk_Doctor_has_Patient_Patient1_idx` (`Patient_P_id` ASC, `Patient_Room_Room_No` ASC) ,
  INDEX `fk_Doctor_has_Patient_Doctor1_idx` (`Doctor_id` ASC) ,
  INDEX `Test_Patient_idx` (`Test_id` ASC));
insert into Visit (Doctor_id, Patient_P_id, Patient_Room_Room_No, Test_id, P_record_infor) values (1, 1, 1, 1, 1);
insert into Visit (Doctor_id, Patient_P_id, Patient_Room_Room_No, Test_id, P_record_infor) values (2, 2, 2, 2, 2);
insert into Visit (Doctor_id, Patient_P_id, Patient_Room_Room_No, Test_id, P_record_infor) values (3, 3, 3, 3, 3);
insert into Visit (Doctor_id, Patient_P_id, Patient_Room_Room_No, Test_id, P_record_infor) values (4, 4, 4, 4, 4);
insert into Visit (Doctor_id, Patient_P_id, Patient_Room_Room_No, Test_id, P_record_infor) values (5, 5, 5, 5, 5);

create table room (Room_No INT,location VARCHAR(50),Room_status ENUM('B', 'E'), PRIMARY KEY (`Room_No`),
  INDEX `P_visit_R_idx` (`Room_status` ASC));
insert into room (Room_No, location, Room_status) values (1, '2nd Floor', 'B');
insert into room (Room_No, location, Room_status) values (2, '2nd Floor', 'B');
insert into room (Room_No, location, Room_status) values (3, '2nd Floor', 'B');
insert into room (Room_No, location, Room_status) values (4, '2nd Floor', 'B');
insert into room (Room_No, location, Room_status) values (5, '2nd Floor', 'B');

create table Office (Off_no INT,Location VARCHAR(50),Doctor_id INT,  PRIMARY KEY (`Off_no`, `Doctor_id`),
  INDEX `fk_Office_Doctor1_idx` (`Doctor_id` ASC));
insert into Office (Off_no, Location, Doctor_id) values (1, '4th Floor', 1);

create table Nurse (nurse_id INT,first_name VARCHAR(50),middle_name VARCHAR(50),last_name VARCHAR(50),gender ENUM('F', 'M'), PRIMARY KEY (`Nurse_id`));
insert into Nurse (nurse_id, first_name, middle_name, last_name, gender) values (1, 'Kimberli', 'Tabbie', 'Twallin', 'F');
insert into Nurse (nurse_id, first_name, middle_name, last_name, gender) values (2, 'Bink', 'Emmery', 'Fabbri', 'M');
insert into Nurse (nurse_id, first_name, middle_name, last_name, gender) values (3, 'Caesar', 'Rouvin', 'Poundford', 'M');
insert into Nurse (nurse_id, first_name, middle_name, last_name, gender) values (4, 'Emiline', 'Valene', 'Phetteplace', 'F');
insert into Nurse (nurse_id, first_name, middle_name, last_name, gender) values (5, 'Ossie', 'Dex', 'Schneidau', 'M');

create table schedule (Sch_id INT,Date DATE,start_time VARCHAR(50),end_time VARCHAR(50),PRIMARY KEY (`Sch_id`));
insert into schedule (Sch_id, Date, start_time, end_time) values (1, '1985-2-6', '7:37 PM', '11:59 PM');
insert into schedule (Sch_id, Date, start_time, end_time) values (2, '1984-7-2', '4:15 PM', '11:59 PM');
insert into schedule (Sch_id, Date, start_time, end_time) values (3, '1985-8-3', '10:24 PM','11:59 PM');
insert into schedule (Sch_id, Date, start_time, end_time) values (4, '1985-2-14', '2:55 PM', '11:59 PM');
insert into schedule (Sch_id, Date, start_time, end_time) values (5, '1985-9-18', '2:20 PM', '11:59 PM');

create table Medical_team (medical_team_id INT, description VARCHAR(50), PRIMARY KEY (`medical_team_id`));
insert into Medical_team (medical_team_id, description) values (1, 'Surgery Operation of Mr Ber');

create table supervisee (Supervisee_id INT,first_name VARCHAR(50),middle_name VARCHAR(50),last_name VARCHAR(50),gender ENUM('F', 'M'),Phone VARCHAR(50),DOB DATE, PRIMARY KEY (`Supervisee_id`));
insert into supervisee (Supervisee_id, first_name, middle_name, last_name, gender, Phone, DOB) values (1, 'Katlin', 'Concettina', 'Finlator', 'F', '253-696-5592', '1984-12-12');
insert into supervisee (Supervisee_id, first_name, middle_name, last_name, gender, Phone, DOB) values (2, 'Fabio', 'Benedict', 'Tunn', 'M', '855-922-8497', '1983-1-29');
insert into supervisee (Supervisee_id, first_name, middle_name, last_name, gender, Phone, DOB) values (3, 'Elston', 'Waylon', 'Hofer', 'M', '818-621-6960', '1982-3-5');
insert into supervisee (Supervisee_id, first_name, middle_name, last_name, gender, Phone, DOB) values (4, 'Isabella', 'Allegra', 'Wingfield', 'F', '803-314-9319', '1981-2-4');
insert into supervisee (Supervisee_id, first_name, middle_name, last_name, gender, Phone, DOB) values (5, 'Irina', 'Aliza', 'Salmons', 'F', '189-697-4565', '1984-12-18');

create table Doctor_Schedule (Doctor_id INT,Doctor_Department_Dept_id INT,Schedule_Doc_id INT, PRIMARY KEY (`Doctor_id`, `Schedule_Doc_id`),
  INDEX `fk_Doctor_has_Schedule_Schedule1_idx` (`Schedule_Doc_id` ASC) ,
  INDEX `fk_Doctor_has_Schedule_Doctor1_idx` (`Doctor_id` ASC, `Doctor_Department_Dept_id` ASC));

insert into Doctor_Schedule (Doctor_id, Doctor_Department_Dept_id, Schedule_Doc_id) values (1, 1, 1);
insert into Doctor_Schedule (Doctor_id, Doctor_Department_Dept_id, Schedule_Doc_id) values (2, 2, 2);
insert into Doctor_Schedule (Doctor_id, Doctor_Department_Dept_id, Schedule_Doc_id) values (3, 3, 3);
insert into Doctor_Schedule (Doctor_id, Doctor_Department_Dept_id, Schedule_Doc_id) values (4, 4, 4);
insert into Doctor_Schedule (Doctor_id, Doctor_Department_Dept_id, Schedule_Doc_id) values (5, 5, 5);

create table Doctor_supervising_supervisee (Doctor_id INT,Supervisee_id INT,  PRIMARY KEY (`Doctor_id`, `Supervisee_id`),
  INDEX `fk_Doctor_has_Trainee doctor_Trainee doctor1_idx` (`Supervisee_id` ASC) ,
  INDEX `fk_Doctor_has_Trainee doctor_Doctor1_idx` (`Doctor_id` ASC) ,
  CONSTRAINT `fk_Doctor_has_Trainee doctor_Doctor1`
    FOREIGN KEY (`Doctor_id`)
    REFERENCES `Doctor` (`Doctor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Doctor_has_Trainee doctor_Trainee doctor1`
    FOREIGN KEY (`Supervisee_id`)
    REFERENCES `Supervisee` (`Supervisee_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
insert into Doctor_supervising_supervisee (Doctor_id, Supervisee_id) values (1, 1);

create table Doctor_leading_Medical_team (Doctor_id INT,Medical_team_id INT, PRIMARY KEY (`Doctor_id`, `Medical_team_id`),
  INDEX `fk_Doctor_has_Medical team_Medical team1_idx` (`Medical_team_id` ASC) ,
  INDEX `fk_Doctor_has_Medical team_Doctor1_idx` (`Doctor_id` ASC) ,
  CONSTRAINT `fk_Doctor_has_Medical team_Doctor1`
    FOREIGN KEY (`Doctor_id`)
    REFERENCES `Doctor` (`Doctor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Doctor_has_Medical team_Medical team1`
    FOREIGN KEY (`Medical_team_id`)
    REFERENCES `Medical_team` (`Medical_team_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
insert into Doctor_leading_Medical_team (Doctor_id, Medical_team_id) values (1, 1);

create table Specialization (Doctor_id INT,Types VARCHAR(50),Description VARCHAR(50), PRIMARY KEY (`Doctor_id`),
  CONSTRAINT `Sp_Doc`
    FOREIGN KEY (`Doctor_id`)
    REFERENCES `Doctor` (`Doctor_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
insert into Specialization (Doctor_id, Types, Description) values (1, 'nerology', null);
insert into Specialization (Doctor_id, Types, Description) values (2, 'pediatric', 'kids');
insert into Specialization (Doctor_id, Types, Description) values (3, 'Gynecology', 'Women');
insert into Specialization (Doctor_id, Types, Description) values (4, null, null);
insert into Specialization (Doctor_id, Types, Description) values (5, null, null);

create table Nurse_part_of_Medical_team (Nurse_Nurse_id INT,Medical_team_id INT,  PRIMARY KEY (`Nurse_Nurse_id`, `Medical_team_id`),
  INDEX `fk_Nurse_has_Medical team_Medical team1_idx` (`Medical_team_id` ASC) ,
  INDEX `fk_Nurse_has_Medical team_Nurse1_idx` (`Nurse_Nurse_id` ASC) ,
  CONSTRAINT `fk_Nurse_has_Medical team_Nurse1`
    FOREIGN KEY (`Nurse_Nurse_id`)
    REFERENCES `Nurse` (`Nurse_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Nurse_has_Medical team_Medical team1`
    FOREIGN KEY (`Medical_team_id`)
    REFERENCES `Medical_team` (`Medical_team_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
insert into Nurse_part_of_Medical_team (Nurse_Nurse_id, Medical_team_id) values (1, 1);


ALTER TABLE `Department` ADD CONSTRAINT `Dep_head_Doc` FOREIGN KEY (`Department_head_id`) REFERENCES `Doctor` (`doctor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE `Doctor` ADD CONSTRAINT `fk_Doctor_Department` FOREIGN KEY (`Department_id`) REFERENCES `Department` (`Department_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE `Patient` ADD CONSTRAINT `fk_Patient_Dependent1` FOREIGN KEY (`EMC_P_name`) REFERENCES `Emergency_Contact` (`Patient_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

ALTER TABLE `Office` ADD CONSTRAINT `fk_Office_Doctor1` FOREIGN KEY (`Doctor_id`) REFERENCES `Doctor` (`Doctor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION ;

 ALTER TABLE `Doctor_Schedule` ADD CONSTRAINT `fk_Doctor_has_Schedule_Doctor1` FOREIGN KEY (`Doctor_id`) REFERENCES `Doctor` (`Doctor_id`) ON DELETE NO ACTION ON UPDATE NO ACTION ;
    ALTER TABLE `Doctor_Schedule` ADD CONSTRAINT `fk_Doctor_has_Schedule_Schedule1` FOREIGN KEY (`Schedule_Doc_id`) REFERENCES `Schedule` (`Sch_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
