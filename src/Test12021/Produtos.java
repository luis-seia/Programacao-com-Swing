package Test12021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Produtos implements ActionListener {
	private JFrame fr;
	private JButton bt1, bt2, bt3, bt4, bt5;
	private JLabel lb1, lb2, lb3, lb4, lb5, lb6;
	private JMenu menu;
	private  JMenuBar bara;
	private JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
	private JTextArea txta;
	private JScrollPane scp;
	
	
	public Produtos() {
		instanciar();
		propriedades();
		adicionar();
		event();
	}
	
	
	
	public void adicionar()  {
		
		bara.add(menu);
		
		
		p4.add(bt1);
		p5.add(bt2);
		p6.add(bt3);
		p7.add(bt4);
		
		p1.add(new JLabel());
		p1.add(p4);
		p1.add(new JLabel());
		p1.add(p5);
		p1.add(new JLabel());
		p1.add(p6);
		p1.add(new JLabel());
		p1.add(p7);
		p1.add(new JLabel());
		
		
		p9.add(bt5);
		
		
		p8.add(scp);
		p8.add(p9);
		p2.add(BorderLayout.NORTH,new JLabel("\n "));
		p2.add(BorderLayout.WEST,new JLabel("    "));
		p2.add(BorderLayout.EAST,new JLabel("   "));
		p2.add(BorderLayout.CENTER,p8);
		
		p3.add(lb1);
		p3.add(lb2);
		p3.add(lb3);
		p3.add(lb4);
		p3.add(lb5);
		p3.add(lb6);
		
		
		
		fr.setJMenuBar(bara);
		fr.add("Center",p2);
		fr.add("West",p1);
		fr.add("East",p3);
		
	}
	
	
	
	public void instanciar() {
		fr = new JFrame();
		fr.setSize(700,600);
		
		
		bt1 = new JButton("Frango");
		bt1.setSize(20,20);
		bt2 = new JButton("Farinha");
		bt3 = new JButton("Arroz");
		bt4 = new JButton("Massa");
		bt5 = new JButton("Finalizar Compra");
		
		txta = new JTextArea(20,20);
		txta.setEditable(false);
		scp = new JScrollPane(txta);
		
	
		
		
		menu = new JMenu("Menu");
		bara = new JMenuBar();
		
		lb1 = new JLabel("Valor dos Produtos");
		lb1.setForeground(Color.blue);
		lb2 = new JLabel();
		lb3 = new JLabel("Valor do Iva");
		lb3.setForeground(Color.blue);
		lb4 = new JLabel();
		lb5 = new JLabel("valor total");
		lb5.setForeground(Color.blue);
		lb6 = new JLabel();
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		
		
		
		fr.setLayout(new BorderLayout());
		fr.setTitle("Menu");
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		p1.setLayout(new GridLayout(9,1,30,30));
		p1.setBackground(Color.BLUE);
		p4.setBackground(Color.BLUE);
		p5.setBackground(Color.BLUE);
		p6.setBackground(Color.BLUE);
		p7.setBackground(Color.BLUE);
		
		p2.setLayout(new BorderLayout());
		
		p3.setLayout(new GridLayout(10, 1));
		p8.setLayout(new GridLayout(2,1));
		
		fr.setVisible(true);
		
	}
	
	public void propriedades() {
		
		
	}
	
	public void event() {
		 bt1.addActionListener(this);
		 bt2.addActionListener(this);
		 bt3.addActionListener(this);
		 bt4.addActionListener(this);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==bt1) {
			txta.setText("Frango-120 \n");
		}
		if (e.getSource()==bt2) {
			txta.setText("Farinha-80 \n");
				}
		if (e.getSource()==bt3) {
			txta.setText("Arroz-20 \n");
		}
		if (e.getSource()==bt4) {
			txta.setText("Frango-120 \n");
		}


		
	}

}
