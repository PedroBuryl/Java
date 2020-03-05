package frame;

import javax.swing.*;

public class Frame {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Botao");
		JButton b1 = new JButton("OK"), b2 = new JButton("CANCELAR");
		JCheckBox checkBox1 = new JCheckBox("Lembrar de mim");

		b1.setBounds(100,300,60,35);
		b2.setBounds(180,300,110,35);
		checkBox1.setBounds(100,250,150,50);

		f.add(b1);
		f.add(b2);
		f.add(checkBox1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}