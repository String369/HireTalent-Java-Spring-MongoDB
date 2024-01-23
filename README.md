::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::HIRE TALENT:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

INTELLIJ IDEA : JAVA
DATABASE      : MONGODB 
MONGODB       : You have to scale your application and you need replica for database it is difficult to sync in SQL database and that is why we are using MongoDB(NoSQL)
MongoDB dont have tables it have documents.
We are using MongoDB cloud service so we have to create a account in MongoDB Atlas
Link : https://www.mongodb.com/cloud/atlas/register?utm_content=rlsapostreg&utm_source=google&utm_campaign=search_gs_pl_evergreen_atlas_general_retarget-brand-postreg_gic-null_apac-all_ps-all_desktop_eng_lead&utm_term=&utm_medium=cpc_paid_search&utm_ad=&utm_ad_campaign_id=14412646494&adgroup=131761134692&gclid=CjwKCAjw-L-ZBhB4EiwA76YzOUoLgHnqBV5JSwjACW9vDzfsqM1I7_J6SSQt_VmXfAQtnuA3lleksBoC5jIQAvD_BwE 
Springboot: start.spring.io
<img width="1510" alt="Screenshot 2024-01-23 at 12 43 28 PM" src="https://github.com/String369/HireTalent-Java-Spring-MongoDB/assets/132102851/8401fc22-5d9a-43c2-ad58-3d7d28e53103">
Add dependencies : Genaerate project
Change spring-boot-starter-paren version to 2.5.7 in Pom.xml and download dependencies
Go to mvn repository :: Search swagger ui : version 2.9.2 and swagger2 : version 2.9.2 and copy to pom.xml dependencies

Step1: connect our application with MongoDB : Whether it will be in your system or in cloud
Step2: What is your database name : Username and Password
In application.properties : spring.data.mongodb.uri = 
spring.data.mongodb.database=
Step3: Add Swagger to project by adding code in Joblisting application
Step4: We have to sent request to server : In SpringFramework we will use Spring MVC 
So we have to create a Controller first : In this controller we can write methods to every post and we have to enable swagger here first.
Step5: Create different packages for controllers and models(Pojo) : It is the java class which will map my java class with the document
