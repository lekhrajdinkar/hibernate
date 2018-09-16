## Architecture:
![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/1.PNG)

## compare JDBC and hibernate:

**Jdbc Steps**
1. use dataource to make connection 2. create Model/dto 3. service to manipulate model 4. DDL to create tables 5. DAO/Mapper classes with vanilla/dirty SQL  staements.

**Hibernate Steps**
1. Hibernate configuration/metadata 2. create entities 3. Same, service to manipulate model 4. skip 5. Hibernate api to persist,merge,find,HPQL

## Issues with JDBC:
1. **tightly coupled ccode** : java object > plain SQL to store them in database > if database table is changed then > java object has to be changes and vice version.
2. RDBMSs do not define anything **similar to Inheritance**, which is a natural paradigm in object-oriented programming languages.
3. **No caching**


## ORM/JPA - Object relation mapping
implementation : hibernate, eclipselink, openjpa, etc

## Feature
1. Internally uses - JDBC, Java Transaction API(JTA), and Java Naming and Directory Interface (JNDI). Hibenate is another of Abstraction over JDBC. our code will use hibernate api and in backend it uses JDBC for all low level communication.

![JDBC-vs-Hib.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/2.PNG)

2. Follow industry standards
3. Data layer - losely coupled code with service layer.

## Advantages offered by hibernate:
1. **Transaction management** and automatic **key generation**. This is an optional object and Hibernate applications may choose not to use this interface, instead managing transactions in their own application code.
2. **Configurable** - A configurable facility for specifying mapping metadata. If there is change in the database or in any table, then you need to change the XML file properties only.
3. **performance** - Lazy association fetching, and other optimization functions.
4. **No SQL** - Provides simple APIs for storing and retrieving Java objects directly to and from the database.
5. Supports multiple database. (different Dialects for Different DB)

***

# udemy: Chad Darby - spring hibernate Course > Setion 18
## L-169
1. About Hibernate and ORM - basic
2. CRUD operation (Create/Read/update/Delete)- Basic code snippnet to show all hibernate does all low level code -- > session.get(abc.class, id) / session.createQuery("from abc").list() , etc

## L-170

