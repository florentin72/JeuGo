package exception;
/**
 * 
 * @author Florentin
 * Classe gérant les exceprion lorsqu'on place une pierre
 *
 */
public class ExceptionPlacerPierre extends Exception {
	
	/**
	 * Si la pierre est hors du plateau
	 */
	public ExceptionPlacerPierre (){
		
		
		System.out.println("La pierre est hors du plateau");
		
		
	}
	/**
	 * 
	 * @param a
	 * Si une pierre est deja positionner a l'endroit voulu
	 * Le parametre ne sert juste pour différencir les deux constructeurs
	 */
	
public ExceptionPlacerPierre (int a ){
		
		
		System.out.println(" Une pierre est deja sur les coordonne saisie ");
		
		
	}
}
 