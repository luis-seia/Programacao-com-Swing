package Aula4;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaLogin implements ActionListener {
	private JFrame fr;
	private JLabel labelA;
	private JLabel labeUser;
	private JLabel labeSenha;
	private JTextField senha;
	private JTextField user;
	private JButton bt;
	private JButton btLimpar;
	
	
	public TelaLogin() {
		fr = new JFrame();
		fr.setSize(650,350); // comprimento e altura
		fr.setTitle("GridLayout");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		
		labelA = new JLabel("Login");
		labeUser = new JLabel("User: ");
		labeSenha = new JLabel("Senha: ");
		bt = new JButton("Autenticar");
		btLimpar = new JButton("Limpar");
		senha = new JTextField(20);
		user = new JTextField(20);
		bt.addActionListener(this);
		btLimpar.addActionListener(this);
		fr.add(btLimpar);
		fr.add(labelA);
		fr.add(new JLabel());
		fr.add(labeUser);
		fr.add(user);
		fr.add(labeSenha);
		fr.add(senha);
		fr.add(btLimpar);
		fr.add(bt);
		fr.add(new JLabel());
		
		
		fr.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bt) {
			if(user.getText().equals("adm") & senha.getText().equals("1234")) {
				fr.dispose();
				JOptionPane.showMessageDialog(null,"usuario valido");
				
			}else {
				fr.dispose();
				JOptionPane.showMessageDialog(null, "usuario invalido");
			}
		}
		if(e.getSource() == btLimpar) {
			user.setText("");
			senha.setText("");
		}
		
	}
}
