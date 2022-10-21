package aula3;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela3 {


		private JFrame fr;
		private ImageIcon img;
		private JLabel lb;
		
		public Tela3() {
			fr = new JFrame();
			fr.setSize(400,400);
			fr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			fr.setTitle("Tela 1");
			fr.setVisible(true);
			fr.setLayout(new FlowLayout(FlowLayout.LEFT));
			img = new ImageIcon("\"D:\\Pictures\\==Pc==\\images.jpg\"");
			lb = new JLabel(img);
			fr.add(lb);
		}
}
