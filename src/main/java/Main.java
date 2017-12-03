import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import enumeration.Couleur;
import exception.ExceptionPlacerPierre;
import sauvegarde.Serialisation;

public class Main {

	public static void main (String args []) throws ExceptionPlacerPierre, IOException {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();
		
		
		
		System.out.println("Pseudo joueur blanc : ");
		Scanner sc = new Scanner (System.in);
		InputStreamReader stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(stream);
		Joueur blanc = new Joueur(Couleur.Blanc, plateau,reader.readLine() );
		
		System.out.println(blanc.getPseudo());
		
		System.out.println("Pseudo joueur noir : ");
		
		Joueur noir = new Joueur(Couleur.Noir, plateau, reader.readLine() );
		
		System.out.println(noir.getPseudo());
		
		int x,y;
		int i = 1;
		while (!blanc.isPasserTour() || !noir.isPasserTour()) {
		
			
			plateau.affiche();
			System.out.println("Tour numero : " +i);
			
			System.out.println("Joueur blanc voulez vous passez ? (o/n)");
			
			if (reader.readLine().equals("o")) {
			
				blanc.setPasserTour(true);
				
				
			}
			
			else {
				System.out.println("Coordonee x ? : ");
				x = sc.nextInt() ;
				System.out.println("Coordonee y ? : ");
				y =  sc.nextInt();
				blanc.placerPierre(x, y);
				plateau.suppressionPierre();
				plateau.affiche();
				
				
			}
			
			System.out.println("Joueur noir voulez vous passez ? (o/n)");
			
			if (reader.readLine().equals("o")) {
				
				noir.setPasserTour(true);
				
				
			}
			
			
			else {
				
				System.out.println("Coordonee x ? : ");
				x = sc.nextInt();
				System.out.println("Coordonee y ? : ");
				y = sc.nextInt();
				noir.placerPierre(x, y);
				plateau.suppressionPierre();
				
			}
			
			i++;
		}
		
		
		System.out.println("Partie terminer ");
		
		
		
	}
}