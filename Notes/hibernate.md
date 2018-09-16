## compare JDBC and hibernate:
** jdbc steps: ** 1. use dataource to make connection 2. create Model/dto 3. service to manipulate model 4. DDL to create tables 5. DAO/Mapper classes with vanilla/dirty SQL  staements.
** Hibernate : ** 1. Hibernate configuration/metadata 2. create entities 3. Same, service to manipulate model 4. skip 5. Hibernate api to persist,merge,find,HPQL

## Issues with JDBC:
1. tightly coupled ccode : java object > plain SQL to store them in database > if database table is changed then > java object has to be changes and vice version.
2. RDBMSs do not define anything similar to Inheritance, which is a natural paradigm in object-oriented programming languages.
3. No caching


## ORM/JPA - Object relation mapping
implementation : hibernate, eclipselink, openjpa, etc

## Feature
1. Internally uses - JDBC, Java Transaction API(JTA), and Java Naming and Directory Interface (JNDI)
2. Follow industry standards
3. Data layer - losely coupled code with service layer.

## Advantages offered by hibernate:
1. Transaction management and automatic key generation
2. A configurable facility for specifying mapping metadata. If there is change in the database or in any table, then you need to change the XML file properties only.
3. Lazy association fetching, and other optimization functions.
4. Provides simple APIs for storing and retrieving Java objects directly to and from the database.
5. Supports multiple database.

***

##

