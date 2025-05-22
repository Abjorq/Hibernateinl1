# HibernateInl1 


Baserat på tidigare uppgifter så använde jag mig av klasser som skola, studenter och en mainklass. 

## Syfte med uppgiften

Att förstå och använda JPA/Hibernate för att skapa relationer i databasen med Java och Maven. Projektet ska föreställa en **skola** där en skola kan ha flera studenter.

## Tekniker & Verktyg

- Java 17
- Maven
- Hibernate ORM 6
- Jakarta Persistence (JPA 3)
- H2 in-memory databas

## Struktur

src/
└── main/
├── java/se/yrgo/
│ ├── School.java
│ ├── Student.java
│ └── Main.java
└── resources/META-INF/
└── persistence.xml
pom.xml
.gitignore


## Relationer - syftet med uppgiften

- `School` har en `@OneToMany`-relation till `Student`
- `Student` tillhör en `@ManyToOne` `School`

## Körbart

Öppna projektet i IDE
Ladda Maven Project
Kör Main.java


## Utdata

Anton
Nahid

## Maven-kommandon via terminal

*bash*
mvn compile
mvn exec:java -Dexec.mainClass="se.yrgo.Main"

