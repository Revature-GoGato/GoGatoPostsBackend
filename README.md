# GoGato
### API for Posts MSA
************************************************

### Summary:

GoGato is a social media application that allows users to create a profile and posts. A post is created by taking user input and rendering it on the user's screen for viewing and interaction, simultaneously storing the content in a PostgreSQL database that is hosted on AWS.

The database tables are created via Spring JPA with Hibernate, and the API is documented using Swagger and JavaDocs.

### Features:

Users can:
 
 - Create a post
 - Retrieve a post
 - Retrieve all posts
 - Update a post
 - Delete a post

## API/Route Table 


| Route                  | Description              |
|------------------------|--------------------------|
| /post                  |                          |
| /post/userid/:userid   | Get by userid            |
| /post/userid/:parentid | Get by parentid          |
| /post/create           | Create a new post        |


## Built With:
 - Java 8
 - Spring Boot Data/Web/JDBC
 - Lombok
