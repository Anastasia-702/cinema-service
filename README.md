# Cinema Service

This is a web application based on Hibernate and Spring frameworks. It provides role-based authorization, 
authentication and registration and supports four basic CRUD operations for working with relational database.
As an admin you can use the following features:

- Create cinema hall/movie/movie session;
- Update movie session by id;
- Delete movie session by id;
- Get information about the user by email;
- Get all cinema halls/movies/movie sessions available by date.

The logged user can:
- Get information about shopping cart/orders;
- Add/remove movie session from shopping cart;
- Complete order;
- Get all cinema halls/movies/movie sessions available by date.

## Structure
Project has a three-tier architecture:
1. The presentation tier (controllers);
2. The application logic tier (service);
3. The data tier (DAO).

## Technologies
- Hibernate;
- Spring MVC;
- Spring security;
- Apache Tomcat v.9.0.50;
- Apache Maven;
- MySQL.

## Launch
1. Clone or download repository;
2. Configure Tomcat (v.9.0.50); 
3. Create schema named `cinema` in MySQL;
4. Add your database URL, username, password and JDBC driver into corresponding fields in src/main/resources/db.properties;
5. You can inject custom data in src/main/java/cinema/init/DataInitializer;
6. Run the application.
