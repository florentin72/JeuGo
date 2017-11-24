// class des joueurs 

public class Joueur {
	
	
	 private String couleur;
	
	 private int nbPierrreCapture;
	 private int score;
	 private boolean passerTour;
	 /* nombre de pierre capturer*/
	 private int nbPrisonnier;
	 private String pseudo;
	 
	 
	public Joueur(String c , Plateau p , String pseud){
		this.pseudo = pseud;
		
		couleur = c;
	
		setNbPierrreCapture(0);
		setScore(0);
		setPasserTour(false);
	}
	
	void placerPierre(int x , int y ) {
		if (x<= Plateau.nbLignes && y < Plateau.nbColonnes){
		if (Plateau.jeu[x][y].getCouleur().equals(" - ")) {
			
			
			if (couleur.equals("Blanc")) {
				
				Plateau.jeu[x][y].setCouleur(" B ");
				
			}
			
			if (couleur.equals("Noir")) {
				
				Plateau.jeu[x][y].setCouleur(" N ");
				
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
		
		setPasserTour(true);
	}

	public boolean isPasserTour() {
		return passerTour;
	}

	public void setPasserTour(boolean passerTour) {
		this.passerTour = passerTour;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNbPierrreCapture() {
		return nbPierrreCapture;
	}

	public void setNbPierrreCapture(int nbPierrreCapture) {
		this.nbPierrreCapture = nbPierrreCapture;
	}

	public int getNbPrisonnier() {
		return nbPrisonnier;
	}

	public void setNbPrisonnier(int nbPrisonnier) {
		this.nbPrisonnier = nbPrisonnier;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
}
