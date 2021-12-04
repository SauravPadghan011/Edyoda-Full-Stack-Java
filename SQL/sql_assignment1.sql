/*
Table 1: SalesPeople
Snum is Primary key
Sname is Unique constraint
Snum Sname City Comm

1001 Peel. London .12
1002  Serres Sanjose .13
1004 Motika London .11
1007 Rifkin Barcelona .15
1003 Axelrod Newyork .10

*/

CREATE TABLE SalesPeople(
Snum INT,
Sname VARCHAR(20),
City VARCHAR(20),
Comm DECIMAL(3,2),
PRIMARY KEY(Snum),
UNIQUE (Sname)
);
INSERT INTO SalesPeople VALUES(1001, "Peel", "London", .12);
INSERT INTO SalesPeople VALUES(1002, "Serres", "Sanjose", .13); 
INSERT INTO SalesPeople VALUES(1004, "Motika", "London", .11);
INSERT INTO SalesPeople VALUES(1007, "Rifkin", "Barcelona", .15);
INSERT INTO SalesPeople VALUES(1003, "Axelrod", "Newyork", .10);
 

/*
Table 2: Customers
Cnum is Primary Key
City has not null constraint .
Snum is foreign key constraint refers Snum column of SalesPeople table.
Cnum Cname City Snum

2001  Hoffman London 1001
2002  Giovanni Rome 1003
2003  Liu Sanjose 1002
2004  Grass Berlin 1002
2006 Clemens London 1001
2008 Cisneros Sanjose 1007
2007 Pereira Rome 1004

*/
CREATE TABLE Customers(
Cnum INT PRIMARY KEY,
Cname VARCHAR(20),
City VARCHAR(20) NOT NULL,
Snum INT,
FOREIGN KEY(Snum) REFERENCES SalesPeople(Snum)
);
INSERT INTO Customers VALUES(2001, "Hoffman", "London", 1001);
INSERT INTO Customers VALUES(2002, "Giovanni", "Rome", 1003);
INSERT INTO Customers VALUES(2003, "Liu", "Sanjose", 1002);
INSERT INTO Customers VALUES(2004, "Grass", "Berlin", 1002);
INSERT INTO Customers VALUES(2006, "Clemens", "London", 1001);
INSERT INTO Customers VALUES(2008, "Cisneros", "Sanjose", 1007);
INSERT INTO Customers VALUES(2007, "Pereira", "Rome", 1004);


/*
Table 3: Orders
Onum is Primary key
Cnum is foreign key refers to Cnum column of Customers table. Snum is foreign key refers Snum column of SalesPeople table.
Onum Amt Odate Cnum Snum

3001 18.69 3-10-1990 2008 1007
3003 767.19 3-10-1990 2001 1001
3002 1900.10 3-10-1990 2007 1004
3005  5160.45 3-10-1990 2003 1002
3006  1098.16 3-10-1990 2008 1007
3009 1713.23 4-10-1990 2002 1003
3007  75.75 4-10-1990 2004 1002
3008  4273.00 5-10-1990 2006 1001
3010  1309.95 6-10-1990 2004 1002
3011  9891.88 6-10-1990 2006 1001

*/
CREATE TABLE Orders(
Onum INT PRIMARY KEY,
Amt DECIMAL(7,2),
Odate DATE,
Cnum INT,
Snum INT,
FOREIGN KEY(Cnum) REFERENCES Customers(Cnum),
FOREIGN KEY(Snum) REFERENCES SalesPeople(Snum)
);

INSERT INTO Orders VALUES(3001,18.69,'1990-10-3', 2008, 1007);
INSERT INTO Orders VALUES(3003,767.19,'1990-10-3',2001,1001);
INSERT INTO Orders VALUES(3002,1900.10,'1990-10-3',2007,1004);
INSERT INTO Orders VALUES(3005,5160.45,'1990-10-3',2003,1002);
INSERT INTO Orders VALUES(3006,1098.16,'1990-10-3',2008,1007);
INSERT INTO Orders VALUES(3009,1713.23,'1990-10-4',2002,1003);
INSERT INTO Orders VALUES(3007,75.75,'1990-10-4',2004,1002);
INSERT INTO Orders VALUES(3008,4723.00,'1990-10-5',2006,1001);
INSERT INTO Orders VALUES(3010,1309.95,'1990-10-6',2004,1002);
INSERT INTO Orders VALUES(3011,9891.88,'1990-10-6',2006,1001);



/*On the basis of above tables perform given below questions
1. Count the number of Salesperson whose name begin with ‘a’/’A’.
Ans: SELECT COUNT(Sname) FROM SalesPeople WHERE Sname LIKE 'a%' or Sname LIKE 'A%';
+--------------+
| COUNT(Sname) |
+--------------+
|            1 |              
+--------------+
1 row in set (0.00 sec)


2. Display all the Salesperson whose all orders worth is more than Rs. 2000.
Ans: SELECT * FROM SalesPeople WHERE Snum In (SELECT Snum FROM Orders WHERE Amt>2000);
+------+--------+---------+------+
| Snum | Sname  | City    | Comm |
+------+--------+---------+------+
| 1001 | Peel   | London  | 0.12 |
| 1002 | Serres | Sanjose | 0.13 |
+------+--------+---------+------+
2 rows in set (0.00 sec)


3. Count the number of Salesperson belonging to Newyork.
Ans: SELECT COUNT(Snum) FROM SalesPeople WHERE City = 'Newyork';
+-------------+
| COUNT(Snum) |
+-------------+
|           1 |
+-------------+
1 row in set (0.00 sec)


4. Display the number of Salespeople belonging to London and belonging to Paris.
Ans: SELECT * FROM SalesPeople WHERE City = 'London' AND City = 'Paris';
Empty set (0.00 sec)


5. Display the number of orders taken by each Salesperson and their date of orders.
Ans: SELECT Odate,Snum,COUNT(*) FROM orders GROUP BY Odate,Snum;
+------------+------+----------+
| Odate      | Snum | COUNT(*) |
+------------+------+----------+
| 1990-10-03 | 1007 |        2 |
| 1990-10-03 | 1004 |        1 |
| 1990-10-03 | 1001 |        1 |
| 1990-10-03 | 1002 |        1 |
| 1990-10-04 | 1002 |        1 |
| 1990-10-05 | 1001 |        1 |
| 1990-10-04 | 1003 |        1 |
| 1990-10-06 | 1002 |        1 |
| 1990-10-06 | 1001 |        1 |
+------------+------+----------+
9 rows in set (0.00 sec)

*/


/*
SELECT COUNT(Sname) FROM SalesPeople WHERE Sname LIKE 'a%' or Sname LIKE 'A%';
SELECT * FROM SalesPeople WHERE Snum In (SELECT Snum FROM Orders WHERE Amt>2000);
SELECT COUNT(Snum) FROM SalesPeople WHERE City = 'Newyork';
SELECT * FROM SalesPeople WHERE City = 'London' AND City = 'Paris';
SELECT Odate,Snum,COUNT(*) FROM orders GROUP BY Odate,Snum;
*/