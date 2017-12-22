
public class Intersection {

	
	
	private Pierre pierre ; 
	private int x ;
	private int y; 
	
	
	public Intersection ( int x , int y ) {
		
		this.x = x;
		this.y = y;
		
		
	}
	
	
	public Intersection ( int x , int y, Pierre p  ) {
		
		this.x = x;
		this.y = y;
		this.pierre = p ;
		
	}


	public Pierre getPierre() {
		return pierre;
	}


	public void setPierre(Pierre pierre) {
		this.pierre = pierre;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
}
