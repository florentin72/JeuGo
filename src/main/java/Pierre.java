import enumeration.Couleur;

/**
 * @author Florentin
 * classe representants les pierres
 */
public class Pierre {
	
	private Couleur couleur;  /* enumeration */ 
	private int posX;
	private int posY;
	private int degreLib; 
	private boolean isInGroupe;
	 //Pierre haut,bas,gauche,droite;
	 
	 /**
	  * Constructeur qui iniatialise le nombre de degre de liberté d'une pierre a 4
	  * 
	  */
	 public Pierre(){
		 
		degreLib =4;
		isInGroupe = false;
		 
	 }
	 
	 
	/**
	 * Methode toString
	 */
	public String toString () {
		
		return ("La pierre est en "+ getPosX() + ", " + getPosY() +" et est de couleur "+ getCouleur());
		
	}
	
	/**
	 * 
	 * Methode pour detecter les voisins d'une pierre et la supprimer si elle est entouré 
	 */
	void detecterVoisin () { 
		
		Couleur ennemi = Couleur.None; 
		if (this.couleur == Couleur.Blanc) {
			
			ennemi = Couleur.Noir;
		}
		
		if (this.couleur == Couleur.Noir) {
			
			ennemi = Couleur.Blanc;
			
		}
		
		
		if (( posX==0 || Plateau.jeu[posX-1][posY].couleur == ennemi ) && (posX == Plateau.nbLignes-1 || Plateau.jeu[posX+1][posY].couleur == ennemi  ) && (posY == 0 || Plateau.jeu[posX][posY-1].couleur == ennemi  ) && ( posY == Plateau.nbColonnes-1 ||Plateau.jeu[posX][posY+1].couleur == ennemi )) {
			this.couleur = Couleur.None;
			System.out.println("pierre prise");
			
			
		}
	
		
	}
	/**
	 * 
	 * Calcul le nombre de degree de liberte d'une pierre
	 */
	
	void calculDegreeLiberte() {
		
		if ( posX==0 || Plateau.jeu[posX-1][posY].couleur != Couleur.None ) {
			
			degreLib --;
			
		}
		if (posX == Plateau.nbLignes-1 || Plateau.jeu[posX+1][posY].couleur != Couleur.None) {
			
			degreLib --;
		}
		if (posY == 0 || Plateau.jeu[posX][posY-1].couleur!= Couleur.None) {
			
			degreLib -- ;
		}
		
		if (posY == Plateau.nbColonnes-1 ||Plateau.jeu[posX][posY+1].couleur != Couleur.None) {
			
			degreLib --;
		}
		
	}
	
	/**
	 * 
	 * Methode pour reunir les pierres en groupes
	 * 
	 */
	void formationGroupe () {
		calculDegreeLiberte();
	
			GroupePierre groupe = new GroupePierre(getCouleur());
		
			if (!isInGroupe) {
				 groupe.getListPierre().add(this);
				 isInGroupe = true;
				
			
			if (posX != 0) {
				if ( Plateau.jeu[posX+1][posY].couleur == getCouleur()) {
					groupe.getListPierre().add(Plateau.jeu[posX+1][posY]);
					 Plateau.jeu[posX+1][posY].isInGroupe = true;
				}
			}
			
			if (posX != Plateau.nbLignes-1 ) {
				if (Plateau.jeu[posX+1][posY].couleur == getCouleur()) {
					groupe.getListPierre().add(Plateau.jeu[posX+1][posY]);
					Plateau.jeu[posX+1][posY].isInGroupe = true;
				}
				
				if (posY != 0 ) {
					if (Plateau.jeu[posX][posY-1].couleur == getCouleur()) {
						groupe.getListPierre().add(Plateau.jeu[posX][posY-1]);
						Plateau.jeu[posX][posY-1].isInGroupe = true;
						
						
					}
					
					
				}
				
				if (posY != Plateau.nbColonnes-1) {
					if (Plateau.jeu[posX][posY+1].couleur == getCouleur()) {
						groupe.getListPierre().add(Plateau.jeu[posX][posY+1]);
						Plateau.jeu[posX][posY+1].isInGroupe = true;
						
					}
					
				}
			}
			
			Plateau.listGroupe.add(groupe);
			}
			
			else {
				
				
			}
		
		
	
		
		
		
		
	}


	

/**
 * 
 * 
 * getter et setters
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

	
	
	public int getDegreLib() {
		return degreLib;
	}


	public void setDegreLib(int degreLib) {
		this.degreLib = degreLib;
	}


	public boolean isInGroupe() {
		return isInGroupe;
	}


	public void setInGroupe(boolean isInGroupe) {
		this.isInGroupe = isInGroupe;
	}

	

}
