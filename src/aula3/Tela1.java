package aula3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela1 {

	private JFrame fr;
//	private ImageIcon img;
//	private JLabel lb_img;
	private JPanel pn1;

	public Tela1() {
		fr = new JFrame();
		fr.setSize(400,400);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setTitle("Tela 3");
		fr.setLayout(new GridLayout(5,1));
		
		pn1 = new JPanel();
		
		fr.add(new JLabel());
		fr.add(new JLabel("Tela de Registro de Estudante")).setFont(new Font("Courier New", Font.BOLD, 30));
		fr.add(new JLabel());

		pn1.setLayout(new FlowLayout());
		pn1.add(new JButton("Vermelho")).setBackground(Color.RED);
		pn1.add(new JButton("Amarelo")).setBackground(Color.YELLOW);
		pn1.add(new JButton("Azul")).setBackground(Color.BLUE);
		fr.add(pn1);
		
		fr.add(new JLabel());
		
		
		
		fr.setVisible(true);
	}
}
