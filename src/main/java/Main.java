import java.util.Scanner;

import enumeration.Couleur;
import exception.ExceptionPlacerPierre;
import sauvegarde.Serialisation;

public class Main {

	public static void main (String args []) throws ExceptionPlacerPierre {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Pseudo joueur blanc : ");
		
		Joueur blanc = new Joueur(Couleur.Blanc, plateau, sc.nextLine());
		
		System.out.println(blanc.getPseudo());
		
		System.out.println("Pseudo joueur noir : ");
		
		Joueur noir = new Joueur(Couleur.Noir, plateau, sc.nextLine());
		
		System.out.println(noir.getPseudo());
		
		int x,y;
		
		while (!blanc.isPasserTour() && !noir.isPasserTour()) {
			plateau.affiche();
			
			System.out.println("Joueur blanc voulez vous passez ? (o/n)");
			
			if (sc.nextLine().equals("o")) {
				
				blanc.setPasserTour(true);
				
				
			}
			
			else {
				System.out.println("Coordonee x ? : ");
				x = sc.nextInt();
				System.out.println("Coordonee y ? : ");
				y = sc.nextInt();
				blanc.placerPierre(x, y);
				plateau.affiche();
				
				
			}
			System.out.println("Joueur noir voulez vous passez ? (o/n)");
			

			if (sc.nextLine().equals("o")) {
				
				noir.setPasserTour(true);
				
				
			}
			
			else {
				System.out.println("Coordonee x ? : ");
				x = sc.nextInt();
				System.out.println("Coordonee y ? : ");
				y = sc.nextInt();
				noir.placerPierre(x, y);
				
			}
			
			
		}
		
		
		System.out.println("Partie terminer ");
		
		
		
	}
}