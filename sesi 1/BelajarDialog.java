package belajar.swing.container;

import javax.swing.JFrame;
import javax.swing.JDialog;

public class BelajarDialog {
	public static void main (String[] xx){
		// membuat objeck fr yang bertipe JFrame
		Jframe fr = new JFrame();
		
		//  judul frame
		fr.setTitle("Belajar Frame");
		
		// ukurannya
		fr.setSize(800,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		JDialog jd = new JDialog();
		jd.Resize(200,200);
		jd.setTitle("Dialog Box");
		jd.setModal(true);
		
		//delay dulu 5 detik
		Thread.sleep(5 + 1000);
		
		//tampilan dialog
		jd.setVisible(true);
	}
}