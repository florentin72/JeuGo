import java.util.ArrayList;

import enumeration.Couleur;

public class GroupePierre {
	
	private Couleur couleur ;
	private ArrayList<Pierre> listPierre = new ArrayList<Pierre>(); 
	private boolean prisonnier;

	
	
	GroupePierre (Couleur c ){
		
		prisonnier = false; 
		couleur = c ;
		}
	
	
	
	
	public void testCaptureGroupe () {
		
		int i =0;
		for (Pierre p : listPierre) {
			p.calculDegreeLiberte();
			
			if (p.getDegreLib() != 0) {
				
				i++;
				
			}
			
		}
		
		if (i == 0) {
			
			prisonnier = true ;
		}
	}
	
	
	
	/**
	 * 
	 * Getters et Setters 
	 * 
	 */
	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}



	public boolean isLibre() {
		return prisonnier;
	}

	public void setLibre(boolean prisonnier) {
		this.prisonnier = prisonnier;
	}



	public ArrayList<Pierre> getListPierre() {
		return listPierre;
	}



	public void setListPierre(ArrayList<Pierre> listPierre) {
		this.listPierre = listPierre;
	}

	

}
