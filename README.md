#### Spring-Boot-Restful API
##### Dependencies:
- Spring web: Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
- MySQL driver: MySQL JDBC driver.
- Spring data jpa: Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
- Lombok: Java annotation library which helps to reduce boilerplate code.
##### Data Transfer Object - DTO
- This helps to reduce remote calls from client and server.
- The required amount of the data is sent at a given request.
- The communication follows between database to different layers: `controller layer`,`service layer`, `respository layer`and `database`.