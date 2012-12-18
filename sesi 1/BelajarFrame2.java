package belajar.swing.container;

import javax.swing.JFrame;

public class BelajarFrame {
	public static void main (String[] xx){
		// membuat objeck fr yang bertipe JFrame
		Jframe fr = new JFrame();
		
		//  judul frame
		fr.setTitle("Belajar Frame");
		
		// ukurannya
		fr.setSize(800,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// untuk menghilangkan perintah size seperti mengecilkan dan membesarkan frame
		fr.setResizable(false);
		
		fr.setVisible(true);
	}
}