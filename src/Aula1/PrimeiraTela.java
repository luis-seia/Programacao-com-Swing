package Aula1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeiraTela {

	private JFrame fr;
	private JButton bt;
	private JLabel txNome;
	
	public PrimeiraTela() {
		fr = new JFrame();
		fr.setSize(650,450); // comprimento e altura
		fr.setTitle("Primeira Tela");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null); // localizacao inicial da tela
		bt = new JButton("Gravar");
		fr.setLayout(new FlowLayout());
		//bt.setSize(130,60);
		fr.add(bt);
		txNome = new JLabel("Nome");
		fr.add(txNome);
		
		
		
		fr.setVisible(true);
	}
	
	
	
}
