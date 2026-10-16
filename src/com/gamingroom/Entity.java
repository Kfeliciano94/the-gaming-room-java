package com.gamingroom;

/**
 * Class that stores info shared by
 * games, teams, and players
 */
public class Entity {
    private long id;
    private String name;


    private Entity() {

    }

    /**
     * Create an entity with a unique id and name.
     */

    public Entity(long id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    /**
     * Returns the entity ID
     */
    public long getId() {
        return id;
    }

    /**
     * returns the entity name
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the entity information as text
     */

    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }


}