## Hibernate CRUD - project

### 1. Create Maven poject and added dependencies. Check POM.XML for other dependencies.

<dependency>

    <groupId>org.hibernate</groupId>	
    <artifactId>hibernate-entitymanager</artifactId>	
    <version>5.0.2.Final</version>
	
</dependency>

![image](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/003/1.PNG)

## ORM - STEPS
`1. create session factory SessionFactory factory = new Configuration().configure(configFile).buildSessionFactory();`

`2. Session session = factory.getCurrentSession();`

`3. session.beginTransaction();`

`4. session.save(tempStudent);`

`5. session.getTransaction().commit();`

## CRUD  Operation  - Create, Remove, Update and Delete.
### 1. CREATE
- session.save(instance of abc)

### 2. READ
- session.get(abc.class, id) // id is primary key, feild annotated with @Id

### 3. UPDATE

### 4. DELETE

