
public class Pierre {
	
	String couleur;  /* enumeration */ 
	private int posX;
	private int posY;
	 
	 Pierre haut,bas,gauche,droite;
	 
	 
	 Pierre(){
		 
		
		 
		 
	 }
	 
	 
	
	public String toString () {
		
		return ("La pierre est en "+ getPosX() + ", " + getPosY());
		
	}
	
	
	void detecterVoisin () {
		
		this.haut = new Pierre ();
		this.bas = new Pierre();
		this.droite = new Pierre();
		this.gauche = new Pierre ();
		
		if (getPosX() == 0) {
			
			haut = null;
			
		}
		if (getPosY() == 0 ) {
			
			this.gauche = null;
		}
		if (getPosY() == Plateau.nbColonnes-1 )
			
		if (!Plateau.jeu[getPosX()][getPosY()].couleur.equals(" - ")) {

			haut.setPosX(getPosX()-1); 
			haut.setPosY(posY); 
			haut.couleur = Plateau.jeu[getPosX()-1][getPosY()].couleur ;
		
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

	
	
	
	

}
