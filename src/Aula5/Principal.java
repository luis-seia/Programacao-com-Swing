package Aula5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal implements ActionListener{
	private JFrame fr;
	private JLabel ln1;
	private JLabel ln2;;
	private JLabel ln3;
	private JButton bt;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtres;
	
	
	public Principal() {
		fr = new JFrame();
		fr.setSize(300,300);
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setLayout(new GridLayout(4,2,10,10));
		
		ln1 = new JLabel("Numeero 1");
		ln2 = new JLabel("Numero 3");
		ln3 = new JLabel("Resultado");
		bt = new JButton("Calcular");
		
		txt1 = new  JTextField(); 
		txt2 = new  JTextField(); 
		txtres = new  JTextField(); 
		txtres.setEditable(false);
		
		fr.add(ln1);
		fr.add(txt1);
		fr.add(ln2);
		fr.add(txt2);
		fr.add(bt);
		fr.add(new JLabel());
		fr.add(ln3);
		fr.add(txtres);
		
		
		  txt1.addActionListener(this);
		  txt2.addActionListener(this);
		  txtres.addActionListener(this);
		  bt.addActionListener(this);
		  
		

		
		fr.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) {
			try {
			float nu1 = Float.parseFloat(txt1.getText().trim());
			float nu2 = Float.parseFloat(txt2.getText().trim());
			float res = nu1 + nu2;
			txtres.setText(Float.toString(res));
			}catch(NumberFormatException e3) {
				JOptionPane.showMessageDialog(null, "Operacao invalida");
			}
		}
		
	}

}
