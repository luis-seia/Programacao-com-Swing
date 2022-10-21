package Preparacao;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login  implements ActionListener{
	private JButton bt1;
	private JButton bt2;
	private JTextField txt1;
	private JTextField txt2;
	private JFrame fr;
	private JLabel nome;
	private JLabel senha;
	
	
	
	public Login() {
		fr = new JFrame();
		fr.setTitle("Login");
		fr.setSize(400,400);
		fr.setLayout(new GridLayout(3,2,10,10));
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		bt1 = new JButton("Entar");
		bt1.addActionListener(this);
		bt2 = new JButton("Limpar");
		bt2.addActionListener(this);
		
		txt1 = new JTextField();
		txt2 = new JTextField();
		
		nome = new JLabel("nome");
		senha = new JLabel("senha");
		
		fr.add(nome);
		fr.add(txt1);
		fr.add(senha);
		fr.add(txt2);
		fr.add(bt1);
		fr.add(bt2);
		
		
		
		fr.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			if(txt1.getText().equals("adm") && txt2.getText().equals("123")) {
				new Menu();
				fr.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
			}
		}
		
		if(e.getSource()==bt2) {
			txt1.setText("");
			txt2.setText("");
		}
	}
}
