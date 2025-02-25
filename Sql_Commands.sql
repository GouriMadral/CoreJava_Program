mysql> create database Task;
Query OK, 1 row affected (0.08 sec)

mysql> use Task;
Database changed
mysql> create table Emp(emp_id varchar(20) PRIMARY KEY NOT NULL,name v
archar(20) NOT NULL,mobile_no varchar(20) NOT NULL,address varchar(50)
 NOT NULL,salary int NOT NULL);
Query OK, 0 rows affected (0.05 sec)

mysql> desc Emp;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| emp_id    | varchar(20) | NO   | PRI | NULL    |       |
| name      | varchar(20) | NO   |     | NULL    |       |
| mobile_no | varchar(20) | NO   |     | NULL    |       |
| address   | varchar(50) | NO   |     | NULL    |       |
| salary    | int         | NO   |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
5 rows in set (0.02 sec)

mysql> insert into Emp(emp_id,name,mobile_no,address,salary) values (101,'Gouri','8766082276','Solapur',50000),
    -> (102,'Rakshita','9764875692','Pune',40000),
    -> (103,'Nikita','7579847948','Andur',50000),
    -> (104,'Neha','7905679587','Solapur',30000),
    -> (105,'Laxmi','8684709356','Pune',20000);
Query OK, 5 rows affected (0.02 sec)
Records: 5  Duplicates: 0  Warnings: 0

mysql> select * from Emp;
+--------+----------+------------+---------+--------+
| emp_id | name     | mobile_no  | address | salary |
+--------+----------+------------+---------+--------+
| 101    | Gouri    | 8766082276 | Solapur |  50000 |
| 102    | Rakshita | 9764875692 | Pune    |  40000 |
| 103    | Nikita   | 7579847948 | Andur   |  50000 |
| 104    | Neha     | 7905679587 | Solapur |  30000 |
| 105    | Laxmi    | 8684709356 | Pune    |  20000 |
+--------+----------+------------+---------+--------+
5 rows in set (0.00 sec)

mysql> select * from Emp where name LIKE 'G%';
+--------+-------+------------+---------+--------+
| emp_id | name  | mobile_no  | address | salary |
+--------+-------+------------+---------+--------+
| 101    | Gouri | 8766082276 | Solapur |  50000 |
+--------+-------+------------+---------+--------+
1 row in set (0.00 sec)

mysql> select * from Emp where name LIKE 'R_______';
+--------+----------+------------+---------+--------+
| emp_id | name     | mobile_no  | address | salary |
+--------+----------+------------+---------+--------+
| 102    | Rakshita | 9764875692 | Pune    |  40000 |
+--------+----------+------------+---------+--------+
1 row in set (0.00 sec)

mysql> select * from Emp where name LIKE '%a';
+--------+----------+------------+---------+--------+
| emp_id | name     | mobile_no  | address | salary |
+--------+----------+------------+---------+--------+
| 102    | Rakshita | 9764875692 | Pune    |  40000 |
| 103    | Nikita   | 7579847948 | Andur   |  50000 |
| 104    | Neha     | 7905679587 | Solapur |  30000 |
+--------+----------+------------+---------+--------+
3 rows in set (0.00 sec)

mysql> update Emp set salary=60000 where emp_id=101;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from Emp;
+--------+----------+------------+---------+--------+
| emp_id | name     | mobile_no  | address | salary |
+--------+----------+------------+---------+--------+
| 101    | Gouri    | 8766082276 | Solapur |  60000 |
| 102    | Rakshita | 9764875692 | Pune    |  40000 |
| 103    | Nikita   | 7579847948 | Andur   |  50000 |
| 104    | Neha     | 7905679587 | Solapur |  30000 |
| 105    | Laxmi    | 8684709356 | Pune    |  20000 |
+--------+----------+------------+---------+--------+
5 rows in set (0.00 sec)

mysql> delete from Emp where salary<30000;
Query OK, 1 row affected (0.01 sec)

mysql> select * from Emp;
+--------+----------+------------+---------+--------+
| emp_id | name     | mobile_no  | address | salary |
+--------+----------+------------+---------+--------+
| 101    | Gouri    | 8766082276 | Solapur |  60000 |
| 102    | Rakshita | 9764875692 | Pune    |  40000 |
| 103    | Nikita   | 7579847948 | Andur   |  50000 |
| 104    | Neha     | 7905679587 | Solapur |  30000 |
+--------+----------+------------+---------+--------+
4 rows in set (0.00 sec)
