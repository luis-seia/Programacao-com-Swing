package Aula12;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela1 implements MouseListener{
	private JFrame fr;
	private JTextField txt;
	private JButton bt;
	private JLabel lb;
	
	
	public Tela1() {
		fr = new JFrame();
		fr.setTitle("MouseListener");
		fr.setSize(500,400);
		fr.setLayout(new FlowLayout());
		  
		txt = new JTextField(20);
		lb = new JLabel("Nome");
		
		bt = new JButton("Submeter");
		
		fr.add(lb);
		lb.addMouseListener(this);
		fr.add(txt);
		txt.addMouseListener(this);
		fr.add(bt);
		bt.addMouseListener(this);
		
		
		fr.setVisible(true);
	}
	
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(bt == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Click do mouse");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(txt == e.getSource()) {
			JOptionPane.showMessageDialog(null, "pressed mouse");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(lb == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Reased");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(lb == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Entered");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(txt == e.getSource()) {
			
		}
		
	}

}
