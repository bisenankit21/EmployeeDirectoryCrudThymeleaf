Bootstrap Link - https://getbootstrap.com/docs/5.3/getting-started/introduction/  

Thymeleaf link- http://www.thymeleaf.org

------------Overview of this project------------------------------------------  
Project Name- Employee Directory using Thymeleaf  |  Spring Boot, Thymeleaf, CSS, HTML, and JavaScript.
1. CRUD Operations: Users can Create, Read, Update, and Delete employee records stored in a database.
2. Thymeleaf Integration: The user interface is designed using Thymeleaf templates.
3. Form Handling: Thymeleaf forms are used for creating and updating employee information.
4. Exception Handling: The project demonstrates how to handle exceptions that may occur during runtime.
5. Database Configuration: It also covers setting up the database connection in the application.properties file.

   
-----------Learning From this project------------------------------
1. Thymeleaf has special expression for binding spring MVC Form Data
2. Automaticaly setting and retrieving data from the given data object
3. th:action =location to send form data
4. th:object = Reference to model attribute 
5. th:field = build input field to a properly model attribute
6.  @ModelAttribute= When used as a method parameter, @ModelAttribute retrieves the argument from the model.
7. @Controller:
   Used for building traditional web applications that render views (e.g., Thymeleaf or JSP pages).
   Typically used when you want to prepare a model and use it with a view.
   Handles requests by returning views (HTML pages) along with model data.
   You annotate request handling methods with @RequestMapping or other HTTP method-specific annotations.
   Often used in scenarios where you need to create web pages with dynamic content.
8. @RestController:
   Specifically designed for building RESTful APIs that return data (usually in JSON or XML format).
   Combines the functionality of @Controller and @ResponseBody.
   Automatically serializes return objects into the HTTP response body (no need for additional @ResponseBody annotations).
   Ideal for scenarios where you want to create APIs that directly return data without rendering views.
   Commonly used in microservices, single-page applications (SPAs), and mobile app backends.
9. Use @Controller for web pages and views.
   Use @RestController for building APIs that return data directly.
10. Spring Boot Actuator is a set of features that provide monitoring and management capabilities for your Spring Boot application. Actuator endpoints expose information about your application, such as health status, metrics, and environment variables, that can be used to monitor and manage your application.
11. We can use Javascript code inside our HTML page.
