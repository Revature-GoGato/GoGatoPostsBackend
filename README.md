# GoGato
### API for Posts MSA
************************************************

### Summary:

A post is created when user input is captured and sent to the backend for storage and retrieval. 

Spring Data JPA used to connect to AWS database via PostgreSQL.
Here is the link for the Docker image.


### Features:

Users can:
 
 - Create Posts
 - Retrieve a Post
 - Retrieve all Posts
 - Update Posts
 - Delete posts

## API/Route Table 


| Route                  | Description              |
|------------------------|--------------------------|
| /post                  |                          |
| /post/userid/:userid   | Get by userid            |
| /post/userid/:parentid | Get by parentid          |
| /post/create           | Create a new post        |
