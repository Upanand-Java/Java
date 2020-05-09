# Java Realtime Interview Question

1. Tell me about current project
2. Important components of JVM
https://javabeat.net/what-is-the-difference-between-jrejvm-and-jdk/
How .class file will be treated by JVM
3. Different memory in JVM
4. Where static method and variable store in memory ? And instance variable ?
-https://www.journaldev.com/4098/java-heap-space-vs-stack-memory
5. Where String get stored
6. S1 = new String ("Abc");
How many object will be created
7.s1 = "abc"
How many object will be created
https://www.journaldev.com/797/what-is-java-string-pool
8. If abc already present in heap memory again it will create in String constant pool ?
9. Is there any scenario that while creating string object it will get created in both memory?
https://www.journaldev.com/797/what-is-java-string-pool
10. Purpose of intern() method
-When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
This method always returns a String that has the same contents as this string but is guaranteed to be from a pool of unique strings.
11. Internal implementation of set
12. Insertion order in Map
13. What happens if we modify value of key in LinkedHashMap , insertion order will maintain or not ?
14. Difference between collection and stream
15. How to print list of integer using stream ?
16. Difference between iterator and stream
17. I have set of Integer , how to fetch integer from set which is multiple of 5 using stream api and how to collect all value in list ?
18. Set up of Hibernate in application ?
How data will interact with database ? Configuration of Hibernate
19. @Response Body can be used at which level ? Method or class level ?
20. Purpose of @ResponseBody
-http://websystique.com/springmvc/spring-mvc-requestbody-responsebody-example/
21.advantage of @RestController over @Controller
-http://websystique.com/springmvc/spring-mvc-requestbody-responsebody-example/
22. Testing framework
23. How to test Private method
24. Design Patterns --> (Singleton , Factory, Adapter)
25. How to deal with OutOfMemoryError ?

Mphasis 2

current role in project
- U are working as a developer/tester or fullstack
- Difference between comparable and comparator
- How will I create my own Singleton class

- How to break Singleton Design Pattern ?
https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/
- How will I create my own Immutable class ?(String and Wrapper Classes are Immutable in Java and all of them implements hashCode and equals method
https://howtodoinjava.com/java/basics/how-to-make-a-java-class-immutable/
https://dzone.com/articles/how-to-create-an-immutable-class-in-java
- Rules of overriding
https://crunchify.com/java-method-overriding-examples-and-concepts-overriding-rules/
- Method resolution of overloaded method i.e rules of overloading
- What is the use of static in overriding
- What is static ?
- What is static block , method and variable ?
https://www.dummies.com/programming/java/what-is-the-static-keyword-in-java/
- What is Singleton in spring and Java ?
- How will I create my own custom exception ?
- Internal implementation of hashmap
https://howtodoinjava.com/java/collections/hashmap/how-hashmap-works-in-java/
- Can we make Employee object as a key ?
- Default Implementation of hashcode and equals method ?
https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/
- Difference between spring and spring Boot or advantages of Spring Boot
https://dzone.com/articles/spring-vs-spring-boot
- How do I configure the things in spring Boot ? What all configuration I will use to connect with Database ?
- What all annotations u have used.?
- Difference between bean and component annotation ?
https://therealdanvega.com/blog/2017/05/17/spring-component-vs-bean
- SprintBootApplication takes care of @componentscan then why do we need component scan separately ?
- How sprinboot will know which one is controller class ? How sprinboot identify @controller , that mean which controller will get called
- Difference between spring data JPA and Hibernate 
- What is Spring Data ?
- Design Pattern
- How to design good custom key object for HashMap
- How to iterate Map,List,Set
- Why performance of Hashmap is less compare to list .?
- What is Spring Stereotype Annotations?
https://therealdanvega.com/blog/2017/03/27/spring-stereotype-annotations

Mphasis 3

- Tell me about yourself
- difference between Array and ArrayList
- can we create fix size arrayList ?
- I have initialized arraylist with 50 resource on boot up of the Application and it will be used on whole application
and it should not get modify but modules can be used in the whole Application. whatutility can i use here?
same thing with hashmap and hashSet , that should not be modify after initialization
- What is hash Collision ?
- How can we prevent hash collision ?
- Create our own immutable class and explain it
- Rules of overriding
- Difference between String Builder and String Buffer
- What is serialization
- What is serial version UUID ?
- What is deserialization ?
- Difference between ArrayList and LinkedList
- Difference between Set and List
- How to avoids insertion of duplicate element in list?(we can write our won arrayList to override add method)
- What is Spring core
- What is DI and IOC ?
- what is Spring container ?

Mphasis 4

- Brief about yourself
- difference between Java 8 and other version of Java
- Difference between Interface vs Functional interface
- Advantage of Default method
- How to avoid overriding of default method in child class ? I dont want implementing class to override default method.
how will we acheive it ?
- What have u used in collection?
- For iterating the list what did i use?
- have u used for loop and iterator to iterate over list
- difference  between for loop and iterator ? Why there are two things in java to provide iteration in java.?
- What is concurrent modification exception.?
- What framework have u used.?
- Have u used embedded server or any outside(external) server ?
- What are the starter project have u used in spring boot
- What is actuator ?
- difference between jdk and jre
- i have .class file compiled in mac machine and i have jdk and jre in windows , will i need jdk or jre will be 
sufficient to run .class in windows. and to run from maven build will i need jdk or jre ??
- so to run maven build , jdk is necessary or not ?
- Difference between throw and throws

Mphasis 5
- Tell me about yourself
- Tell about current application 
- Have u used MVC framework here in current project.?
- HAVE U wORKED ON MICROSERVICES APPLICATION IN CAREEER ?. is it microservice project or monolytic project.?
- Can we instantite Abstract class.?
-  How will you fulfill Gap of concrete method prsent in abstract class as I am not able to initialize Abstract class?
- How do you achieve inheritance in java ?
- what is the role of interface in java ?
- best OOPS concept in java ?
- signature of method overloading and overididng
- order of catch blocks under try block (Hierarchy of catch blocks)
- suppose  we have two exception ie fileNotFOund exception andIO exception inside catch block then which one will get caught ?
- Difference bw implementation of Multithreading using executor framework and Runnable interface.
- Which interface we can use executor interface
- Diference between runnable and callable
- different classes and interfaces in collection interface
- which one is better in Hashtable and concurrentHashMap and which onw will u use for better performance?
- what is serial Version UUID ? why is it required ?
- How autowired works in Spring MVC ?
- Scenario where we can use Qualififer Annotation ?
- what is IDEMPOTENT method in REST ?
- why should we use microservices over monolytic application ?
- How will achieve load balancing in microservices , 
	How within application level I can handle it(Application Gateway,)?
- How to fetch data from database ? details about HQL and Criteria API
- What kind of project I have worked on ? Agile or Waterfall ?
- where all we tracking task status , total time spend ?

Mind Tree interview Questions :
- Tell me about yourself
- Oops Concepts
- Rule of method Overriding
- Difference between Comparable and Comparator
- what is immutable in java and how to achieve the same.?
- Difference between iterator and ListIterator
- can we add element using Listiteraor ? or iterator ? will it throw concurrent modififcation excpetion?
- difference between hashMap vs ConcurrentHashMap deep knowledge
- Internal implementation of TreeSet
- whenever we create Treeset then how it is add in TreeSet
- Does hastable having any key value pair like map ?
- internal implentation of set
- How will i create  our own customised exception?
- program to find power of n without using inbuilt function.
- I have interger array , how will i find largest three number from integer array
- first duplicate character
- Modules I have worked on Spring framework
- Lifecycle of Spring Bean
- How many type of injection we have in Spring framework ?
- in which scenario I will use constructor and setter injection
- Spring Bean scope
- Functionality of prototype ? what do u mean by prototype bean scope
- Example of Global Session bean scope
- Did you work on Transaction ?
- What is dialect in hibernate?
- Hibernate Second level cache
- Example of second level cache
- what is cascade in Entity ?
- Real time Example of Many to Many Association
- Query to get 5th Highest salary from the employee table
- How do we find duplicate column in database table.
- HTTP methods in RESTful web service
- difference between PUT and POST
- Have u worked on swagger

Sapient

- About Current project
- What kind of technlogies u have used and how many team members.?
- Which version on Java ?
- Reason looking for another job
- OOPS Principles in core java
- Design patterns in Java
- Solid design Principles
- Understanding with Multithreading concepts
- What is Serialization ?
- Are u aware about searching , sorting , hashmap
- Garbage collections
- SQL 
- How to use Joins ?
- Spring AOP
- Transaction management in Spring
- L1 and L2 cache in hibernate
- Synchronization code for two thread or synchronization code of ten thread, which one is easier to write ?
- what is immutable object and how will i create immutable object in java .?
- is ++ operator is thread safe in java .?
- internal implemenatation of HashMap
- Can we guarantee garbage collection process ?
- How will we know memory used from java program ?
- Difference between a==b and a.equals(b)
- can we override static method in core java ?
- is it possible two unequal object have same hashcode ?
- How to check whether String is interger or not ?(Integer.parseInt(s))
- How will u reverse the string in java ?
- Difference between abstract class and interface ?
- Which is better ? Constructor or Setter injection ?
- Difference between inheritance and composition ?
- can we declare main method as final?
- can exception be rethrown ?
- how can we achieve safety of thread ?
- is it possible to start the thread twice .?
- when should we interrupt our thread .?
- Difference between notify and notifyAll
- what is the deadlock condition ?
- how will we detect deadlock condition ?
- How can we avoid deadlock condition  ?
- How will i achieve safety of thread .?
- What is the volatile keyword in java ?
- Implement producer consumer problem using blocking queue

-Siemens
-Data biz Solution both Round

Citius Manager Round

- About Myself
- Why did you leave HCL
- Why do you want to leave Infosys
- About Project
- Project Techincal Architecture diagram all the front end layer, backend layer and Database layer
- Find Non - Prime number, read input from command line argumnet till complete command line argument
- Any Question for me , 3 times.

Citius Tech Technical Round

- rate in core Java
- Basic oops concepts
- what is polymorphism
- what is runtime polymorphism
- Why cant compiler decide which method to run.?
- Rule of overrididng 
- Why visibiltiy of method cant reduce in child class
- why java does not allow to do this?
- Difference between String buffer vs String Builder
- HashMap Internal implementation
- How to sort ArrayList
- Comparable vs Comparator
- What module of Spring u have used
- How do u inject bean from one class to another class.?
- difference between DI and IOC
- Bean Life cycle
- Difference between setter and Constructor injection and when to use setter and constructor injection
- Employee needs an adrees bean , how to inject it?
- What kind of configuration
- Annotation based
- what all anootation we will use to to inject Adreess in Employee
- Component annotation
- How Spring application know where to look for my components
- How will we read database properties from application.properties file and pass it to DAO layer
- Annotation to read application.properties file
- What is EntityManager
- How to pass datasource to DAO
- High level of Spring MVC(flow of Spring MVC)
- If i am getting any SQL exception from Database then how will i customise it.?
- Spring advice controller
- Where should i patch it first if i am getting SQL exception in Database layer
- What is DTO and how it is difference from Business Objects and why do we use it.?
- we have same structure as DAO(Business Objects) and DTO then why do we need DTO
- what is REST .?
- what is idempotency in RESTful ?
- State should not get changed in idempotent method then what is state in this case.?
- Any Question for us .?
- 
- When do we use comparable and when do we use comparator
- What does Compare method returns
- Over view of Spring MVC
- Difference between Constructor and setter injection
- Configuration in Spring 
- Immutable class in java

Tech Mahindra
- what will indexOf method ArrayList will return if it dont find any element in arrayList ?(-1)
- difference between throw and throws
- How will i define my own exception
- Super class of exception hierarchy(Exception Hierarchy)
- How many kinds of error and exception we can have in java, which exception can we catch and we cant catch ?
- What is the exception we cannot predict that we cant manage in code that means its unpredictable that means 
	exception which which is nor possible to handle
- Collection Hierarchy
- Design pattern in java
- Singleton design pattern
- what is RESTful Web Service ?
- Real time example of restful API
- Difference between Sleep vs Wait

Aricent First Round

- What are you working on currently
- Briefly tell about collections and classes and interface present inside collection.
- Can i add duplicate key in hashmap ?
- what happend when we try to add duplicate key that means how Hashamp recognizes Duplicate key internally ?
- Method to delete node from LinkedList by using interal pointer only , without any head value
- Difference between Abstraction and interface
- Real time example of Abstract class and interface. whatever i used in project? any real time example ?
- Spring advice controller
- Difference between comparable and comparator and program on it

Aricent Second Round

1. Multithreading to print 1,3,5,7,9 and 2,4,6,8,10
2. First Repetitive Occurrence
3. Concurrent HashMap(is it possible to read and write at same bucket in hashmap ?)
4. Cache in Hibernate
5. Out of memory error
6. Dependency injection
7. Method in REST API
8. finally block
9. Hashcode and equals
10. Internal implementation of hashMap.
11. Serialization vs Deserialization
12. Difference between Spring and Spring Boot
13. Have u used Junit?
14. Have u used SOAP ?
15. Use of volatile keyword
16. CRUD Operation in RESTful API
17. Detail about delete method in HTTP

Software Solution First Round:
1. About yourself
2. New Feature of Java8
3. is Stream is better in performance compare to traditional for loop? for iterate thousands of elements ?
4. list.STream().ForEach(lamba expression). For each ka parameter is function interface . 
so what kind of functional interface ?
5. Which all functional interface have we used in terms of Java 8 features .?
6. like consumer, predicate, Supplier
7. Filter accept predicate functionl interface in lambdas expression
8. which functional interface accept map.filter() interface.
9. difference between lambdas and Anonymous class?
10. How method will get called using lamba expression as .class wont get create in lamba expression ?
11. what else do you know about java 81
12. How many abstract and default method can Functional interface have  ?
13. in term of multiple inheritance of interface if both interface having same default then we must have to
override default implemenatation and give our own implemenation and within implemenatation i can call implemenatation
of same method in interface using Interfacename.method
14. CompletableFuture in Java 8
15. @EnableAutoConfiguration vs @SprinBootApplication
16. You have used internal web service of spring or jersey ? - i have used restEasy
17. What is the use of Bean Annotation.?
18. if I dont provide Bean annotation then in that case also bean will be created by Spring. Suppose I have Employee class
annotated with @Component then spring will create Bean of This class while running the application then why 
should we use @Bean Annotation in configuration class ?? why should we write extra piece of code if 
spring by deafult is doing this?
19. can you tell me the situation where u have used @Bean annotation? in which situation we should write @Bean annotation and 
in which situation we should allows Spring to create Bean ?
20. difference between @Component vs @Repository 
21. Suppose i got uniqueConstarintException from hibernate 
22.difference between @Component and @Repository annotation(very important difference is there need to find out)
23. difference between @Resource and @Autowired annotation ?
24. difference between @Qualifier and @Autowired annotation. (use case of @Qualifier annotation)
25. As you have developed application from beginning then u might have used spring security. need to learn spring security.
26. String s1 = new String("Durga"), how many object will get created ?
27. what does intern() methods  do ?
28. difference between String s1 = new String("Durga") vs String s1 = "Durga"; and 
which is better and which one should we use .?
29. What is try with resources in Exception handling.?
30. Difference between checked and unchecked exception ?
31. If i am getting syntatic error in program then also i will get compilte time error so can we say syntatic errors
are checked exception ? as both are occuring at compile time only
32. Need to clear confusion between FileNotFoundException and IOException
33. why compiler forces us to handle checked exception ?i can have null pointer exception(unchecked exception) 
but compiler is not complaining ?
34. why IO Exception is the checked exception ?
35. how many catch block we can write after try ?
36. can we omit catch block 
37. Which type of exception is exception class ?
38. have you face any situation where you have first catch the exception and again you have rethrown the exception within
catch block ?
39. Have you thrown the exception from catch block ?
40. Suppose from Hibernate i got UniquesConstraintViolation exception it should get propagated to front end then how
should it be done ?(need to rethrown the exception from catch block. this the example of rethrown of exception).Did you
handle this kind of scenario in your project. I said by providing validation before hitting the database by we cant provide
validation of uniqueConstarintViolation Exception so how should we handle it ?
41. Interviee surprised with the answer that in repository u have used try with catch  ??? that means we should never write
try with catch in repository class.
42. Exception handling should be done which layer ??
43. How will you handle Hibernate exception ??
44. Exception handling framework of Spring ? what is it ?Have you used Spring advice controller or just read about it ?
45. when we do list.forEach in java 8, what is forEach ? is it method ?or static field ?
46. situation in which we need to read data very quickly then what should we use in collection framework ?
47. in which project situation we should use Set interface of collection ?
48. what is the use of Hashing in set interfcae ?
49. what is the Primary purpose of Hashing Algorithms ?
50. situation where i need to map Team with players that means one team should have 11 number of players. how will we map
in hibernate ?
51. when we are mapping player entity inside Team then what should be return type ?? I said List<Player> . then he asked 
can we use Set<Player> what would be the difference ?
52. How to do bidirectional mapping in hibernate Entities?
53. Lazy loading vs Eager loading in hibernate and which one to use in which scenario and how will it change at runtime.?
54. can you tell me exception hierarchy of Hibernate ?
55. which version of hibernate you are using ?
56. CriteriaBuilder of JPA
57. advantage of spring data JPA over Hibernate ORM ?
58. which version of Sprin are u using ?
59. Do you know about Java 9 ?
60. Any question from us ?
61. HTTP 2, Jersey, Vaadin, JPA and Hibernate, Spring Boot


Software Solution Second Round 

New features of Java 8
When should we use functional interface
Is functional interface introduced in Java 1.8 or was it before ?
Benefits of Java 8
Benefits of using stream
What is Builder Pattern
What is Factory Design Pattern
Advanced topic of REST
CRUD Operation using REST
Which task was the most difficult task and what was that and how did u complete it ?
How do you handle exception in application ?
How do you test business logic method ?
Jenkins , SonarQube
Which tool are you using to building the project ? What happens when you build the project ?
Are you aware Maven in detail or just basic commands ?
Basic commands to build the project in Maven
What is JPA
What is the concept of lazy loading and eager loading in ORM ?
What is the better practice of lazy and eager loading ?
In one case I need only parent entity data and in another case I need parent with children then how will  I implement it ? Should I use eager or lazy loading ? How will it change at runtime
What is the Cascade type in Hibernate ?
Configuration of Parent child relationship
When do(should) we use @ManytoMany annotations ?
What will be the table structure between two entities in case of Many to Many ? How should I configure it ?
Have you written hibernate query ?
Difference between hibernate query and HQL ?
Why do you want to leave Infosys ?


TCS

- Explain technical skills used in project
?? What is object ?
?? What is OOPS Concepts?
?? Static method overriding
?? Super() and this () within one Constructor
?? Instance Block vs Static Block
?? Why static block get executed first
?? Immutablity of object 
?? can we override final method ?
?? Difference between abstract and interface
?? Where should we use interface in project ?
?? I have same add method in two interface whenever I am implementing both interface which interface will understand the implementation ?
How ur class identity which interface is this add method belongs ?
?? Difference between List set and Map
?? Adding duplicate key in Hashmap ,
What will happen ?
?? How HashMap works ?
?? What is Big of n ? O(n)
?? How time complexity calculates ?
?? There is performances issue in real time project ? What could be general causes for performances issues in project ? And how will u resolve it
?? How will u resolve memory leakage?
?? When null pointer exception will be thrown ?
?? Comparable vs Comparator 
?? When will u go for Comparable and comparator ? Comparable is based on single object (Entity) but comparator is based on two object
?? Binary search
?? Bubble Sort
?? How to handle concurrentModification Exception
- what do you mean by schronization ?
- where will u prefer to write synchronized ?
- can you tell me multithreading concepts .?
- Lifecycle of Thread ?
- what Executor framework will do ?
- How many ways we can thread.?
- What is the benefits of using executor framework over traditional multithreading concepts .?
- Reverse a String
- Remove duplicate from array
- what is abstraction ?
- How we can achieve abstraction in Java
- where are we hiding internal implemenatation of serviceImpl class ? its still visible ?
- Proper definition of encapsulation ? what will we achieve after providing encapsulation ? - Binding the data in one Entity
- Why do we need setters and getters in Pojo?
- What is immutability ?
- what is polymorphism ?
- DO we need to override method present in super class .?
- what is inheritance.?
- What is Exception
- what is runtimeException and compileTimeException ?
- why we have two type of exception in Java .?
- Normally , can we handle Runtime Exception .?
- what about compileTimeException ? how will we handle compileTimeException ?
- after catching the exception what will we do  ?
- what is Collections Framework ?
- Advantage of collection Framework.?
- Default capacity of ArrayList  ?
- what is load factor ?
- hashmap internal implementation
- @Component vs @Bean
- what is the difference @Component and @Service
- Difference between PUT and POST method in RESTful web service
- can we use PUT for creating resource .?
- why do u want to change company .?

Cognizant First Round :

- Tell me about yourself
- Zuule in spring boot
- Swagger
- what is the use of JVM .?
- what is the use of class loader in JVM
- Draw Spring MVC life cycle like once request come 
- Difference between Controller and RestController
- What is the use of @ResponseBody .?
- Controller file of RestController with DTO
- We can give path details in @RestController("/")
- Which version of java
- what is the use of lamba expression .?
- write lamba Expression
- Why do use Inheritance ? what is the advantages ?
- Disadvantages of inheritance
- Reason to leave infosys
- Training for UI
- Need to learn Spring Boot in deep

Cognizant Second Round:

- Tell me about yourself , what you are , from where you belongs , Technology u use
- Whay are we using spring Boot .? advantages of Spring boot ?
- what starter(module) will u add in pom.xml for Web project in SpringBoot ?
- What all annotation u have used .?
- what is the use @Repository
- What is the difference @Controller and @RestController
- what is the use lambda expression ?
- How will i differences properties of DEV,UAT,PROD env .?
- what is caching .?
- if data has changed in DB then how cache will happen .?
- what are Microservices ?what are the advantage of Microservices.?
- Characteristisc of Microservices(easily deployable, auto scaling, loosely coupled)
- what is auto-scaling in project?
- can you please quickly write SpringBootApplication from scratch for fetching details from Database.?
- what annotation u have used in Repository layer .?
- what is the use of @Repository .?
- How will you configure Oracle Database in your project .?
- Have u experienced outOfMemoryError ? if you are getting OOM then how will you debug it .?
- if you are getting out of memory error then how will u debug and fix ?
- We can use HeapDump , first we need to take heap dump because its not possible to debug complete project for OOM.
we have some tools of using HeapDump
- When did you use thread concept in the project ? How did you use it ?how did you implement ?
- Have u used front end ?
- Have u used Spring Security ?
- 

Cognizant HR Round :
- First Organization name in resume
- Why Congnizant ?
- why do u think we should give u a chance .?(Why should i hire you ?)
- 

Mphasis 6

Ur project, role and responsiblity
any functionality of java 8. uare using
what is the use of Lambda expression ?
what is the type of Lambda expression. ?
which design pattern u have used in your project.?
what is adapter design pattern
what is observer design pattern ?
what is Externalization ?
what is Serialization ?
In how many ways we can break singleton and how to prevent(avoid) it .?
How concurrentHashMap works in collection .?? Why concurrentHashMap does not throw ConcurrentModificationException in single thread environment ?
Different types of lock available in Multithreading ? and whats difference between Object level lock and class level lock .?
What is reentrant lock ?
I have an application(or method) and i want only three thread to access that application then how can i restrict access to that method for only three threads .?
difference between Reentrant lock and synchronous lock .?
How to communicate between two threads .?
Why Object class have wait and notify method .?
what is difference between Sleep() and yeild() ?
which one will get the lock after executing yeild() method .?
Difference between applicationContext() and BeanFactory()
what is internationalization ?
difference between internalization and Localization 
what are the different type view Resolvers present in Spring .?
what is sessionfactory in Hibernate .?
What are the different type inheritance strategy present in Hibernate .?
How will i disable first level Cache in hibernate .?
how did you configure second level cache .?
What is Dialect .?
difference between cluster and non-cluster ?
difference between procedure vs functions?
what is your role in database part in current project  .?
difference between Delete and Truncate
difference between Delete and Truncate and Drop
Spring bean life cycle in details
How to sort HashMap by keys and Values .?
I have one object and need to send that object on the network then what changes should be done in the class.?
How to make class as Immutable .?

Persistent First Round 

Urself
MVC flow ?
Who is the Front Controller in MVC ?
Write controller in Spring Rest
Bean Life Cycle
where do we write dispatcher Servlet ?
Where do we write init method of bean Life Cycle
Use of post processor
Who implements blocking quesue
Type of view resolver u used
Null in HashSet and TreeSet
Difference between abstract and interface
How will I ensure oreder of execution of thread
Annotations in Spring rest
Actuator
Spring Boot starter parent
Executor Framework
Binder in spring MVC
AOP
how to change existing server port in Spring boot ?
Difference between controller and rest controller
Can I achieve loose coupling using abstract
How concurrentHashMap Work ?
Can we change locking level of concurrent hashMap
Spring MVC vs Spring Boot

Persistent second Round
Technology u know
Technology learnt by urself
Exposure to restful Webservices
Agile methodology - Sprint
Exposure to Multithreading
How will u increase performance of application
Any UI technology
Type of context in Spring framework

Altimetrik:

-Are you using salesforces or any other CRM tool .?
-Are you worked on AOP .?
-How are handling exception in your project ? Jersey Exception mostly ?
-Suppose i have two application and both are running on same tomcat server and app 2 wants to throw an exception to app 1 then how will you proceed implementation 
of this requirement ? how will you handle exception coming from app 2?
- if application 2 is throwing null pointer exception , are you able to catch the exception ?
- Are you aware of Jersey ?
- what are the base exception class of Jersey ?
- if you are throwing any exception from application 1 to application 2 then do we need to do anything to handle exception in application 2 or it 
will be done automatically ?
- first code of equals method will be if(this==obj) , it will always return 1. remember contract between hashCode and equals method.
- array contains number of 0 and 1 . write a program to sort this array using one variable and one for loop
- Implement queue using stack
- String s = "abcedf" remove f without using String inbuilt function, use data structure to implement this . which data structure will u use ? how will u implement this ?
- Polymorphism is the concept given by Java or what ?
- How java implements polymorphism
- any other way except overloading and overriding  ? we can do by using reference (In base class reference we can store child class object) and how it is polymorphism ?
- Suppose i have class with constructor injection and Setter injection , through constructor I am initializing variable as 10 and through setter I am initializing as 15 so what will be 
the final value ?
- Can we call constructor injection first setter injection ?
- How many thread can wait at particular time for particular object .?
- two object are there and one synchronized method are there, how two thread will act on synchronized method ?

 WD Round 1 :
 count each character in a string
 merge two array sort and remove duplicate.
 
WD Round 2
- Explain about yourself
- You have SQL experience
- String is immutable in java , when we modify string it will be handle by different way in Java , how will it get handle by Java .?
- When we create String with "ABC" and new String("ABC") then two String will be created or what. ? in other word what will happen when we create String 
with or without new
- When we implements equals method then we have to implements hashcode method , why is this rule ? in which point it will break? 
- HashMap internal implementation in details
- Difference between comparable and comparator
- Which method will be implemented in comparable and comparator interfcae
- if you want to create pool of thread and we dont want to waste so much of memory then which threadpool should we use ?
- how thread managed by newFixedThreadPool() method in Executor Framework
- what is cachedThreadPool executor ?
- You have optimized anything in java like garbage collector ? How mark and Sweep algorithms work ?
- we have ArrayList, how can i create ThreadSafe arrayList ?
- Suppose two table have large amount of data and containing duplicates also , how will i merge both table without duplicates ?(will be solved by joins)
- What all join available in Oracle
- can we achieve removal of duplicacy by using inner join ?
- two tables are there with size 5GB and 5MB  and I want to join both table then which join i will use ?
 
 DXC Telephonic Round:
 - Ur Current Project,role and responsiblity
 - Explain your project
 - What have u done in RESTful WebServices and How ?
 - Did u use SpringBoot ?
 - Why did u use SpringBoot ? u could have use Traditional Spring Framework ?
 - If i dont want to use inbuilt Server of SpringBoot and want to use another server from outside? then 
 what changes should we do ?
 - Any other advantages of SpringBoot ?
 - Challenging things u have faced while developing SprinBootApplication and How did you overcome .?
 - If i am having separate Configuration file then how SPring Boot will pick up this file ?
 - why we need separate configuration file even though SPring Boot providees Auto configuration ?
 - How will u map ResultSet fetching from Database to Java Class(using Entity Class) ?
 
 EY First Round 
 -How many companies u have worked for ?
 -Are you good in Spring Boot, Microservices , RESTful Web Services ?
 -Tell me about your self regarding
	-what you have done
	-what all technologies you have touched
	-what is your specific task over project
	-what is the team size
	-what are you looking for 
	-in which area you have interest ?
 -what is your last project all about ? Discuss about your project ?
 -what were u using in Database ?
 -what was your role in Database layer.?
 -is it mandatory to annotate every field inside Entity class with @Column Annotationt ?
 -write simple web application(RESTful) to get employee Details from DB based upon employee ID
 -Difference between JAX-RS and Spring REST
 -How to create Unique ID in the Entity class
 -HOw will u do null check in Entity class ?
 -How will you do size check in POJO class
 -Which Collection interface will u use to get the data from DB and why ? which one will be faster .?(ArrayList and Set can be used)
 -To avoid duplicate which Collection interface will u use.?
 -will HashMap allows null value ?
 -In STS or Eclipse ,if you are doing any changes in application and dont want restart the server 
 manually by own then how should we configure for the same ?(Ans - devtools dependency should be added in POM)
 - What is the use of @Qualifier interface ?
 - how are you doing DB configuration in SpringBoot Application?
 - How to change default port in spring boot application ?
 - how to restrict two thread to update record simultaneously? (Write code in synchronized block wilt any lock)
 - Uses of volatile Keyword in Thread ?
 - Spring, SprinBoot, Microservices
 
 EY Second Round
 
 - can you briefly introduce about yourself ?
 - Difference between ApplicationContext() and BeanFactory()(Check @Annotation functionality with Beanfactory)
 - Difference between lazy initialization and eager intialization in Spring Framework ?
 - Major differences between Spring Framework and Spring Boot ?
 - What do you mean by autoconfiguartion in SpringBoot(in details) ?
 - How AutoConfiguration works in SpringBoot ?(R & D on this question)
 - How SpringBoot manages compatiblity of version of each jar ? if we dont mention version ?
 - How SprinBoot Starters(All kind of Starters) works ?
 - How SpringBoot decides version of each dependency ?
 - in SpringBoot, are @Produces and @Consumes mandatory ??
 - By default what kind of response will be given by spring Boot (JSON or xml)in restFul services ?
 - If i dont give produces and Consumes in spring Boot application then which kind of response will be returned ?
 - Definition of AutoConfiguration - This is how AutoConfiguration works , if we dont give Produces then Spring Boot by default 
 returns in the form  of JSON as JSON dependencies is alsready added in POM , but if we want default return type 
 should be XML then we will have to add XML jar in class path and exclude JSON by using exclude tag. that means if we dont 
 want AutoConfiguration by SpringBoot then we can use exclude tag to exclude them.
 - Do u have experience in Cloud ?
 - Which version of Java u have used ?
 - Tell me features of Java 8 and which what features u have used in ur project ?
 - How will u develop ur repository layer in springBoot ?
 - How to give my own query in in JPA repository ? what is the use of @Param annotation in JPA and where should we use ?
 - How to wrte HQL queries ?
 - Tell me rule to create HQL queries ?
 - write HQL Query to fetch record from employee table where id = :id ??
 - DO you know about Swagger Docs ?
 - Do you know about Microservices ? What is Microservices ?
 - Difference between RESTFul Web Services and Microservices ??
 - if you get Exception in your appliction then how will u identify ?
 - if you got any exception in another services then how will identify and fixed it ?
 - if any other services throwinf an exception then how will identify and fixed it ? 
 - How will u identify which method is throwing exception in the application which is having many more 
 methods and thousand methods or thousands line of code ? How will u identify the method throwing exception by looking 
 at the exception ?
 - How hibernate knows which DB we are using ?
 - what is the use of hbm.ddl properties in hibernate ? 
 - what is the difference between statement and preparedStatement in JDBC ?
 - MVC comes under which kind of Design pattern ? - Layered Structure or Layered Design Pattern 
 - RESFul comes under which kind of design pattern ? - Architecture Design pattern
 - How Microservices communicate with othere services ? and how will u make it ?
 - why exchnage should be used in Microservices ? we can use getForObject to consume another Microservics 
 - New features of Java 8
 - can class be private with final ?
 - can class be protected with final?
 - can class be final or protected?
 - difference between final, finally and finalize ?
 
 Zensar first Round
 - Tell me something about your project
 - what are the features of Java 8
 - Without writing the catch can we write try block ?(try with resources)
 - String str1 = "ABC"; 
	String str2 = "def"
	String str3 = "ghi"
	String str4 = "str1+str2+str3;
	How many String objects are there - Ans : 5
- Whether Java is call by value or call by reference ?
- how to restrict two threads to update the resources .?
- How are you going to write Synchronized block ?
- Where did you use Abstraction in ur Project and why did you use it ?
- Whats is Encapsulation ?
- Query to fetch top 3 List of Employee having maximum salary  from max rating?

 Zensar Second Round
 - Tell me about yourself and about your project
 - When ArraysIndexOutOfBoundException occurs ? and How can you avoid this situation ?
 - How to consume request from Postman and generate Username and ID based upon User details ?
 - Write pseudo code and Use case diagram for above scenario?
 - How many types of variable present in java and please explain their uses ?
 - What is the use of final keyword ?
 - can we modify static variable inside the class?
 - What is method overrididng and method overloading ?
 - How can you moddify private memeber outside the class ?
 - Can you explain all access modifier ?
 - What is Abstract class and Interface?
 - if 1000 child class implementing one interface and there is requirement to add one abstract method in interface
 and it should be implemented by only one class , how will u design this requirement?
Ans - Before Java 8 - I will write one more interface having one abstract class and then child class can implement both 
	Interfaces.
	- In java 8, use default method
	
 - In old days , How people use to configure database ?
 - How will I configure database in SpringBoot Application ?
 - In a String there is name there is my employee ID sandwhich between my first name and last Name with small bracket "("
  how will I get my employee ID.
  Ans - use split method to split string with "(" store in array then return arr[1]
 - How File works in Core Java ?
 - How to read file from different location Using File I/O concept ?
 - Whats is difference between for loop and while loop ? when will we prefer for loop and while loop ?
 - Can you explain Thread life cycle ?
 - When you prefer the thread ?
 - How to get current Thread running the task ? (Thread.currentthread.getName) ?
 - Are you writiting Hibernate program ?
 - Did you use hibernate to create the tables ?
 - How are you going to Test Restful web services ?(By Using Postman)
 

Mphasis Client(JP Morgan) Round 1

Tell me about yourself
How many ways we can create instance of bean in Spring Framework ?
Difference between Autowired and Qualifier 
If two class have same name and I am using @Autowired to get the Bean then which class Bean I will get ?
Advantage of Spring Boot over Spring Frame work
Tell me the Annotation u will use for Spring Boot Application
Difference between @Configuration and @Component in Deep
How will you configure Database(Oracle) in SpringBoot Application(Each and Every Steps)
How will u ensure that Transaction is created in DB ?
try with resources
How will  i debug lambda expression ?
how to fetch member variable in lambda expression
What is Abstract Factory Design Pattern
Command to push data in github
How did u do code coverage ?
How to configure Sonar Qube in Spring Boot Application ?
Is it allowed to write more than five condition in a method ?what error will be shown by sonar qube?
How did you play with Date Object in Hibernate ?
How will you configure Parent-Child Relationship of table in Entity file of Hibernate ? and on which column both table
will be related? i.e Association in Hibernate ? 
How will u play with Database while writing JUnit test case 
Did you work on embedded database or external database ?
Which Kind of server u used in ur application in every environment?
How will you run your SpringBoot application ?
How will u expose restful API in your application ?

Mphasis Client(JP Morgan) Round 2
-Difference between SQL and HQL in deep
-For what purpose u have used hibernate 
-OOPS concepts
-What is encapsulation
-Advantages of encapsulation in Deep
-Polymorphism
-Run time vs Compile Time Polymorphism
-Rules of Method Overriding
	Public void getSalary(){}- Parent Class
	public String getSalary(){} - Child Class
	what will happen in above case .? What will be compile time error .?
-Rules for overloaded method resolution in java
-How many types of lock in Thread .?
-What is synchronized keyword and how can we use it ?
- what is deadlock ? how it occurs?
- How to avoid deadlock more than one way ? (Using concept of reentrant lock)
- how to increase performance of Synchronized block or method (By using Object level lock instead of class level lock
because there will be only one class level lock so at one time only one thread can access synchronized block
but there will many number of object level lock so any number of thread can access synchronized method or synchronized
block on their respective object)


Mphasis Client(JP Morgan) Round 3
- How many years of Experience ?
- In infosys what do u do on daily basis , completely coding or what ?
- I dont have any code , I will give u an IDE and will ask u to create Maven Project Skeleton to bring up the SprinBootApplication.
- If you create New Maven Project from STS, what all things it will give you ultimately ?
- In Maven Project (folder Structure) , what all the folder Structure will be available ?
- In src/main/resources , there is one properties file application.properties and some many properties is available 
	in that .properties file , Now you package it as a jar. Now I want to override this property file which is already packaged , how will
	I override this properties file .?
- Learn details of Program Argument and VM argument what is the uses of both while starting Spring Boot Application ?
- What is the use of spring.profiles ?
- How will you supply path of these properties file.?
- Suppose I dont have Spring and I have properties file then how will I load it ? because Spring take care of loading of properties file
but now i dont have Spring then how will i load properties file ?
- How do you find .properties file because .properties file is present within the war in the resource folder so how do you find properties file?
- What is classpath(question to myself)
- Different type of Path we use to implement project (question to  myself)
- I have some class and that class contains some static block , i want that static block must be executed when application is started to run
- I have one class and it is having static block , in the same static block i am reffering some 
	properties file  and taking the properties from that file and loading it , then what will happen when application is coming up ??
	I want that static block must be executed after application is coming up ,So when the application is ready, my properties file 
	also get loaded how is this possible ?
- Whenver we refer the class then static block got executed so how we will refer the class when application is coming up ?
- Straight forward question, How do you load Class in a ClassLoader ??
- I will Simplify it, How will u load a database driver ?
- Can you write one simple program where one class is Employee containing field like age,name,date and create one map with key as Employee object
and value as salary
.put(e1,1000)
.put(e2,2000)
.put(e2,3000)
size ? =2, 
.put(e3,4000) e3 value is same as e2 but its different object what is the size ? ans - 3
- How will you create your own .hashCode() and .equals() for employee object to overcome this issue 
- Arraylist ordered or unordered and ordered based upon what ?(Insertion order)
- Sort ArrayList without using Collection API
- Remove Duplicay from ArrayList
- Delete Node from LinkedList - (Initial checks - check first if Linked List contains only one node or null value)
- Internally How many annotations SpringBoot used.? and what is the uses of every Annotation 
- I am adding any dependencies from third Party in maven pom , and suppose there is some class present in their API and they didn't annotated with
	@Component instead they are creating Bean in @Configuration file and there are 4 cofiguration file presnt in same package annotated with 
	@Configuration but I need only two Configuration file then what will i do the changes in my project to import only two Configuration file?
- Is there any way u run the Spring Boot Application without using @SprinBootApplication ? I need to restrict functionality of ComponentScan
i.e scanning for every packages to create Bean ? How will i restrict this scanning ? One way is remove SpringBootApplication, so is it possible
to run SprinBootApplication with using @SprinBootApplication ? (Ans - We can use @import annotation to import another cofiguration class to our
Configuration class)
- When do we use @Qualifier ?
- I have two configuration file 1 & 2 , in conf 2, i have created one bean. in conf 1 , I have created one bean which is having dependency on
	the bean created in conf 2 file then how will I refer bean present in conf 2 file into configuration 1 file ? whether u will go for 
	Constructor based injection or setter based injection ? and if I am selecting Constructor injection then How Spring Boot will get to know
	this is Constructor based injection ? Ans - - In the method present in Conf 1 I will pass another bean of configuration 2 as parameter
	so whenever Spring will create Bean of Conf 1 file first then it will first creat Bean of Conf 2 file.
- How will we do construtor based injection in term Java based configuration file between two Configuration file ?

JP Morgan Mumbai
- Tell me about yourself
- What is it all about your project ?
- How did you create those scheduler Job ? How Spring annotation @Scheduled work actually ?? When we annotate any method with @Scheduled then that
particular method will execute at certain time period so How does it work basically ? How Spring Handles it ?
- Assume I dont have those annotation(@Scheduled) then how will it be implemented ? Do you think any java API or classes is there through which
we can achieve scheduler ? that means assume i dont have Spring in my project but still i have to acheive this scheduling requirement then
how will i do it .??
- Have you used multithreading in your project .? I have used executor framework 
- what did u use in executor framework -> I have used newFixedThreadPool()of Executors utility class
- Are you aware of any other utility class ? -> i know about cachedThreadPool() and scheduledThreadPool()
- what is the functionality of scheduledThreadPool and cachedThreadPool ?
- To be honest why did you @Scheduled annotation instead of writing something by your own ? 
- Have you heard about ThreadPool implementation .? can you name couple of classes in ThreadPool implmentation ?
- Executor framework internally uses few ThreadPool classes which are existing since long time so what are those ?
- Below Program
	String input = "My Name is Durga Shanker";
	String output = "My emaN is agruD Shanker";
In above question , assume there are very very Big String and we are good with memory allocation but entire reversal String is taking too long
time for very big String then what can you modify in your existing implemenatation to improve performance of your API ? can anything u can do
to improve the performance .?

- Did you get any where u have to fetch large amount of data from database ? if yes then how did u increase the performance ?

- Suppose I have one million record in database and I want to fetch all the data from database and keep in some files 
- As per your logic We can use pagination of 100 records at a time . so for every iteration I will fetch 100 records at a time and will 
keep in file . can it be more efficient .? calling database multiple time will impact the performance so any other way to improve the performance?
- suppose I have one file it conataning tons of data and now i am fetching data from that file using I/O operations and keeping in another file
so we need to reduce the delay which is introduced by I/O processing. how can we acheive this ?

- Programming Skill using multithreading Concept and Programming skill with less time complexity are the most important Skill for Engineers
- How will you limit creation of number of thread in Production environment ?
- Solve above program using the concept of multithreading becaue my solution will leads to performance issue for very bigger String
- can you tell me what do you know about Synchronized keyword of multithreading ?
- When do we need class level lock to execute Synchronized method ? when this class level lock be used ?
- When I say my method is synchronized then which type of lock it got acquired .?
- Suppose I have two method m1() and m2() and both are synchronized. suppose I have called method m1 using new Thread and m1 internally calling
m2(), will it work ? if it will work then how ? which type of lock will be required ?
- two tables are there called customer and order, customer has primary key ID and ID is foreign key in Order table with name as CID
write  a query to find name of customer which have maximum number of Order ?

Accolite Telephonic Round
- Tell me about yourself and your Project , which kind of Project u worked on ?
- In which kind of scenario u have used Executor framework API in your project ? Please tell me some details about it
- Difference between traditional multithreading and Executor Framework ?
- Which kind of Data Structure u have used in your project ?it should be (List, Set, Map)
- In which Scenario u have used HashMap in your project ?
- Internal implementation of HashMap in detail? What is Hash Collision ? 
- Good Candidate key for HashMap ? can employee class be key ?
- Why should we implement .equals and hashCode()? what is their default implemenatation?
- What is the use of ConcurrentHashMap ? why should we go for it ? what are the avantages ? where did u use it in ur project ?
Where should we use(In which Scenario) ConcurrentHashMap? Internal implementation of concurrentHashMap?
https://crunchify.com/hashmap-vs-concurrenthashmap-vs-synchronizedmap-how-a-hashmap-can-be-synchronized-in-java/
- While running Executor Framework if one thread throws an exception  while running then what will happen ? How to handle this kind of scenario ?
- Did u work on Spring ?
- How Spring MVC works ? Tell me layer of Spring MVC ? Flow of Spring MVC application ?
- get() vs load()
- save() vs persist()in details ?
- can get throw nullpointerException?
- in which scnarion we can use get() and load()?
- How will u terminate the session ?
- Difference between JDBC and Hibernate (Difference between SQL and HQL)
- What things u know in SQL ? How complex queries u have written till now in ur 4 years of experience ?
- Clear ConcurrentHashMap in deep

 






