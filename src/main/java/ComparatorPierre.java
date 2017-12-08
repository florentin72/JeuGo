

import java.util.Comparator;
 
public class ComparatorPierre implements Comparator <Pierre> {

	@Override
	public int compare(Pierre pierre1, Pierre pierre2) {

		
		
		
		return pierre1.getPosX()-pierre2.getPosX() ;
	}

}
