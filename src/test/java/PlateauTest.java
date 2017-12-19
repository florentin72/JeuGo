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
		
		
		blanc.placerPierre(5, 5);
		
		noir.placerPierre(4,5);
		noir.placerPierre(6, 5);
		noir.placerPierre(5, 4);
		noir.placerPierre(5, 6);
		p.suppressionPierre();

		System.out.println( p.jeu[5][5].getCouleur());
		
		assertEquals("Erreur",Couleur.None, p.jeu[5][5].getCouleur() );
		
		
	}

}
