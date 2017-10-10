# Java EE 8 Spring with Angular

The scope of the application is to show the new features of the next version of Java EE.
Angular 4 (Angular CLI) is used to communicate with the server.
This architecture is one of the most common in the professional environnements:
Java EE <--> REST Services <--> Angular (JS Framework)

## How to install

__Prerequisites__

- you need maven, npm, git and an application server Java EE
- the demo uses some Java 8 features that are still in developement.
 At the moment it works only with __WildFly__. 


__Production mode__

- clone the git project
from the root of the project launch mvn package this generates a package named ROOT.war in the PROJECT/server/target directory
you can deploy this package in your favourite application server.
The Angular application should answer at the requests to __http://localhost:8080__

Development mode

__Development mode__

- clone the git project
You can start the server using your favourite IDE. The project uses a standard Maven directory structure. You need to configure the server to deploy the server.war artifact.
from the PROJECT/client/src directory install the npm packages : npm install
launch the client with ng serve. The client uses the port 4200 (default for Angular CLI) and you can navigate to __http://localhost:4200__
 
## How the code is organized

The package _mx.com.root.sintec.controller_ contains the REST resources.

The package _mx.com.root.sintec.repository_ contains the specific code used for the data access object.

The package _mx.com.root.sintec.model_ contains the specific code used for the data model object. 

_UPDATES_

17.04.2017: CDI demo, refactoring server and client
