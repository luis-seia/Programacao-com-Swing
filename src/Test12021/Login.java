package Test12021;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login implements ActionListener{
	private JFrame fr;
	private JLabel nome;
	private JLabel senha;
	private JTextField txt;
	private JPasswordField pss;
	private JButton bt1, bt2;
	
	public Login() {
		fr = new JFrame();
		fr.setTitle("lOGIN");
		fr.setLayout(new GridLayout(3,2,15,15));
		fr.setSize(600,600);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		nome = new JLabel("Nome");
		senha = new JLabel("Senha");
		
		txt = new JTextField();
		
		pss = new JPasswordField();
		
		bt1 = new JButton("Entar");
		bt1.addActionListener(this);
		bt2 = new JButton("Limpar");
		
		
		fr.add(nome);
		fr.add(txt);
		fr.add(senha);
		fr.add(pss);
		fr.add(bt1);
		fr.add(bt2);
		
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt1) {
			if(txt.getText().equals("admin") && pss.getText().equals("123")) {
				new Produtos();
				fr.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "usario ou senha incorretos");
			}
			
		}
		
	}
}
