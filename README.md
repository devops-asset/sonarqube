[![Build Status](https://travis-ci.com/devops-asset/sonarqube.svg?branch=master)](https://travis-ci.com/devops-asset/sonarqube)


This example demonstrates how to collect code coverage by integration tests, tests are located in a separate Java Maven module.
SonarQube aggregates code coverage by unit tests and integration tests to compute an overall code coverage.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 5.6+
* Maven 3+

Usage
=====
* Build the project, execute all the tests and analyze the project with SonarQube Scanner for Maven:

        mvn clean install sonar:sonar
        
Sonar coverage Report updated in SonarCloud: 

SonarQube-output.PNG
=====
![alt text](https://github.com/devops-asset/sonarqube/blob/master/SonarQube-output.PNG)
