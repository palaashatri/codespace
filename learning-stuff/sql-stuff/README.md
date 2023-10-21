# SQL_Activity_DPS_JAVA

SQL Activities for Genesis 2021

## Activity-1

1. Create the table name: productions

```sql
CREATE TABLE productions (
    Productionid INT(5) PRIMARY KEY, 
    Productionname VARCHAR(30), 
    Address VARCHAR(40), 
    Startyear YEAR, 
    Ownername VARCHAR(20) 
    );
```

```sql
INSERT INTO productions VALUES 
(9091,"Arkamediaworks","Hyderabad",2001,"Shobu Yarlagadda"),
(8892,"Lyca Productions","Chennai",2014,"Subaskaran"),
(1010,"Hari Om Entertainment","Mumbai",2008,"Akshay Kumar"),
(1988,"Red Chillies Entertainment","Mumbai",2003,"Shah Ruck"),
(1899,"Viacom18 Studios","Mumbai",2008,"Ajit Andhare"),
(7882,"DVV Entertainments","Hyderabad",1993,"DVV Danayya"),
(6773,"Hombale Flims","Bangalore",1995,"Vijay"),
(7682,"Mythri Movie Makers","Hyderabad",2015,"Naveen Yerneni"),
(1854,"Junglee Pictures","Mumbai",2014,"Vineeth Jain"),
(2341,"CRM","Bangalore",2017,"Manohar"),
(1111,"STP","Chennai",2018,"Sree");
```

2. Create the table name: movie

```sql
CREATE TABLE movie (
    Movieid INT(5) PRIMARY KEY, 
    Moviename VARCHAR(30), 
    Heroname VARCHAR(30), 
    Heroine VARCHAR(30),
    Releaseddate DATE, 
    Language VARCHAR(15), 
    Length INT(2), 
    Movietype VARCHAR(25), 
    Productionid INT(5),
    FOREIGN KEY (Productionid) REFERENCES productions(Productionid) ON UPDATE CASCADE ON DELETE CASCADE
    );
```

```sql
INSERT INTO movie VALUES 
(201,"Bahubali – The Beginning", "Prabhas", "Tamannah",20150710,"Telugu",21," Drama Fantasy", 9091),
(501,"2.0", "Rajnikanth", "Amy",20181129," Tamil", 20,"Scientific", 8892),
(577, "Aval", "Siddharth", "Andrea", 20171103, "Tamil", 14 ,"Horror", 1899),
(101, "Holiday", "Akshay Kumar" ,"Sonakshi" ,20140606, "Hindi" ,15 ,"Crime Thriller", 1010),
(151, "Zero", "Shah ruck" ,"Katrina Kaif", 20181221 ,"Hindi" ,16, "Scientific" ,1988),
(131, "Padmavaat", "Shahid Kapoor" ,"Deepika Padukone" ,20180125 ,"Hindi" ,21 ,"Drama Epic" ,1899),
(146, "Andhadhun", "Ayushmann", "Radika Apte", 20181005 ,"Hindi", 16 ,"Crime Thriller", 1899),
(231, "Bharath Ane nenu", "Mahesh Babu" ,"Kiara" ,20180420 ,"Telugu" ,15 ,"Thriller", 7882),
(244, "Gruham", "Siddharth" ,"Andrea" ,20181117 ,"Telugu" ,14 ,"Horror", 1899),
(337, "K G F chapter 1", "Yash" ,"Srinithi Shetty" ,20181221 ,"Kannada" ,21 ,"Action Thriller", 6773),
(224, "Rangasthalam", "Ram Charan", "Samatha" ,20180330, "Telugu", 17 ,"Drama Period", 7682),
(136, "Badhaai Ho", "Ayushmann", "Neena" ,20181018, "Hindi" ,14, "Drama Comedy", 1854),
(441, "The Villain", "Sudeep" ,"Amy" ,20181018, "Kannada", 16 ,"Drama", 2341),
(206, "Maryada Ramanna", "Sunil", "Saloni", 20100723, "Telugu" ,19 ,"Drama", 9091),
(211, "Khaidi No. 150", "chiranjeevi" ,"Kajal" ,20170111, "Telugu", 20 ,"Drama Thriller", 8892),
(188, "Rangoon", "Saif Ali Khan", "Kangana", 20170224 ,"Hindi" ,15 ,"Drama", 1899),
(189, "The House Next Door", "Siddharth", "Andrea", 20171110 ,"Hindi", 14 ,"Horror", 1899),
(267,"Anaganaga O Dheerudu", "Siddharth", "Shruthi", 20140114, "Telugu" ,16, "Fantasy", 9091);
```

### SQL Fundamentals Query

1. Display the name of movies, movie type is starts with Drama: ```SELECT * FROM movie WHERE Movietype LIKE 'Drama%';```
2. Display the movies acted by actor Ayushmann: ```SELECT * FROM movie WHERE Heroname='Ayushmann';```
3. Display the COUNT of movies, having length above 18: ```SELECT COUNT(Length) FROM movie WHERE length>18;```
4. Display the movie having minimum length: ```SELECT Moviename , MIN(length) FROM movie;```
5. Display all the details of movie, the language that first name starts with ‘T’: ```SELECT * FROM movie WHERE language LIKE 'T%';```
6. Display the movie name, hero name, heroine name whose having maximum length: ```SELECT Moviename,Heroname ,Heroine  , MAX(length) FROM movie;```
7. Display the movie name, hero name, heroine name the movie released after 15 march 2018: ```SELECT Moviename,Heroname ,Heroine FROM movie WHERE Releaseddate > 20180315;```
8. Display the COUNT of thriller movies: ```SELECT COUNT(Movietype) FROM movie WHERE Movietype='Thriller';```
9. Display the COUNT of movies whose released before 15 march 2018: ```SELECT * from movie WHERE Releaseddate < 20180315;```
10. Display the release date of the movie name ‘Zero’: ```SELECT Releasedate FROM movie WHERE Moviename='Zero';```
11. Display the actor name that acted with ‘Amy’: ```SELECT Heroname FROM movie WHERE Heroine='Amy';```
12. Display the COUNT of maximum movies released in a month of October: ```SELECT COUNT(*) FROM movie WHERE  ;```
13. Display the movienames whose production id is same for different languages: ```SELECT * FROM movie WHERE  ;```

### SQL Advanced Query

1. Write the query to display productionid, production name with total number movies produced by each : ```SELECT productions.Productionid, Productionname, COUNT(Productionname) AS COUNT FROM movie INNER JOIN productions WHERE productions.Productionid=movie.Productionid GROUP BY movie.Productionid ORDER BY movie.Productionid;```
2. Write the query to display production name, owner name have produced more than 2 movies : ```SELECT Productionname, Ownername, Moviename FROM movie INNER JOIN productions ON movie.Productionid=productions.Productionid GROUP BY Productionname HAVING COUNT(Productionname)>2;```
3. Write the query to display production name, owner name have produced maximum movies : ```SELECT Productionname, Ownername, Moviename FROM movie INNER JOIN productions ON movie.Productionid=productions.Productionid GROUP BY Productionname HAVING COUNT(Productionname)=(SELECT COUNT(productionid) as COUNT FROM movie GROUP BY productionid ORDER BY COUNT(productionid) DESC LIMIT 1);```
4. Write the query to display the moviename, heroname and productionname acted in the producer name= ’Subaskaran’ : . ```SELECT Moviename, Heroname, Productionname FROM movie INNER JOIN productions ON movie.Productionid=productions.Productionid WHERE Ownername = "Subaskaran";```
5. Write the query to display the moviename, heroname whose productionid ends with 82 : ```SELECT Moviename, Heroname FROM movie WHERE Productionid LIKE "%82";```
6. Write the query to display the productionname, ownername who has not produced the movie :```SELECT productions.productionid, COUNT(movie.productionid) FROM productions LEFT JOIN movie ON productions.productionid=movie.productionid GROUP BY productions.productionid;```
7. Write the query to display the productionname, ownername who has not produced the ‘hindi’ movie : ```SELECT distinct productionname, ownername FROM productions INNER JOIN movie on productions.productionid=movie.productionid WHERE language!="Hindi";```
8. Write the query name to display the heroinename who acted in the different productions but not in same production id : ```SELECT heroine FROM movie GROUP BY heroine HAVING COUNT(distinct movie.productionid)>1;```
9. Write the query to display the heroname who acted in maximum languages.
10. Write the query to display the production name, owner name who has produced movie for more languages.
11. Write the query to display the productionname, producername who has not produced any movie.

## Subquery Practice

* Create A CUSTOMER table:

```sql
CREATE TABLE CUSTOMERS(
    ID INT(4), 
    NAME VARCHAR(30), 
    AGE INT(4), 
    ADDRESS VARCHAR(30), 
    SALARY VARCHAR(10)
    );
```

* Insert into CUSTOMER table :

```sql
INSERT INTO CUSTOMERS VALUES
('1', 'Ramesh', '35', 'Ahmedabad', '2000.00'),
('2', 'Khilan', '25', 'Delhi', '1500.00'),
('3', 'kaushik', '23', 'Kota', '2000.00'),
( '4', 'Chaitali', '25', 'Mumbai', '6500.00'),
('5', 'Hardik', '27', 'Bhopal', '8500.00'),
('6', 'Komal', '22', 'MP', '4500.00'),
( '7', 'Muffy', '24', 'Indore', '10000.00')
;
```

* Show Table :

```sql
SELECT * FROM CUSTOMERS;
```

* Subquery with Select Statement :

```sql
SELECT * FROM CUSTOMERS WHERE ID IN (SELECT ID FROM CUSTOMERS WHERE SALARY > 4500);
```

* Choose the agr and address of customers whose salary is 2000.00 :

```sql
SELECT AGE,ADDRESS FROM CUSTOMERS WHERE SALARY IN(SELECT SALARY FROM CUSTOMERS WHERE SALARY=2000.00);
```

* Second Largest Salary :

```sql
SELECT MAX(SALARY) FROM CUSTOMERS WHERE SALARY NOT IN(SELECT MAX(SALARY) FROM CUSTOMERS);
```

## Procedure Practice

* Create A CUSTOMER table:

```sql
CREATE TABLE CUSTOMERS(
    ID INT(4), 
    NAME VARCHAR(30), 
    AGE INT(4), 
    ADDRESS VARCHAR(30), 
    SALARY VARCHAR(10)
    );
```

* Insert into CUSTOMER table :

```sql
INSERT INTO CUSTOMERS VALUES
('1', 'Ramesh', '35', 'Ahmedabad', '2000.00'),
('2', 'Khilan', '25', 'Delhi', '1500.00'),
('3', 'kaushik', '23', 'Kota', '2000.00'),
( '4', 'Chaitali', '25', 'Mumbai', '6500.00'),
('5', 'Hardik', '27', 'Bhopal', '8500.00'),
('6', 'Komal', '22', 'MP', '4500.00'),
( '7', 'Muffy', '24', 'Indore', '10000.00')
;
```

* Choose the agr and address of customers whose salary is 2000.00 :

```sql
delimiter $$
create procedure sal2k()
begin
SELECT AGE,ADDRESS FROM CUSTOMERS WHERE SALARY IN(SELECT SALARY FROM CUSTOMERS WHERE SALARY=2000.00);
end $$
delimiter ;
call sal2k();
```

* Create a procedure and use if else :

```sql
delimiter $$
create procedure Cust_ID()
begin
select NAME, AGE, SALARY, if(creditLimit>7000,'Premium','General') as Level
from customers;
end $$
delimiter ;
call Cust_ID();
```

* Create a procedure and use case statement on it :

```sql
delimiter $$
create procedure customer_ranking()
begin
select ID, NAME, AGE,SALARY,creditLimit,
case
when SALARY=1000 then 'Part-time'
when SALARY=1500 then 'Casual'
when SALARY=2000 then 'Seasonal employees'
when SALARY=6500 then 'Temporary employees'
when SALARY=8500 then 'Leased employees'
when SALARY=4500 then 'Leased employees'
end as type_of_emp
from customers;
end $$
delimiter ;
call customer_ranking();
```
