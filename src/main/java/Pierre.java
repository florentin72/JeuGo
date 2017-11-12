
public class Pierre {
	
	String couleur; /* 3 possiblitee : B , N , -*/

	 int posX;
	 int posY;
	 
	 Pierre haut,bas,gauche,droite;
	 
	 
	 Pierre(){
		 
		
		 
		 
	 }
	 
	 
	
	public String toString () {
		
		return ("La pierre est en "+ posX + ", " + posY);
		
	}
	
	
	void detecterVoisin () {
		
		this.haut = new Pierre ();
		this.bas = new Pierre();
		this.droite = new Pierre();
		this.gauche = new Pierre ();
		
		if (posX == 0) {
			
			haut = null;
			
		}
		if (posY == 0 ) {
			
			this.gauche = null;
		}
		if (posY == Plateau.nbColonnes-1 )
			
		if (!Plateau.jeu[posX][posY].couleur.equals(" - ")) {

			haut.posX = posX-1; 
			haut.posY = posY; 
			haut.couleur = Plateau.jeu[posX-1][posY].couleur ;
		
		}
		
		 
		
	}

	
	
	
	

}
