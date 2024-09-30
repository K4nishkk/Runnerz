* run jps command to check which are the processes running on which port
* @Component annotation means that spring is going to take care of the instances of that class
* Application context is a container of all the classes in your application, and we can ask the application container for a particular class.
* Bean is an instance of a class with some metadata around it.
* There are 2 popular ways to package files
  * Package by layer - An MVC (Model-View-Controller) app contains layers such as model, controller, service, config, repository etc.
  * Package by feature - Contains layers for each feature in a particular folder.
* CommandLineRunner is something that runs after the application has started, or more importantly after the application context has been created.
* Field injection is not recommended
* Application.properties file contains configurations

## Used Annotations and there meanings
* $@Repository$ - 
  * Repository is a place or container in which something is stored.
  * In Spring, it is used to manage data persistence and retrieval in a database.
  * It indicates that a class is a repository component that provides mechanisms for storage, retrieval, search, update, and deletion of objects
  * It provides an abstraction layer over the database and simplifies the process of interacting with it, allowing developers to focus on business logic rather than database operations.
  * It's similar to the DAO pattern, where DAO classes are responsible for providing CRUD operations on database tables. 


* $@PostConstruct$ -
  * This is a method that is called just after the initialization of bean properties. (Cannot be a static method)
  * One possible use is populating a database.
  

* $@RestController$ -
  * They are part of the presentation layer and handle incoming HTTP requests.
  * They act as intermediaries between the view and service layers. The @Controller handles web requests (in an MVC pattern), while @RestController is used in REST APIs to return JSON or XML responses.
  

* $@RequestMapping$
* $@GetMapping$
* $@PostMapping$
* $@PutMapping$
* $@DeleteMapping$ -
  * They map a request path to a method


* $@PathVariable$
* $@RequestBody$
* $@ResponseStatus$
  * Also used for requests


* $@Valid$ - in order to validate fields of an object