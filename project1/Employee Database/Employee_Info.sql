CREATE TABLE Staff_info(
ID NUMBER(5) PRIMARY KEY,
FIRST_NAME VARCHAR2(15),
LAST_NAME VARCHAR2(15),
JOB_TITLE VARCHAR2(30),
SALARY DECIMAL(8,2),
ADDRESS VARCHAR2(50),
REIMBURSEMENT_AMOUNT DECIMAL(8,2),
REIMBURSEMENT_TYPE VARCHAR2(20),
PASSWORD VARCHAR2(20)
);

DROP TABLE 
staff_info;
SELECT *
FROM staff_info;

INSERT INTO staff_info (ID, FIRST_NAME, LAST_NAME, JOB_TITLE, SALARY, ADDRESS, REIMBURSEMENT_AMOUNT, REIMBURSEMENT_TYPE, PASSWORD)
values (12345, 'Clark', 'Kent', 'Police Captain', 92400.72, '344 Clinton St. Apt#3B Metropolis, Delaware 12345', null, null, 'Krypton');

INSERT INTO staff_info (id, first_name, last_name, job_title, salary, address, reimbursement_amount, reimbursement_type,  password)
values (32415, 'Barry', 'Allen', 'Forensic Scientist', 55660.37, '123 Central City Way Central City, Ohio 12390', 0.00, '', 'Flash');

INSERT INTO staff_info (id, first_name, last_name, job_title, salary, address, reimbursement_amount, reimbursement_type, password)
values (54321, 'Bruce', 'Wayne', 'Detective', 85020.38, '1007 Mountain Drive Gotham City, New Jersey 28490', 0.00, '', 'iamBatman');

INSERT INTO staff_info (id, first_name, last_name, job_title, salary, address, reimbursement_amount, reimbursement_type, password)
values(23415, 'Diana', 'Prince', 'Detective', 85020.38, '1300 Island Way Themyscira, Themyscira 11111', 0.00, '', 'Olympus');

SELECT * FROM STAFF_INFO
WHERE ID = 12345;

SELECT * FROM Staff_Info WHERE id =54321 AND password ='iamBatman';

CREATE TABLE Pending_Reimbursements(
FIRST_NAME VARCHAR2 (15) PRIMARY KEY,
LAST_NAME VARCHAR2 (15),
REIMBURSEMENT_AMOUNT NUMBER(6,2),
REIMBURSEMENT_TYPE VARCHAR2 (20)
);

SELECT *
FROM Pending_Reimbursements;
DROP TABLE
Pending_Reimbursements;
DELETE FROM pending_reimbursements
WHERE first_name = 'Barry';
COMMIT;

UPDATE staff_info
SET JOB_TITLE = 'Police Captain', SALARY = 92400.72, ADDRESS = '344 Clinton St. Apt#3B Metropolis, Delaware 12345'
WHERE FIRST_NAME = 'Clark';

UPDATE staff_info
SET JOB_TITLE = 'Forensic Scientist', SALARY = 55660.37, ADDRESS = '123 Central City Way Central City, Ohio 12390'
WHERE FIRST_NAME = 'Barry';

UPDATE staff_info
SET JOB_TITLE = 'Detective', SALARY = 85020.38, ADDRESS = '1007 Mountain Drive Gotham City, New Jersey 28490'
WHERE FIRST_NAME = 'Bruce';

UPDATE staff_info
SET JOB_TITLE = 'Detective', SALARY = 85020.38, ADDRESS = '1300 Island Way Themyscira, Themyscira 11111'
WHERE FIRST_NAME = 'Diana';
