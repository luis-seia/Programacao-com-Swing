package praticas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exercicio1 {
	private JFrame fr;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JRadioButton masculio;
	private JRadioButton femenino;
	private JTextField txt;
	private JLabel nome;
	private JLabel curso;
	private JLabel sexo;
	private JLabel diversao;
	private JLabel direitos;
	private JComboBox ccursos;
	private JList ldiversao;
	private ImageIcon img;
	private JPanel pn1, pn2, pn3;
	private JTextArea txta;
	private JScrollPane spn;
	
	public Exercicio1() {
		fr = new JFrame();
		fr.setSize(800,400);
		fr.setTitle("Exercicio 1");
		fr.setResizable(false);
		fr.setLayout(new BorderLayout());
		
		
		pn1 = new JPanel();
		pn2 = new JPanel();
		pn3 = new JPanel();
		
		bt1 = new JButton("Limpar");
		bt2 = new JButton("submeter");
		bt3 = new JButton("programador");
		
		nome = new JLabel("nome:");
		curso = new JLabel("Curso");
		diversao = new JLabel("Diversao:");
		direitos = new JLabel("direitos");
		sexo = new JLabel("sexo");
		
		masculio = new JRadioButton("Masculino");
		femenino = new JRadioButton("Femenino");
		
		txt = new JTextField();
		
		txta = new JTextArea(10,20);
		txta.setBackground(Color.cyan);
		spn = new JScrollPane(txta);
		
		direitos = new JLabel("==========================DIREITOS RESERVADOS AO @LUIS==============================");
		direitos.setForeground(Color.blue);
		
		
		String[] cursos = {"Escolha uma opcao","informatica", "contabilidade","civil","auditoria"}; 
		ccursos = new JComboBox(cursos);
		
		String[] div = {"Futebol", "Andebol","internet","Ler"};
		ldiversao = new JList<>(div);
		
		pn1.setLayout(new GridLayout(3,1));
		
		pn1.add(bt1);
		pn1.add(bt2);
		pn1.add(bt3);
		
		
		pn2.setLayout(new GridLayout(2,5));
		pn2.add(nome);
		pn2.add(txt);
		pn2.add(curso);
		pn2.add(ccursos);
		pn2.add(new JLabel());
		pn2.add(sexo);
		pn2.add(masculio);
		pn2.add(femenino);
		pn2.add(diversao);
		pn2.add(ldiversao);
		

		img = new ImageIcon("D:\\Pictures\\==Pc==\\img1.jpg");
		JLabel lb_img = new JLabel(img);
		
		
		
		
		
		fr.add("North",lb_img);
		fr.add("West", pn1);
		fr.add("Center", pn2);
		fr.add("East", spn);
		fr.add("South", direitos);
		
		
		
		fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fr.setVisible(true);
	}
}
