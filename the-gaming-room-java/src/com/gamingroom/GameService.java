package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
/**
 * A singleton service for the game engine
 * 
 * @author coce@snhu.edu
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	private static GameService instance = null;
	
	private GameService() {
	}

	public static GameService getInstance() {
		if (instance == null) {
			instance = new GameService();
		}

		return instance;
	}
	
	


	/**
	 * Adds a game if the name is not already used
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;

		Iterator<Game> iterator = games.iterator();

		while (iterator.hasNext()) {
			Game existingGame = iterator.next();

			if (existingGame.getName().equalsIgnoreCase(name)) {
				game = existingGame;
				break;

			}
		}

		
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		
		return game;
	}

	/**
 * Returns the game at the specified list position.
 */
Game getGame(int index) {
    return games.get(index);
}

/**
 * Finds a game using its ID.
 */
public Game getGame(long id) {

    Iterator<Game> iterator = games.iterator();

    while (iterator.hasNext()) {
        Game game = iterator.next();

        if (game.getId() == id) {
            return game;
        }
    }

    return null;
}

    /**
     * Finds a game using its name.
     */
    public Game getGame(String name) {

        Iterator<Game> iterator = games.iterator();

        while (iterator.hasNext()) {
            Game game = iterator.next();

            if (game.getName().equalsIgnoreCase(name)) {
                return game;
            }
        }

        return null;
    }

    /**
     * Returns the number of active games.
     */
    public int getGameCount() {
        return games.size();
    }
}
