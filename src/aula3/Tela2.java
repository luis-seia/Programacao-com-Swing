package aula3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela2 {
	private JFrame fr;
	private ImageIcon img;
	private JLabel lb_img;
//	private JLabel lb_cores;
	private JPanel pn1, pn2, pn3;
	
	public Tela2() {
		fr = new JFrame();
		fr.setSize(400,400);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setTitle("Tela 1");
		fr.setLayout(new GridLayout(1,2));
		img = new ImageIcon("D:\\David Junior\\Faculdade\\Semestre 4 - LECC\\Fallen_Angel_Painting.jpg");
		lb_img = new JLabel(img);
		fr.add(lb_img);
		
		pn1 = new JPanel();
		pn1.setLayout(new GridLayout(2,1));
//		pn1.add(new JLabel("Vermelho Verde Amarelo Azul"));
		
		
		pn2 = new JPanel();
		pn2.setLayout(new FlowLayout());
		pn2.add(new JLabel("Vermelho")).setForeground(Color.RED);
		pn2.add(new JLabel("Verde")).setForeground(Color.GREEN);
		pn2.add(new JLabel("Amarelo")).setForeground(Color.YELLOW);
		pn2.add(new JLabel("Azul")).setForeground(Color.BLUE);
		
		pn3 = new JPanel();
		pn3.setLayout(new FlowLayout());
		pn3.add(new JButton("Vermelho")).setBackground(Color.RED);
		pn3.add(new JButton("Amarelo")).setBackground(Color.YELLOW);
		pn3.add(new JButton("Azul")).setBackground(Color.BLUE);
		
		pn1.add(pn2);
		pn1.add(pn3);
		fr.add(pn1);
		fr.setVisible(true);
	}
}
