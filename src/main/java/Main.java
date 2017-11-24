import sauvegarde.Serialisation;

public class Main {

	public static void main (String args []) {
		
		Plateau plateau = new Plateau (10,10);
		plateau.affiche();
		Joueur blanc = new Joueur("Blanc", plateau, "Flo");
		blanc.placerPierre(3, 3);
		System.out.println("\n \n \n");
		plateau.affiche();
		
		blanc.placerPierre(2, 3);
		System.out.println("\n \n \n");
		plateau.affiche();
		
		
		Plateau.jeu[2][3].detecterVoisin();
		System.out.println(Plateau.jeu[2][3].haut);
		Pierre pierre = new Pierre ();
		pierre.setPosX(10);
		pierre.setPosY(7);
		pierre.setCouleur("Blanc");
		 try {
	           
	            Serialisation.encodeToFile(pierre, "sauvegarde.xml");
	         
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
		
		
	}
}