::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::HIRE TALENT:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

1. INTELLIJ IDEA : JAVA
2. DATABASE      : MONGODB 
3. MONGODB       : You have to scale your application and you need replica for database it is difficult to sync in SQL database and that is why we are using MongoDB(NoSQL).MongoDB don't have tables it have documents.
5. We are using MongoDB cloud service so we have to create a account in MongoDB Atlas.
6. Springboot: start.spring.io
<img width="1510" alt="Screenshot 2024-01-23 at 12 43 28 PM" src="https://github.com/String369/HireTalent-Java-Spring-MongoDB/assets/132102851/8401fc22-5d9a-43c2-ad58-3d7d28e53103">
7. Add dependencies : Genaerate project
8. Change spring-boot-starter-paren version to 2.5.7 in Pom.xml and download dependencies
9. Go to mvn repository :: Search swagger ui : version 2.9.2 and swagger2 : version 2.9.2 and copy to pom.xml dependencies.
10. Step1: connect our application with MongoDB : Whether it will be in your system or in cloud
11. Step2: What is your database name : Username and Password
12. In application.properties : spring.data.mongodb.uri =  and spring.data.mongodb.database=
13. Step3: Add Swagger to project by adding code in Joblisting application
14. Step4: We have to sent request to server : In SpringFramework we will use Spring MVC 
15. So we have to create a Controller first : In this controller we can write methods to every post and we have to enable swagger here first.
16. Step5: Create different packages for controllers and models(Pojo) : It is the java class which will map my java class with the document.
