

import org.apache.log4j.Logger;

import enumeration.Couleur;
import exception.ExceptionPlacerPierre;

/**
 * 
 * @author Florentin
 * Classe representnt les joueurs
 */
public class Joueur {
	
	final Logger logger = Logger.getLogger(Main.class.getName());
	 private Couleur couleur;
	
	 private int nbPierrreCapture;
	 private int score;
	 private boolean passerTour;
	 /* nombre de pierre capturer*/
	 private int nbPrisonnier;
	 private String pseudo;
	 
	 /**
	  * 
	  * @param c
	  * @param p
	  * @param pseud
	  * 
	  * Constructeur de joueur
	  */
	public Joueur(Couleur c , Plateau p , String pseud){
		this.pseudo = pseud;
		
		couleur = c;
		passerTour = false ;
	
		setNbPierrreCapture(0);
		setScore(0);
		setPasserTour(false);
	}
	/**
	 * 
	 * 
	 * @param x
	 * @param y
	 * @throws ExceptionPlacerPierre
	 * Methode pour placer une pierre
	 */
	void placerPierre(int x , int y ) throws ExceptionPlacerPierre {
		if (x<= Plateau.nbLignes && y < Plateau.nbColonnes){
			if (Plateau.jeu[x][y].getCouleur().equals(Couleur.None)) {
			
			
			if (couleur == Couleur.Blanc) {
				
				Plateau.jeu[x][y].setCouleur(Couleur.Blanc);
				Plateau.listPierre.add(Plateau.jeu[x][y]);
				
			}
			
			if (couleur == Couleur.Noir) {
				
				Plateau.jeu[x][y].setCouleur(Couleur.Noir);
				Plateau.listPierre.add(Plateau.jeu[x][y]);
				
			}
			
			
			
		}
		
		else {
		
			throw new ExceptionPlacerPierre (41);
			
			
		}
		
		}
		else {
			
			
			throw new ExceptionPlacerPierre ();
		}
		

		
	}
	
	
	
	

	/**
	 * Methode pour passer son tour
	 */
	void passerTour () {
		
		setPasserTour(true);
	}
	
	/**
	 * 
	 * Getters et setters
	 */

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
