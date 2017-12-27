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
		//Plateau.jeu[0][0].detecterVoisin();
		
		blanc.placerPierre(5, 5);
		noir.placerPierre(5,6);
		noir.placerPierre(5, 4);
		noir.placerPierre(4,5);
		noir.placerPierre(6, 5);
		//Plateau.jeu[5][5].detecterVoisin();
		p.suppressionPierre();
		assertEquals("Erreur", Plateau.jeu[5][5].getCouleur(),Couleur.None );
		assertEquals("Erreur", Plateau.jeu[0][0].getCouleur(),Couleur.None );
		
	}

}
