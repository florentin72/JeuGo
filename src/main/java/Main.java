import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.apache.log4j.Logger;
import enumeration.Couleur;
import exception.ExceptionPlacerPierre;

/**
 * 
 * 
 * @author Florentin
 * Classe principale contenant la methode main
 */

public class Main {

	
	/**
	 * 
	 * 
	 * @param args
	 * @throws ExceptionPlacerPierre
	 * @throws IOException
	 * Methode main
	 */
	public static void main (String args []) throws ExceptionPlacerPierre, IOException {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();

		final Logger logger = Logger.getLogger(Main.class.getName());
	
		logger.warn("Log warning");
		logger.info("Message info");
		logger.debug("Message de debug");
		logger.error("Message d'erreur");
		logger.fatal("Mesage fatal");
		logger.trace("Message trace");
		/*Pierre p1 = new Pierre();
		p1.setPosX(5);
		Pierre p2 = new Pierre();
		p2.setPosX(45);
		Pierre p3 = new Pierre();
		p3.setPosX(15);
		Pierre p4 = new Pierre();
		p4.setPosX(59);
		
		
		ArrayList <Pierre> list = new ArrayList <Pierre>();
		list.add(p1);
		list.add(p2);
		list.add(p4);
		list.add(p3);
		System.out.println("Avant trie");
		for (Pierre p : list) {
			
			System.out.println(p);
			
		}
		
		list.sort(new ComparatorPierre());
		System.out.println("apres trie");
		for (Pierre p : list) {
			
			System.out.println(p);
			
		}
		
		*/
		
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
				do {
				System.out.println("Coordonee x ? : ");
				x = sc.nextInt();
				}while(x<0 ||  x> plateau.nbLignes);
				
				do {
				System.out.println("Coordonee y ? : ");
				y = sc.nextInt();
				}while(y<0 ||  y>plateau.nbColonnes);
				
					noir.placerPierre(x, y);
				
				plateau.suppressionPierre();
				
				
			}
			
			i++;
		}
		
		
		System.out.println("Partie terminer ");
		
		
		
	}
	
	
	
}