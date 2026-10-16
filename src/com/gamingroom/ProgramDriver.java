package com.gamingroom;

/**
 * Application start-up program
 * 
 * @author coce@snhu.edu
 */
public class ProgramDriver {
	
	public static void main(String[] args) {
		
		GameService service = GameService.getInstance();
		
		System.out.println("\nAbout to test initializing game data...");

		// Create Games

		Game game1 = service.addGame("Game #1");
		System.out.println(game1);

		Game game2 = service.addGame("Game #2");
		System.out.println(game2);

		//Add teams to Game #1
		Team team1 = game1.addTeam(1, "Red Team");
		Team team2 = game1.addTeam(2, "Blue Team");

		// Add players to each team
		team1.addPlayer(1, "Gio");
		team1.addPlayer(2, "Kat");

		team2.addPlayer(3, "Ava");
		team2.addPlayer(4, "Diana");

		System.out.println("\nTeams created:");
		System.out.println(team1);
		System.out.println(team2);

		System.out.println("\nAbout to test the singleton...");

		SingletonTester tester = new SingletonTester();
		tester.testSingleton();
	}
}
		
		

