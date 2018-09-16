# Oracle DB server setup - DB1, DB2 and DB3 as shown below
**DB1**
URL orcl : jdbc:oracle:thin:@https://localhost:1521:orcl (not working, service down)

**DB2**
URL ng6: jdbc:oracle:thin:@https://localhost:1521:ng6 (up and running)

**DB3**
URL ng6(aws), aws-rds-oracle-db-1 : jdbc:oracle:thin:@aws-rds-oracle-db-1.cvhmhffpz03y.us-east-2.rds.amazonaws.com:1521:NG6  (up) 


***
# Connect to DB servers

**Steps for DB2**
1. Set up new Database : NG6
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/ng6_ng6ng6.PNG)
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/ng6_2.PNG)

2. Test Service for ng6
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/ng6-service-oracle.PNG)

3. Connect in SQL plus with system user
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/connected-to-db.PNG)

4. Connect with Dbeaver
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/oracle-localhost-ng6-1.PNG)

***

**Steps for DB1**
1. AWS > RDS > install Oracle instance
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/orcl_root_LekhrajOracle_June1818.PNG)

2. Connect with client - Not working

***

**Steps for DB3**
1. AWS > RDS > install Oracle instance
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/aws-instance-1.PNG)

2. Connect with client

2.1. SQL developer
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/aws_db-1.PNG)

2.2. Dbeaver
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/connected-to-aws-client-1.PNG)

***

# 2. My-SQL BD setup
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/MY_SQL.PNG)
![Oracle.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/DB_Setup/MY_SQL2.PNG)



