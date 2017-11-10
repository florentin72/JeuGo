
public class Main {

	public static void main (String args []) {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();
		Joueur blanc = new Joueur("Blanc", plateau);
		blanc.placerPierre(3, 3);
		System.out.println("\n \n \n");
		plateau.affiche();
		
		blanc.placerPierre(0, 3);
		System.out.println("\n \n \n");
		plateau.affiche();
		
		blanc.placerPierre(9, 9);
		System.out.println("\n \n \n");
		plateau.affiche();
		
		blanc.placerPierre(9, 10);
		System.out.println("\n \n \n");
		plateau.affiche();
	}
}