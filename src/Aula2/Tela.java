package Aula2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	private JFrame fr;
	private JLabel lb;
	private JTextField txt;
	private JButton bt;
	
	public Tela() {
		// basico para a tela
	fr = new JFrame();
	fr.setSize(650,350); // comprimento e altura
	fr.setTitle("FlowLayout");
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	fr.setLocationRelativeTo(null);
	//fr.setLayout(new FlowLayout(FlowLayout.RIGHT));
	fr.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
	
	// instanciar os compenentes a tela
	lb = new JLabel("Bem vindo ao sistema");
	txt = new JTextField(20);
	bt = new JButton("Submeter");
	
	// adicionar os componetes a tela
	fr.add(lb);
	fr.add(txt);
	fr.add(bt);
	
	
	
	fr.setVisible(true);
	
	}

}
