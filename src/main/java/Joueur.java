// class des joueurs 

public class Joueur {
	
	
	String couleur;
	Plateau plateau;
	Joueur(String c , Plateau p){
		
		couleur = c;
		
		
	}
	
	void placerPierre(int x , int y ) {
		if (x<= Plateau.nbLignes && y < Plateau.nbColonnes){
		if (Plateau.jeu[x][y].val.equals(" - ")) {
			
			
			if (couleur.equals("Blanc")) {
				
				Plateau.jeu[x][y].val = "B";
				
			}
			
			if (couleur.equals("Noir")) {
				
				Plateau.jeu[x][y].val = "N";
				
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

}
