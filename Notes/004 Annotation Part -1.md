## 1. @Entity (name = "table1")
- Create and table with name table1 and corresponding entity in java side will also be same with same name table1.

## 2. @Table
- just to change table name, entity name will remain as Class name and same will be used in HPQL,etc.

## pesist feild 
By Default all feild are persistable. use @transient to skip any feild. Other 2 annotations:

### 3.1 @Column(name = "Col1")
- can be applied on getter or variable, based on that it will fetch value. insetter append additional text like - 123, then it insert value+123 in db.

### 3.2 @basic(fetch = "" , option = "")
- Also marks thefeild as persistable and provides 2 additional settings as shown above.  

## 4. @Id
- to mark as Primary key

## 5. @temporal
- in java side complete date string is store but want to want store date only no time, then use temporal type to make such adjustment. this is just a scenario to undertand.

## 6. @clob, @blob or just @lob
- String if more than 255 than use clob or just lob
- If using byye array which could take more value than use blob.

## 7. @generated
- to Generate  ID automatically for serrogate keys.(non bussiness key, eg login id).
- Option : AUTO (default, it let hiberante to decide based on DB type.), IDENTITY - mySQL - yes, Oracle - no, TABLE - hibenate internally creates  a table to maintain next sequence, SEQUENCE - select nextVlaur from hibernate_sequence.

## 8. @Embedded and @Embeddable.
- eg : Address is Embeddable to Student. mark Address Class as Embeddable  and while defining inside STudent maek it as embedded.
- this will also add feilds of Address in Student.
- intially Student has 2 feild - name,id. After embedding Address it will have 4 new column - line1, line2, city and zip.
- @Embeddable Address {@col line1, @col line2, @col(name="CITY") city, @col zip}

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/0.PNG)

## 8.1. @EmbeddedId
- If we want to use Embedded object as primary Key.

## 8.2. @AttributeOverride
- scenario - Student has Home addr and office addr

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/1.PNG)

hibernate table:

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/2.PNG)

## 8.3. @ElementCollection - to map Collection
> eg: Student has collection of Address
> Student --> List<Address>

- Address is marked as Embeddable but while puting in Student mark it as @ElementCollection, not @Embedded.

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/4.PNG)

> hibernate table: **nameofEntity_nameofCollection** auto-generated name with **nameOfEntity_EntityPK** as FK. 

>Seems Like it internally created 1 to m mapping. one Student has many Address, with userId as FK.

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/5.PNG)

## 8.3.1.  @JoinColumn @JoinColumn in @ElementCollection
- modify auto-genarated table and column name --> nameofEntity_nameofCollection & nameOfEntity_EntityPK:

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/7.PNG)

![Architecture.png](https://github.com/lekhrajdinkar/hibernate/blob/master/Notes/asset/004/8.PNG)

