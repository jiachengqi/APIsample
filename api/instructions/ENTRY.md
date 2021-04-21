# Instructions

This sample is suitable for candidates from entry level to a few years experience.

## Preparations

(this should be sent to the candidate in advance)

__You will need to install:__

- A Java IDE. We recommend IntelliJ https://www.jetbrains.com/idea/
- Docker. https://docs.docker.com/get-docker/
- Postman. https://www.postman.com/
- Git. https://git-scm.com/downloads

__Task description:__

You will be given a basic Spring Boot project set up for REST API development, like a mini-mini version of the Alex API. There is some code already present for creating and getting users. The database is Postgres and will be run in docker and there will be a script available for creating it easily. You will use Postman to test and interact with the API.

On the day you will receive a list of tasks to complete in the project, including things like adding APIs, tables/entities, and manipulating data. At the end of the day you will present and talk about what you've done to the tech team.

__Reading:__

The tasks will be done mainly using Spring Boot which is a popular Java framework, with a little bit of SQL.

If you are new to Java, there are a bunch of resources online to get started. Google it! The same goes if you are unsure about concepts like REST or SQL. You don't need to be an expert, but you should know what we mean if we ask you to create a GET request or a new database table.

To get started with Spring Boot, you can first check out Spring's own tutorials like the first getting started guide at https://spring.io/guides/gs/spring-boot/ and the get started for building REST APIs at https://spring.io/guides/gs/rest-service/. You will also be working with JPA for the database connection which you can read about here https://spring.io/guides/gs/accessing-data-jpa/.

If you have any questions before the day, don't hesitate to ask!


## Tasks

(this should not be sent to the candidate in advance)

- Add a new entity/table "CheckIn" which represents when a user wishes to smoke. A check in can either result in the user smoking or not smoking. This is the data type for the "I'm craving" green button in the Alex app currently. A checkin should have these fields:
didSmoke (boolean) - true if user smoked false if not
time (datetime) - at what time this was logged by the user

CheckIns should be connected with the user who made them, so the table/entity should also have a many-to-one connection with the AppUser entity. You should therefor also modify the AppUser entity/table to contain this relation, and add the relevant foreign key to the CheckIn table.

- Add a new API to make it possible to POST a new CheckIn.

- Add a new API to GET /checkin/count which returns how many checkins the user has smoked (lifetime) and how many checkins the user decided not to smoke.

- Write a unit test to test the method you wrote to make the calculations in the previous task. Don't test the controller method, just the calculations.

- TODO something with planning. Maybe "we want to ask the user some questions about why the user wants to smoke right now. but we want this to be AI recommended, so it should be presented to the app by the backend. How would you design an interaction like this? How would the interaction between the app and the backend look (the API) and how would you structure the backend code? you can assume theres an AI service somewhere which you can ask for recommendations from"

- Start building what you planned in the previous point.
