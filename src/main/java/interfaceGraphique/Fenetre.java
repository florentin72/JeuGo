package interfaceGraphique;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenetre extends JFrame {

	
	public Fenetre() {
			this.setTitle("Jeu de Go");
		    this.setSize(600, 600);
		    this.setLocationRelativeTo(null);
		    this.setResizable(false);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		    this.setContentPane(new Panel(new ImageIcon("plateau.png").getImage()));
		    this.setVisible(true);
		 
	}
	
	
	public static void main(String[] args) {
		
		
		
		Fenetre fen = new Fenetre ();
	
		  
	}

}
