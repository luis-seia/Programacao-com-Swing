package Aula2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gridlayout {
	private JFrame fr;
	private JLabel labelA;
	private JLabel labeUser;
	private JLabel labeSenha;
	private JTextField senha;
	private JTextField user;
	private JButton bt;
	
	
	public Gridlayout() {
		fr = new JFrame();
		fr.setSize(650,350); // comprimento e altura
		fr.setTitle("GridLayout");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new GridLayout(4,2,10,15));
		
		labelA = new JLabel("Autenticacao");
		labeUser = new JLabel("User: ");
		labeSenha = new JLabel("Senha: ");
		bt = new JButton("Autenticar");
		senha = new JTextField();
		user = new JTextField();
		
		fr.add(labelA);
		fr.add(new JLabel());
		fr.add(labeUser);
		fr.add(user);
		fr.add(labeSenha);
		fr.add(senha);
		fr.add(bt);
		fr.add(new JLabel());
		
		
		fr.setVisible(true);
	}
}
