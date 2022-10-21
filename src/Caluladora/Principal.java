package Caluladora;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal {
	
	private JLabel lb_numeros;
	private JPanel pn_tela, pn_botoes, pn_part1, pn_part2;
	private JFrame fr;
	private JButton bt_0,  bt_1, bt_2, bt_3, bt_4, bt_5, bt_6, bt_7, bt_8, bt_9;
	private JButton bt_mais, bt_menos, bt_vezes, bt_div, bt_ponto, bt_igual;
	private JButton bt_limpar, bt_limpar_tudo, bt_limparMemoria;
	private String txt;
	
	
	public  Principal() {
		fr = new JFrame();
		fr.setSize(340,545); 
		fr.setTitle("Calculadora");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setLayout(new BorderLayout());
	fr.setResizable(false);
		
		
		this.txt = " ";
		lb_numeros =new JLabel(txt);
		
		pn_botoes = new JPanel();
		pn_tela = new JPanel();
		pn_part1 = new JPanel();
		
		
		bt_0 = new JButton("0");
		bt_1 = new JButton("1");
		bt_2 = new JButton("2");
		bt_3 = new JButton("3");
		bt_4 = new JButton("4");
		bt_5 = new JButton("5");
		bt_6 = new JButton("6");
		bt_7 = new JButton("7");
		bt_8 = new JButton("8");
		bt_9 = new JButton("9");
		bt_mais = new JButton("+");
		bt_menos = new JButton("-");
		bt_vezes = new JButton("x");
		bt_div = new JButton("/");
		bt_limpar = new JButton("C");
		bt_limpar_tudo = new JButton("CB");
		bt_limparMemoria = new JButton("CM");
		bt_ponto = new  JButton(".");
		bt_igual = new JButton("=");
		
		pn_tela.setBackground(Color.cyan);
		pn_tela.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		pn_part1.setLayout(new GridLayout(1, 6));
		pn_part1.add(new JButton("MC"));
		pn_part1.add(new JButton("MR"));
		pn_part1.add(new JButton("M+"));
		pn_part1.add(new JButton("M-"));
		pn_part1.add(new JButton("MS"));
		pn_part1.add(new JButton("M^"));
		
		
		pn_botoes = new JPanel();
		pn_botoes.setLayout(new BorderLayout());
		pn_botoes.add("North", pn_part1);
		
		pn_part2 = new JPanel();
		pn_part2.setLayout(new GridLayout(6, 4));
		pn_part2.add(new JButton("%"));
		pn_part2.add(bt_limparMemoria);
		pn_part2.add(bt_limpar_tudo);
		pn_part2.add(bt_limpar);
		pn_part2.add(new JButton("1/x"));
		pn_part2.add(new JButton("x^2"));
		pn_part2.add(new JButton("1/x"));
		pn_part2.add(new JButton("sqrt(x)"));
		pn_part2.add(bt_div);
		pn_part2.add(bt_7);
		pn_part2.add(bt_8);
		pn_part2.add(bt_9);
		pn_part2.add(bt_vezes);
		pn_part2.add(bt_4);
		pn_part2.add(bt_5);
		pn_part2.add(bt_6);
		pn_part2.add(bt_menos);
		pn_part2.add(bt_1);
		pn_part2.add(bt_2);
		pn_part2.add(bt_3);
		pn_part2.add(bt_mais);
		
		pn_part2.add(new JButton("+/-"));
		pn_part2.add(bt_0);
		pn_part2.add(bt_ponto);
		pn_part2.add(bt_igual);
		
		pn_botoes.add("Center", pn_part2);
		lb_numeros.setFont(new Font("Courier New", Font.BOLD, 60));
		lb_numeros.setForeground(Color.white);
		pn_tela.add(lb_numeros);
		
		fr.add("North", pn_tela);
		fr.add("Center", pn_botoes);
		
		fr.setVisible(true);
		
	}
}
