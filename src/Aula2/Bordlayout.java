package Aula2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Bordlayout {
	private JFrame fr;
	private JButton bNorte;
	private JButton bSul;
	private JButton bCentro;
	private JButton bEste;
	private JButton bOeste;
	private JPanel po;
	private JPanel pe;
	
	
	public Bordlayout(){
		
		fr = new JFrame();
		fr.setSize(650,350); // comprimento e altura
		fr.setTitle("BordLayout");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new BorderLayout());
		po = new JPanel();
		pe = new JPanel();
		bNorte = new JButton("NOrte");
		bSul = new JButton("Sul");;
		bEste = new JButton("Este");
		bOeste = new JButton("oeste");
		bCentro = new JButton("Centro");
		
		
		/*fr.add("Center",bCentro);
		fr.add("East",bEste);
		fr.add("North",bNorte);
		fr.add("South",bSul);
		fr.add("West",bOeste);*/
		
		pe.setLayout(new GridLayout());
		pe.add(bEste);
		pe.add(bCentro);
		pe.add(bSul);
		pe.add(bOeste);
		pe.add(bNorte);
		fr.add("East",pe);
		
		
		fr.setVisible(true);
	}

}
