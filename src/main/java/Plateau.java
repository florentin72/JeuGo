
public class Plateau {

	
	static int nbLignes; 
	static int nbColonnes; 
	static Pierre  [][]  jeu ;
	
	Plateau (int n , int p){
		int i,j;
		nbLignes = n;
		nbColonnes = p;
		jeu =  new Pierre [nbLignes][nbColonnes] ;
		for ( i =0 ; i< nbLignes ; i++) {
			for ( j=0 ; j<nbColonnes; j++) {
				
				jeu[i][j]= new Pierre();
				jeu[i][j].posX = i;
				jeu[i][j].posY = j;
				
				jeu[i][j].couleur = " - ";
				
			}
			
		}
		
	}
	
	void affiche () {
		
		
		int i,j=0 ; 
		
		for (i=0;i<nbLignes;i++) {
			
			for (j=0;j<nbColonnes;j++) {
				
				System.out.print(jeu[i][j].couleur );
				
			}
			System.out.println();
		}
		
		
	}
}
