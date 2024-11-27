# Spring Boot - TP Revision Project

## Overview
This project is a Spring Boot application.

---

## Prerequisites
Before running the project, ensure you have the following installed:
- **Java**: Version 11 or later
- **Maven**: Version 3.6 or later
- **MySQL/PostgreSQL** (if applicable): Ensure a running database instance
- **Spring Boot**: Included via Maven dependencies

---

## Installation and Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/hamza10tn/springboot-tpRevision.git
   cd springboot-tpRevision

2.Configure the Database (if applicable):
Update the application.properties or application.yml file:

    spring.application.name=springProject
    ### DATABASE ###
    spring.datasource.url=jdbc:mysql://localhost:3306/springdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&createDatabaseIfNotExist=true&useLegacyDatetimseCode=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=
    ### JPA / HIBERNATE ###
    spring.jpa.show-sql=true  
    #pour afficher les requete sql dans le console
    spring.jpa.hibernate.ddl-auto=update
    #update pour mettre a jour la base de donnee
    server.port=8087
    server.servlet.context-path=/tpfoyer

    
3.Build the Project:

    mvn clean install
    Run the Project:

4.Run the Project:
  `mvn spring-boot:run`
