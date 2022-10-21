package Shanaya;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela implements ActionListener{
	private JFrame fr;
	private JButton bt1, bt2,bt3;
	private JLabel lb1, lb2, lb3, lb4, lb5, lbimg;
	private JComboBox cb;
	private JPanel p1,p2,p2_1,p2_2,p3,p4;
	private JTextField txt1, txt2;
	private ImageIcon img;
	
	public Tela() {
		instanciar();
		propriedades();
		adicionar();
		fr.setVisible(true);
	
	}
	
	
	public void instanciar() {
		fr = new JFrame();
		bt1 = new JButton("Dados do programador");
		bt1.addActionListener(this);
		bt2 = new JButton("Sair");
		bt2.addActionListener(this);
		bt3 = new JButton("Submeter");
		bt3.addActionListener(this);
		
		img = new ImageIcon("");
		
		lb1 = new JLabel("CaiXa 1");
		lb2 = new JLabel("CaiXa 2");
		lb3 = new JLabel("Escola a operacao que quiser");
		lb4 = new JLabel();
		lb5 = new  JLabel();
		lbimg = new JLabel(img);
		
		
		txt1 = new JTextField(10);
		txt2 = new JTextField(10);
		
		
		String op []= {"Soma","Subtracao","Divisao","Multiplicacao"};
		cb = new JComboBox<>(op);
		cb.addActionListener(this);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p2_1 = new JPanel();
		p2_2 = new JPanel();
		
		p3 = new JPanel();
		p4 = new JPanel();
	}
	
	public void propriedades() {
		fr.setSize(800,400);
		fr.setTitle("Exercicio 2");
		fr.setLayout(new BorderLayout());
		fr.setLocationRelativeTo(null);
		
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		p1.setBackground(Color.blue);
		
		p2.setLayout(new GridLayout(1,2));
		
		p2_2.setLayout(new FlowLayout(0,180, 20));
		
		p2_1.setLayout(new FlowLayout(0,180, 20));
		
		p3.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		p4.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		
	}
	
	public void adicionar() {
		p1.add(bt1);
		p1.add(bt2);
		p1.add(lbimg);
		fr.add("North",p1);
		
		
		p3.add(lb1);
		p3.add(txt1);
		p2_1.add(p3);
		p4.add(lb2);
		p4.add(txt2);
		p2_1.add(p4);
		
		p2.add(p2_1);
		
		p2_2.add(lb3);
		p2_2.add(cb);
		p2_2.add(bt3);
		p2_2.add(lb4);
		p2_2.add(lb5);;
		p2.add(p2_2);
		
		
		
		fr.add("Center",p2);
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(bt2 == e.getSource()) {
			System.exit(0);
		}
		if(bt1 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Shanaya karim");
		}
		if(bt3 == e.getSource()) {
			try {
				if(cb.getSelectedItem().equals("Soma")) {
					lb4.setText("Memoria "+txt1.getText() +"+"+ txt2.getText());
				double res = Double.parseDouble(txt1.getText())+Double.parseDouble(txt2.getText());
					lb5.setText("Resultadp " +String.valueOf(res));
				}if(cb.getSelectedItem().equals("Divisao")) {
					lb4.setText("Memoria "+txt1.getText() +"/"+ txt2.getText());
				double res = Double.parseDouble(txt1.getText())/Double.parseDouble(txt2.getText());
					lb5.setText("Resultadp " +String.valueOf(res));
				}if(cb.getSelectedItem().equals("Subtracao")) {
					lb4.setText("Memoria "+txt1.getText() +"-"+ txt2.getText());
					double res = Double.parseDouble(txt1.getText())-Double.parseDouble(txt2.getText());
					lb5.setText("Resultadp " +String.valueOf(res));
				}
				if(cb.getSelectedItem().equals("Multiplicacao")) {
					lb4.setText("Memoria "+txt1.getText() +"*"+ txt2.getText());
					double res = Double.parseDouble(txt1.getText())*Double.parseDouble(txt2.getText());
					lb5.setText("Resultadp " +String.valueOf(res));
					
					}
				}catch(Exception ex) {
					
				}
			}
			
			
		
	}
	

}
