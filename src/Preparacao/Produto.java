package Preparacao;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Produto implements ActionListener{
	private JFrame fr;
	private JLabel nr, ref, des, custo, lucro, venda;
	private JTextField txt1, txt2, txt3, txt4, txt5, txt6;
	private JButton bt1, bt2;
	int id =1;
	
	
	
	
	
	public Produto() {
		fr = new JFrame();
		fr.setSize(600,500);
		fr.setTitle("Registo de produto");
		fr.setLayout(new GridLayout(7,2,10,10));
		
		txt1 = new JTextField();
		txt1.setEditable(false);
		
		txt1.setText(String.valueOf(id));
		txt2 = new JTextField();
		txt3 = new JTextField();
		txt4 = new JTextField();
		txt4.addActionListener(this);
		txt5 = new JTextField();
		txt5.setEditable(false);
		txt6 = new JTextField();
		txt6.setEditable(false);
		
		nr = new JLabel("Numero");
		ref = new JLabel("Referencia");
		des = new JLabel("Descricao");
		custo = new JLabel("Custo");
		lucro = new JLabel("Lucro");
		venda = new JLabel("Venda");
		
		bt1 = new JButton("Gravar");
		bt1.addActionListener(this);
		bt2 = new JButton("Novo");
		bt2.addActionListener(this);
		
		fr.add(nr);
		fr.add(txt1);
		fr.add(ref);
		fr.add(txt2);
		fr.add(des);
		fr.add(txt3);
		fr.add(custo);
		fr.add(txt4);
		fr.add(lucro);
		fr.add(txt5);
		fr.add(venda);
		fr.add(txt6);
		fr.add(bt1);
		fr.add(bt2);
		
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt2) {
			id+=1;
			txt1.setText(String.valueOf(id));
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
			txt5.setText("");
			txt6.setText("");
			
		}
		if(e.getSource() == bt1) {
			if(txt4.getText()!=null || txt2.getText()!=null || txt3.getText()!=null || txt5.getText()!=null || txt6.getText()!=null ) {
				Double valor =Double.parseDouble(txt4.getText());
				double lucro = 0.15*valor;
				txt5.setText(String.valueOf(lucro));
				double venda = lucro+valor;
				txt6.setText(String.valueOf(venda));
				
				new Product(txt1.getText(), txt2.getText(), txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText());
			}else {
				JOptionPane.showMessageDialog(null, "Prencha todos campos");
			}
		}
	
	}
	
}
