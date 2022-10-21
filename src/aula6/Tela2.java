package aula6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela2 {
	private JFrame fr;
	private JLabel lb;
	private JCheckBox c1, c2, c3 ,c4, c5;
	private JPanel p1, p2;
	
	public Tela2() {
		fr = new JFrame("Menu");
		fr.setSize(300,350);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setLayout(new BorderLayout());
		
		lb = new JLabel("Pratos Favoritos");
		lb.setForeground(Color.blue);
		
		
		c1 = new JCheckBox("Feijao");
		c2 = new JCheckBox("Frango");
		c3 = new JCheckBox("Peixe");
		c4 = new JCheckBox("camarao");
		c5 = new JCheckBox("Burger");
		
		
		p2 = new JPanel(new GridLayout(4,2));
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		p2.add(c5);
		fr.add("North",lb);
		fr.add("Center", p2);
		
				
		
		
		
		fr.setVisible(true);
		
	}
}
