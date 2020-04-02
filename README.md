Task 1. Java REST API example.

# Kaiburr Server REST API

Implement an application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects.

Created the REST API application using Spring Boot - Maven while at the same time mantaining code modularization and testing exposed endpoints using Postman .

Task 1 Sceenshots :

1. GET servers - Return all the servers if no parameters are passed. 
	<img src = "src/main/resources/screenshots/get_all_servers.png">
	
2. GET servers - When server id is passed as a parameter - return a single server.
	<img src = "src/main/resources/screenshots/get_by_server_id.png">
	
	Return 404 if there’s no such a server.
	<img src = "src/main/resources/screenshots/get_server_not_found_404.png">
	
3. PUT a server - The server object is passed as a json-encoded message body.
	<img src = "src/main/resources/screenshots/postman_post_req.png">
	
4. DELETE a server - The parameter is a server ID.
	<img src = "src/main/resources/screenshots/delete_server.png">
	
	<img src = "src/main/resources/screenshots/delete_not_found_404.png">
	
5. GET (find) servers by name. The parameter is a string. Must check if a server name contains this string and return one or more servers found.
	<img src = "src/main/resources/screenshots/find_by_name.png">
	
	Return 404 if nothing is found.
	<img src = "src/main/resources/screenshots/find_by_name_not_found_404.png">
	
6. Data in MongoDB database.
	<img src = "src/main/resources/screenshots/docker_mongo_db_server.png">
	

	

Task 2. Swagger codegen.

# Kaiburr Swagger Integration

In this task I have integrated my Kaiburr Server REST API with swagger because I didn't require Codegen Stub for the REST APIs.

Swagger is an open-source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful web services.

Task 2 Screenshots :


<img src = "src/main/resources/screenshots/swagger_implementation.png">
	
        
<img src = "src/main/resources/screenshots/swagger_put_example.png">
	



Task 3. Docker compose.

# Kaiburr Docker Compose


