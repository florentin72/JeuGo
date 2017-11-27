import enumeration.Couleur;

public class Pierre {
	
	private Couleur couleur;  /* enumeration */ 
	private int posX;
	private int posY;
	 
	 //Pierre haut,bas,gauche,droite;
	 
	 
	 public Pierre(){
		 
		
		 
		 
	 }
	 
	 
	
	public String toString () {
		
		return ("La pierre est en "+ getPosX() + ", " + getPosY());
		
	}
	
	
	void detecterVoisin () { 
		
		
		
		
		
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
