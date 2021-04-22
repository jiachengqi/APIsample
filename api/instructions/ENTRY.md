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

- Add a new entity/table "check in" which represents when a user wishes to smoke. A check in can either result in the user smoking or not smoking. This is the data type for the "I'm craving" green button in the Alex app currently. A check in should have these fields:
didSmoke (boolean) - true if user smoked false if not
time (datetime) - at what time this was logged by the user

Check ins should be connected with the user who made them, so the table/entity should also have a many-to-one connection with the AppUser entity. You should therefor also modify the AppUser entity/table to contain this relation, and add the relevant foreign key to the check in table.

- Add a new API to make it possible to POST a new check in.

- Add a new API to GET /checkin/count which returns how many check ins the user has smoked (lifetime) and how many check ins the user decided not to smoke.

- Use Postman to create a new user using some email. Then, create a new user again using the same email. This works, and that is a bug - we don't want several users with the same email, emails should be unique. Fix this!

- Now we are going to do some planning and design a new big feature!
When a user wants to smoke, we want to help them find a way to resist the urge - right? Our super-designers have come up with something called "habit hacks", which are things you can do instead of smoking. Like go for a run instead, drink some water, have a dance battle with yourself - and so on. We have also decided that we want an "AI" recommendation service to recommend which hack would work best for a specific user when they feel like smoking.

Sketch out a plan on how to build this feature end-to-end (app to API to recommendation service). How will the app communicate with the API and how should the backend code be designed? How should all the hacks be stored and shipped around in the stack? You can assume that the service will be reached via http://ai/recommendHack and that it will send you which hack to recommend if you provide the user id.

- Start building the API part of what you planned in the previous point.
