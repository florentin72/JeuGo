import enumeration.Couleur;

public class Pierre {
	
	private Couleur couleur;  /* enumeration */ 
	private int posX;
	private int posY;
	private int degreLib; 
	 //Pierre haut,bas,gauche,droite;
	 
	 
	 public Pierre(int x , int y , Couleur c ){
		 
	
		 posX = x ; 
		 posY = y; 
		 couleur = c ; 
		 
		 
	 }
	 
	 
	
	public String toString () {
		
		return ("La pierre est en "+ getPosX() + ", " + getPosY());
		
	}
	
	
/*	void detecterVoisin () { 
		
		System.out.println("entree ");
		Couleur ennemi; 
		if (this.couleur ==  (Couleur.Blanc) ) {
			System.out.println("NOIR ***********************************");
			ennemi = Couleur.Noir;
		}
		
		if (this.couleur== (Couleur.Noir)) {
			
			ennemi = Couleur.Blanc;
			System.out.println("BLANC ***********************************");
		}
		else {
			System.out.println("si t'es la c'est pas bon");
			ennemi = null;
		}
		
		if (( posX==0 || Plateau.jeu[posX-1][posY].couleur == ennemi ) && (posX == Plateau.nbLignes || Plateau.jeu[posX+1][posY].couleur == ennemi  ) && (posY == 0 || Plateau.jeu[posX][posY-1].couleur == ennemi  ) && ( posY == Plateau.nbColonnes ||Plateau.jeu[posX][posY+1].couleur == ennemi )) {
			this.couleur = Couleur.None;
			Plateau.jeu[posX][posY].setCouleur(Couleur.None);
			System.out.println("pierre prise");
			
		}
		
		
		
	}

*/

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
