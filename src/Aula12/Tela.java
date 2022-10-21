package Aula12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela implements ActionListener {
	private JFrame fr;
	private JButton bt;
	private JFileChooser fc;
	private JLabel lb;
	
	public Tela() {
		fr = new JFrame();
		fr.setSize(400,400);
		fr.setLayout(new FlowLayout());
		
		
		bt = new JButton("Ler ficheiro");
		bt.addActionListener(this);
		lb = new JLabel();
		fc = new JFileChooser();
		
		fr.add(bt);
		fr.add(lb);
	
		
		
		
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			fc.showOpenDialog(null);
			lb.setText(fc.getSelectedFile().getAbsolutePath());
		}
			
		
	}
}
