import java.util.Scanner;

import exception.ExceptionPlacerPierre;
import sauvegarde.Serialisation;

public class Main {

	public static void main (String args []) throws ExceptionPlacerPierre {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Pseudo joueur blanc : ");
		
		Joueur blanc = new Joueur("Blanc", plateau, sc.nextLine());
		
		System.out.println(blanc.getPseudo());
		
		System.out.println("Pseudo joueur noir : ");
		
		Joueur noir = new Joueur("Noir", plateau, sc.nextLine());
		
		System.out.println(noir.getPseudo());
		
		
		
		while (blanc.isPasserTour() && noir.isPasserTour()) {
			
			System.out.println("Joueur blanc voulez vous passez ? (o/n)");
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}
}