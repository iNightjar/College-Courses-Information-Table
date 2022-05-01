/**select lecture_location , lecture_time from professor_lectures join professor on professor_lectures.professor_email=professor.email 
join courses on professor_lectures.course_code=courses.code ; 

SELECT * from courses c join professor p on p.email ='mohamedmohamed@email.com';

SELECT * from course_sections cs ;

SELECT * from course_lectures cl ;

SELECT name from professor ;

SELECT * from demonstrator d ;
SELECT name , lecture_location , lecture_time , section_location , section_time from courses where course_year = 'general year one' ;

SELECT * FROM courses  JOIN course_lectures WHERE course_lectures.professor_email = "mohamedmohamed@email.com";

SELECT *
FROM courses c 
JOIN course_sections cs
WHERE cs.demonstrator_email = "ahmedmohamed@email.com";

SELECT * 
FROM courses c ,professor p ,course_lectures cl 
WHERE cl.professor_email="mohamedmohamed@email.com" AND c.code =cl.course_code ;

insert into professor values("mostafamostafa@email.com", "mostafa mostafa", "mostafamostafapassword");


SELECT * from courses join professor on professor.email= 'mohamedmohamed@email.com';


SELECT
  *
FROM professor p 
JOIN course_lectures cl 
ON p.email = cl.professor_email 
join courses c on
	c.code  = cl.course_code 
-- join course_sections cs 
-- on cs.course_code = c.code
-- join demonstrator d 
-- on d.email = cs.demonstrator_email ; 
	
insert into professor values("mohamedmohamed@email.com", "mohamed mohamed", "mohamedmohamedpassword");
insert into professor values("ahmedahmed@email.com", "ahmed ahmed", "ahmedahmedpassword");
insert into professor values("mahmoudmahmoud@email.com", "mahmoud mahmoud", "mahmoudmahmoudpassword");
insert into professor values("hamidhamid@email.com", "hamid hamid", "hamid hamidpassword");
insert into professor values("ahmedhamid@email.com", "ahmed hamid", "ahmedhamidpassword"); */
/* insert into demonstrator values("ahmedmohamed@email.com", "ahmed mohamed", "ahmedmohamedpassword");
 insert into courses values("first12345", "princples of programming in c++", "general year one", 
"hall 1 , first floor" , "9 am" ,"section 301 ", "11 am");
insert into course_lectures values("mohamedmohamed@email.com","first12345");
insert into course_sections values("ahmedmohamed@email.com","first12345"); 
	
	
SELECT * from professor ;
SELECT * from demonstrator ; */

