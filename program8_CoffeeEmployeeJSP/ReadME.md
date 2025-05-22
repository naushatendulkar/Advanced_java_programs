## 8a.  Insert coffee
Q1. Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively.[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8a_insertcoffee/8a1.jpg) 
 [output2](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8a_insertcoffee/8a2.jpg)
 
 8b. Update coffee
Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8b_updatecoffe/8b1.jpg) [output2](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8b_updatecoffe/8b1.jpg)

## SQL QUERY 
CREATE TABLE IF NOT EXISTS coffee (id int(5) NOT NULL
AUTO_INCREMENT,coffee_name varchar(100) NOT NULL,priced int(5), PRIMARY KEY (id)
);
INSERT INTO coffee values (101,'Febary',120);
INSERT INTO coffee values (102,'Royal',140);
INSERT INTO coffee values (103,'Diamond',180);
## 8c. Employee insert
 Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively[output](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8c_empinsert/8c.png)
## 8d. Employee update
8d. Develop a JDBC project using JDBC to update the fields empno, empname and basicsalary into
the table Emp of the database Employee using HTML and JSP to get the fields and display the
results respectively.[output1](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8d_empupdate/8d.png) 
[output2](https://github.com/naushatendulkar/Advanced_java_programs/blob/main/program8_CoffeeEmployeeJSP/8d_empupdate/8d2.png)

## SQL QUERY
 Create the Emp table<br>
CREATE TABLE Emp (
    Emp_NO INTEGER PRIMARY KEY,
    Emp_Name TEXT NOT NULL,
    Basicsalary INTEGER
);

 Insert 5 records into the Emp table
INSERT INTO Emp VALUES (101, 'Ramesh', 25000);
INSERT INTO Emp VALUES (102, 'Ravi', 20000);
INSERT INTO Emp VALUES (103, 'Sita', 30000);
INSERT INTO Emp VALUES (104, 'John', 28000);
INSERT INTO Emp VALUES (105, 'Anjali', 26000);
