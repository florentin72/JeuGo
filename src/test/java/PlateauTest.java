import static org.junit.Assert.*;

import org.junit.Test;

import enumeration.Couleur;
import exception.ExceptionPlacerPierre;

public class PlateauTest {

	@Test
	public void testPlateau() {
		//fail("Not yet implemented");
	}

	@Test
	public void testAffiche() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSuppressionPierre() throws ExceptionPlacerPierre {
		
		Plateau p = new Plateau (10,10);
		
		
		Joueur blanc = new Joueur (Couleur.Blanc,p,"JP");
		Joueur noir = new Joueur (Couleur.Noir,p,"JPpp");
		
		
		blanc.placerPierre(0, 0);
		noir.placerPierre(0,1);
		noir.placerPierre(1, 0);
		System.out.println( Plateau.jeu[0][0].getCouleur());
		assertEquals("Erreur", Plateau.jeu[0][0].getCouleur(),Couleur.None );
		
		
	}

}
