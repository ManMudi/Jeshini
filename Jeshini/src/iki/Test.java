package iki;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
		Login l=new Login();
		l.setSize(610,330);
	   // l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.setResizable(false);
		l.setLocation(350,200);
		l.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
	    
	        Primary pri=new Primary();
	     //  pri.setVisible(true);
	        pri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pri.setSize(1365,775);
			pri.setResizable(false);
			pri.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
				
			   Level level=new Level();
		       level.setVisible(true);
				level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				level.setSize(1365,775);
				level.setResizable(false);
				level.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
	            
	            Mudi m=new Mudi();
	      	//    m.setVisible(true);
	      		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      		m.setSize(1365,775);
	      		m.setResizable(false);
	      	    m.setIconImage(Toolkit.getDefaultToolkit().getImage(l.getClass().getResource("/lo.png")));
	  

	}

}
