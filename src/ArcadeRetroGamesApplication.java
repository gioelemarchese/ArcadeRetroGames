import java.util.Scanner;

import models.Game;
import services.GameService;

public class ArcadeRetroGamesApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		
		GameService gameService = new GameService();
		
		while(isRunning) {
			System.out.println("MENU ARCADE RETRO");
			System.out.println("1) Aggiungi un gioco arcade");
			System.out.println("2) Visualizza elenco giochi");
			System.out.println("3) Cerca gioco");
			System.out.println("4) Giochi difficili (difficoltà 4-5)");
			System.out.println("5) Esci");
			System.out.println("Seleziona: ");
			
			String choose = scanner.nextLine();
			
			if (choose.equals("1")) {
				System.out.println("Inserisci il nome del gioco:");
				String name = scanner.nextLine();
				
				System.out.println("Inserisci l'anno di uscita del gioco:");
				int releaseDate = scanner.nextInt();
				scanner.nextLine();
				
				System.out.println("Inserisci il livello di difficoltà del gioco:");
				int levelDiffculty = scanner.nextInt();
				scanner.nextLine();
			
				gameService.insertGame(name, releaseDate, levelDiffculty);
				
			}
			
			else if(choose.equals("2")) {
				
				gameService.printGamesList();
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
