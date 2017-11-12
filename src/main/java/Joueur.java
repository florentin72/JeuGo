// class des joueurs 

public class Joueur {
	
	
	String couleur;
	Plateau plateau;
	int nbPierrreCapture;
	int score;
	boolean passerTour;
	Joueur(String c , Plateau p){
		
		couleur = c;
		plateau = p;
		nbPierrreCapture = 0;
		score = 0;
		passerTour = false;
	}
	
	void placerPierre(int x , int y ) {
		if (x<= Plateau.nbLignes && y < Plateau.nbColonnes){
		if (Plateau.jeu[x][y].couleur.equals(" - ")) {
			
			
			if (couleur.equals("Blanc")) {
				
				Plateau.jeu[x][y].couleur = " B ";
				
			}
			
			if (couleur.equals("Noir")) {
				
				Plateau.jeu[x][y].couleur = " N ";
				
			}
			
			
			
		}
		
		else {
			System.out.println("Place deja prise ");
		}
		
		}
		else {
			
			System.out.println("Coordonnees hors du plateau");
		}
		

		
	}

	
	void passerTour () {
		
		passerTour = true;
	}
}
