package exception;

public class ExceptionPlacerPierre extends Exception {
	
	
	public ExceptionPlacerPierre (){
		
		
		System.out.println("La pierre est hors du plateau");
		
		
	}
	
public ExceptionPlacerPierre (int a ){
		
		
		System.out.println(" Une pierre est deja sur les coordonne saisie ");
		
		
	}
}
