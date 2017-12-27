
import org.junit.Test;

import enumeration.Couleur;

import static org.junit.Assert.*;

import exception.ExceptionPlacerPierre;
/**
 * 
 * @author Florentin
 * Test de la classe joueur
 */
public class JoueurTest {

	@Test
	public void testJoueur() {
		// fail("Not yet implemented");
	}

	@Test
	public void testPlacerPierre() {

		Plateau p = new Plateau(10, 10);
		Joueur blanc = new Joueur(Couleur.Blanc, p, "Flo");
		try {
			blanc.placerPierre(19, 19);
			fail("manque exception");
		} catch (ExceptionPlacerPierre e) {

		}

		try {
			blanc.placerPierre(0, 0);
			blanc.placerPierre(0, 0);

			fail("manque execption");
		} catch (ExceptionPlacerPierre e) {

		}

	}

	@Test
	public void testPasserTour() {
		// fail("Not yet implemented");
	}

}
