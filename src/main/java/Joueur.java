
import enumeration.Couleur;
import exception.ExceptionPlacerPierre;

// class des joueurs 

public class Joueur {
	
	
	 private Couleur couleur;
	
	 private int nbPierrreCapture;
	 private int score;
	 private boolean passerTour;
	 /* nombre de pierre capturer*/
	 private int nbPrisonnier;
	 private String pseudo;
	 
	 
	public Joueur(Couleur c , Plateau p , String pseud){
		this.pseudo = pseud;
		
		couleur = c;
		passerTour = false ;
	
		setNbPierrreCapture(0);
		setScore(0);
		setPasserTour(false);
	}
	
	void placerPierre(int x , int y ) throws ExceptionPlacerPierre {
		if (x<= Plateau.nbLignes && y < Plateau.nbColonnes){
			if (Plateau.jeu[x][y].getCouleur().equals(Couleur.None)) {
			
			
			if (couleur == Couleur.Blanc) {
				
				Plateau.jeu[x][y].setCouleur(Couleur.Blanc);
				
			}
			
			if (couleur == Couleur.Noir) {
				
				Plateau.jeu[x][y].setCouleur(Couleur.Noir);
				
			}
			
			
			
		}
		
		else {
			//System.out.println("Place deja prise ");
			throw new ExceptionPlacerPierre (41);
		}
		
		}
		else {
			
			
			throw new ExceptionPlacerPierre ();
			//System.out.println("Coordonnees hors du plateau");
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
