package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class to hold information about a game and its teams.
 */
public class Game extends Entity {

    private List<Team> teams = new ArrayList<Team>();

    public Game(long id, String name) {
        super(id, name);
    }

    /**
     * Adds a team if the name is not already used.
     */
    public Team addTeam(long id, String name) {

        Team team = null;

        Iterator<Team> iterator = teams.iterator();

        while (iterator.hasNext()) {
            team = iterator.next();

            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }

        team = new Team(id, name);
        teams.add(team);

        return team;
    }

    /**
     * Finds a team by name.
     */
    public Team getTeam(String name) {

        Iterator<Team> iterator = teams.iterator();

        while (iterator.hasNext()) {
            Team team = iterator.next();

            if (team.getName().equalsIgnoreCase(name)) {
                return team;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Game [id=" + getId() + ", name=" + getName() + "]";
    }
}