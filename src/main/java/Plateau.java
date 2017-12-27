import java.util.ArrayList;

import org.apache.log4j.Logger;

import enumeration.Couleur;

/**
 * 
 * 
 * @author Florentin
 * Classe representant le Plateau
 */
public class Plateau {

	
	static int nbLignes; 
	static int nbColonnes; 
	static Pierre  [][]  jeu ;
	static ArrayList<Pierre> listPierre = new ArrayList <Pierre>  (); 
	
	/**
	 * 
	 * @param n
	 * @param p
	 * Constructeur du plateau avec la longueur et la largeur en parametre 
	 */
	public Plateau (int n , int p){
		int i,j;
		nbLignes = n;
		nbColonnes = p;
		jeu =  new Pierre [nbLignes][nbColonnes] ;
		for ( i =0 ; i< nbLignes ; i++) {
			for ( j=0 ; j<nbColonnes; j++) {
				
				jeu[i][j]= new Pierre(); 
				jeu[i][j].setPosX(i);
				jeu[i][j].setPosY(j);
				 
				jeu[i][j].setCouleur(Couleur.None);
				
			}
			
		}
		
	}
	/**
	 * 
	 * methode qui affiche le plateau
	 */
	void affiche () {
		
		
		int i,j=0 ; 
		String affiche = null;
		
		for (i=0;i<nbLignes;i++) {
			
			for (j=0;j<nbColonnes;j++) {
				
				if (jeu[i][j].getCouleur() == Couleur.None ) {
					
					affiche = " + ";
				}

				if (jeu[i][j].getCouleur() == Couleur.Noir ) {
					
					affiche = " N ";
				}

				if (jeu[i][j].getCouleur() == Couleur.Blanc ) {
					
					affiche = " B ";
				}
				
				System.out.print(affiche);
				
			}
			System.out.println();
		}
		
		
	}
	
	/**
	 * 
	 * Methode qui supprime les pierres entouré dans du plateau
	 */
	void suppressionPierre () {
		
		int i,j;
		for (i=0;i<nbLignes;i++) {
			
			for (j=0;j<nbColonnes;j++) {
				
				jeu[i][j].detecterVoisin();
				System.out.println(jeu[i][j]);
				
				
			}
			
		
			
			
		}
		
		
		
	}
	
	
}
