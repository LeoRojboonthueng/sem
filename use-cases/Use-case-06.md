## USE CASE 6: List the top N populated countries in a region where N is provided by the user.

### CHARACTERISTIC INFORMATION

Goal in Context:
As a Demographic Researcher, I want a list of the top N populated countries in a region where in N is provided by the user so that i can facilitate demographic analysis and prioritize target markets affectiveness in a given region.

Scope:
Company

Level:
Primary Task

Preconditions:
Availability of a database containing countries population in a region
User-provided value for N

Success End Condition:
A report is generated and delivered to the Research Manager, detailing the top N populated countries in a given region

Failed End Condition:
The Research Manager does not receive the requested report on the top N populated countries in a given region

Actors:
Primary - Research Manager
Secondary - Demographic Researcher

Trigger:
Research Manager's request for demographic data regarding the top N populated countries in a given region

### MAIN SUCCESS SCENARIO:

Research Manager specifies the value of N, representing the desired number of top populated countries in a given contient
Demographic Researcher accesses population data for all countries from the database
The Researcher sorts countries based on population, selecting the top N
A detailed report listing the top N populated countries is generated
The report is transmitted to the Research Manager

EXTENSIONS:
N/A

SUB-VARIATIONS:
N/A

SCHEDULE:
DUE DATE: Release (22/04/24)