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
##### DTO - Libraries
- Use mapper to convert from JPA to DTO - DTO to JPA.
- Libraries the help with the mapping of objects: `ModelMapper` or `MapStruct`.
- Add ModelMapper Maven Dependency and configure ModelMapper clas as Spring bean.
- Inject and use ModelMapper Spring bean in service class.
##### REST API Documentation: SpringDoc
- SpringDoc-openapi generates API documentation for spring boot projects -> JSON/YAML with libraries.
- Supported libraries include: OpeanAPI3, Spring-bootv3,Swagger UI, OAuth 2 and JSR-303.
- Add dependencies to the project and model annotations.
- Dependencies URL: ` https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui`
- Access swagger-ui: `http://localhost:8080/swagger-ui/index.html`.