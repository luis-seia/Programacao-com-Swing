package aula6;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Tela1 implements ActionListener {
	private JFrame fr;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	
	
	public Tela1() {
		fr = new JFrame();
		fr.setSize(500, 450);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setLayout(new GridLayout(3,2,40,80));
		
		ImageIcon mg1 = new ImageIcon("D:\\Projetos\\JAVA-SRC\\Programacao3\\src\\aula6\\icons.png\\gmail.png");
		
		bt1 = new JButton("Botao", mg1);
		bt1.setToolTipText("Clique aqui");
		bt2 = new JButton("Botao", mg1);
		bt2.setToolTipText("Clique aqui");
		bt3 = new JButton("Botao", mg1);
		bt3.setToolTipText("Clique aqui");
		bt4 = new JButton("Botao", mg1);
		bt4.setToolTipText("Clique aqui");
		bt5 = new JButton("Botao", mg1);
		bt5.setToolTipText("Clique aqui");
		bt6 = new JButton("Botao", mg1);
		bt6.setToolTipText("Clique aqui");
		
		bt1.addActionListener(this);
		
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		fr.setIconImage(mg1.getImage());
		fr.setVisible(true);

		}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			new Tela2();
		}
		
	}
}
