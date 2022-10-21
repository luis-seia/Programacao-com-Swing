package Aula4;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela1  implements ActionListener{
	private JFrame fr;
	private JTextField txt;
	private JButton bt;
	private JButton btLimpar;
	
	public Tela1() {
		
		fr = new JFrame();
		fr.setSize(650,350); 
		fr.setTitle("FlowLayout");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		//fr.setLayout(new FlowLayout(FlowLayout.RIGHT));
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
		txt = new JTextField(20);
		bt = new JButton("Submeter");
		btLimpar = new JButton("Limpar");
		bt.addActionListener(this);
		btLimpar.addActionListener(this);
		fr.add(txt);
		fr.add(bt);
		fr.add(btLimpar);
		
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bt) {
			JOptionPane.showMessageDialog(null, txt.getText());
		}
		if(e.getSource() == btLimpar) {
			txt.setText("");
		}
		
	}

}
