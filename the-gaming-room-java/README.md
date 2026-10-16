# The Gaming Room — Java Game Management

A Java coursework project for SNHU CS 230 (Operating Platforms), demonstrating object-oriented design and the Singleton pattern.

## Features
- Create and manage games, teams, and players
- Use a shared `GameService` instance through the Singleton pattern
- Model related entities using Java classes and inheritance
- Run a demonstration through `ProgramDriver`

## Project structure
- `src/com/gamingroom/` — Java source code
- `docs/uml-diagram.png` — UML design diagram

## Run
Requires a Java Development Kit (JDK).

From the repository root:

```bash
javac -d out src/com/gamingroom/*.java
java -cp out com.gamingroom.ProgramDriver
```

## Background
Created for an academic programming assignment. Some starter code includes original course attribution.

## Maintenance note
Corrected a method-name typo in `Player.java` (`getID()` → `getId()`) so it matches the inherited method in `Entity.java`.
