package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Stores a team and its players
 */

public class Team extends Entity {
	private List<Player> players = new ArrayList<Player>();

	public Team(long id, String name) {
		super(id, name);
	}

	/** 
	 * Adds a player if the name is not already used
	 */
	
	public Player addPlayer(long id, String name) {
		
		Player player = null;

		Iterator<Player> iterator = players.iterator();

		while (iterator.hasNext()) {
			player = iterator.next();

			if (player.getName().equalsIgnoreCase(name)) {
				return player;
			}
		}

		player = new Player(id, name);
		players.add(player);

		return player;
	}

	/**
	 * Finds a player by name
	 */

	public Player getPlayer(String name) {

		Iterator<Player> iterator = players.iterator();

		while (iterator.hasNext()) {
			Player player = iterator.next();
		
		if (player.getName().equalsIgnoreCase(name)) {
			return player;
		}
	}

	return null;
}

@Override
public String toString() {
	return "Team [id=" + getId() + ", name=" + getName() + "]";

}
}

