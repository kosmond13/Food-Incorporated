# Food-Incorporated
This project will help you learn about making REST requests to receive a Food object. You will dockerize the app, create and configure a database, and create the ability to write new data to the app throughout the phases.

## Getting Started
These instructions will help you get a copy of the project up and running on your local machine and install the necessary software.
* Install the jdk for Java 11
* Clone this repository 
* To build the app, use `gradle build` If that doesn't work, try `./gradlew build`
* To run the app, use `gradle bootRun` or `./gradlew bootRun`


## Phase 1
The goal of this phase is to make a REST request for a food object and have it returned with dummy data 
1. Create a get request for the "Hello World!". When the user goes to localhost:8080, "Hello World!" should be outputted
2. Create a get request for a food object. When the user goes to localhost:8080/nutrition?food=apple, nutrition information for the apple should be returned as JSON
   * Sample output: {"name":"apple","calories":95,"fat":0,"protein":0,"carbs":25}
3. Create unit tests using step verifier
   * Helpful anntoations: `@RunWith(SpringRunner.class)`, `@SpringBootTest`, `@Autowired`, `@MockBean`
  

## Phase 2

## Phase 3

## Phase 4
