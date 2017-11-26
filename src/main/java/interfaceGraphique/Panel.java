package interfaceGraphique;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private Image img ;
	private JButton passeJ1;
	private JButton passeJ2;
	
	Panel (Image image){
		
		
		img = image;
		passeJ1 = new JButton("Passer");
		passeJ2 = new JButton("Passer");
		passeJ2.setEnabled(false);
		
		
		
		
	}
	 public void paintComponent(Graphics g) {
	        g.drawImage(img, 75, 100, null);
	       // g.drawString("Jeu de Go ", 250, 10);
	        this.add(passeJ1);
	        this.add(passeJ2);
	     
	    }

}
