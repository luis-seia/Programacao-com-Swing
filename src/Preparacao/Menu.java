package Preparacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Menu implements ActionListener{
	private JFrame fr;
	private JMenu sistema;
	private JMenuItem item1;
	private JMenuItem item2;
	private JMenuItem item3;
	private JMenuItem item4;
	private JMenuBar bara;
	private JSeparator sp;
	
	
	public Menu() {
		fr = new JFrame();
		fr.setTitle("Tela2");
		fr.setSize(400,400);
		
		
		sistema = new JMenu("Sistema");
		
		item1 = new JMenuItem("Dados do programador",'G');
		item2 = new JMenuItem("registo de produtos",'H');
		item4 = new JMenuItem("Listar Registo",'H');
		item2.addActionListener(this);
		item3 = new JMenuItem("Sair",'U');
		
		bara = new JMenuBar();
		
		sp = new JSeparator();
		
		sistema.add(item1);
		sistema.add(new JSeparator());
		sistema.add(item2);
		sistema.add(new JSeparator());
		sistema.add(item3);
		
		
		bara.add(sistema);
		fr.setJMenuBar(bara);
		
		
		
		
		
		fr.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==item2) {
			new Produto();
		}
		
	}
}
