import java.util.ArrayList;

import org.apache.log4j.Logger;

import enumeration.Couleur;


public class Plateau {

	
	static int nbLignes; 
	static int nbColonnes; 
	
	static ArrayList<Pierre> listPierre = new ArrayList <Pierre>  (); 
	
	
	public Plateau (int n , int p){
		
		nbLignes = n;
		nbColonnes = p;
		
		
			
		}
		
	
	
	void affiche () {
		
		
		int i,j=0 ; 
		String affiche = null;
		
		for (i=0;i<nbLignes;i++) {
			
			for (j=0;j<nbColonnes;j++) {
				
				
					
					affiche = " + ";
				

				

			
				
				System.out.print(affiche);
				
			}
			System.out.println();
		}
		
		
	}
	
	
	 void suppressionPierre () {
		
		for (Pierre p : listPierre) {
			
			
		//	p.detecterVoisin();
			System.out.println(p);
			
			
			
			
		}
		
		
		
	}
	
	
}
