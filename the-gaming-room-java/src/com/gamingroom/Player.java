package com.gamingroom;

/**
 * Class to hold player information
 */

public class Player extends Entity {
	
	/**
	 * Creates a new player
	 */
	public Player(long id, String name) {
		super(id, name);
	}

	/**
	 * Returns the player information
	 */

	@Override
	public String toString() {
		return "Player [id=" + getId() + ", name=" + getName() + "]";
	}
}