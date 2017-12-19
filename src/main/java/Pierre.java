import enumeration.Couleur;

public class Pierre {
	
	private Couleur couleur;  /* enumeration */ 
	private int posX;
	private int posY;
	private int degreLib; 
	 //Pierre haut,bas,gauche,droite;
	 
	 
	 public Pierre(){
		 
		degreLib =4;
		 
		 
	 }
	 
	 
	
	public String toString () {
		
		return ("La pierre est en "+ getPosX() + ", " + getPosY());
		
	}
	
	
	void detecterVoisin () { 
		
		Couleur ennemi; 
		if (this.couleur == Couleur.Blanc) {
			
			ennemi = Couleur.Noir;
		}
		
		if (this.couleur == Couleur.Noir) {
			
			ennemi = Couleur.Blanc;
			
		}
		else {
			
			ennemi = null;
		}
		
		if (( posX==0 || Plateau.jeu[posX-1][posY].couleur == ennemi ) && (posX == Plateau.nbLignes || Plateau.jeu[posX+1][posY].couleur == ennemi  ) && (posY == 0 || Plateau.jeu[posX][posY-1].couleur == ennemi  ) && ( posY == Plateau.nbColonnes ||Plateau.jeu[posX][posY+1].couleur == ennemi )) {
			this.couleur = Couleur.None;
			Plateau.jeu[posX][posY].setCouleur(Couleur.None);
			System.out.println("pierre prise");
			
		}
		
		
		
	}



	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	public Couleur getCouleur() {
		return couleur;
	}



	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	
	
	
	

}
