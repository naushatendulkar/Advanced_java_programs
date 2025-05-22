## 9a.Delete employee
9a. Read all the existing records from the table coffee which is from the database test and delete
an existing coffee product from the table with its id and display the rest of the records using
HTML and JSP to get the field and display the results respectively[output](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9a/9a1.jpg) [output2](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9a/9a2.jpg)
## 9b.Delete Employee Record
9b. Read all the existing records from the table coffee which is from the database test and query
coffee name starting with ‘D’ in the table using HTML and JSP to get the field and display the
results respectively[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9b/9b1.jpg) [output2](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9b/9b2.jpg)
## SQL QUERY
CREATE TABLE IF NOT EXISTS coffee (id int(5) NOT NULL<br>
AUTO_INCREMENT,coffee_name varchar(100) NOT NULL,priced int(5), PRIMARY KEY (id)<br>
);<br>
INSERT INTO coffee values (101,'Febary',120);<br>
INSERT INTO coffee values (102,'Royal',140);<br>
INSERT INTO coffee values (103,'Diamond',180);<br>
## 9c.Insert employee details
9c. Develop a JDBC project using MySQL to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and Generate
the report as follows for the table Emp (Emp_NO , Emp_Name, Basicsalary ) using HTML and JSP
to get the field and display the results respectively[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9c/9c.png)
## 9d.Delete Employee Record
9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9d/9d.png) [output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program9_empcoffee/9d/9d2.png)
## SQL QUERY

CREATE TABLE Emp (<br>
Emp_NO INTEGER PRIMARY KEY,<br>
Emp_Name TEXT NOT NULL,<br>
Basicsalary INTEGER<br>
);<br>


INSERT INTO Emp VALUES (101, 'Ramesh', 25000);<br>
INSERT INTO Emp VALUES (102, 'Ravi', 20000);<br>
INSERT INTO Emp VALUES (103, 'Sita', 30000);<br>
INSERT INTO Emp VALUES (104, 'John', 28000);<br>
INSERT INTO Emp VALUES (105, 'Anjali', 26000);<br>
