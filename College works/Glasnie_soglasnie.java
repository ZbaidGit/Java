
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Glasnie_soglasnie extends JFrame {
	private JButton bmin = new JButton("Soglasnie"); 
	private JButton bmax = new JButton("Glasnie"); 
	private JTextField input = new JTextField("", 19); 
	private JLabel lmin = new JLabel("");
	private JLabel lmax = new JLabel("");
	public Glasnie_soglasnie() {
	    super("Aplicatie");
	    this.setBounds(200,200,550,100);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    
	    container.add(input);
	    
	    bmin.addActionListener(new ButtonEventMin());
	    container.add(bmin);
	    container.add(lmin);
	    bmax.addActionListener(new ButtonEventMax());
	    container.add(bmax);
	    container.add(lmax);
	}
	class ButtonEventMin implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 String text = input.getText();
				        int count = 0;
				        char [] consonant = ".יצםךדרשחץתפגןנכהזקסלעüב,:;".toCharArray(); // [.,!\\s :;]
				        char [] suspect = text.toCharArray();
				        
				        for (int i = 0; i < suspect.length; ++i) {
				            for (int j = 0; j < consonant.length; j++) {
				                if(suspect[i] == consonant[j]) 
				                    count++;
				            }
				        }
			lmin.setText(String.valueOf(count)); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Îרטבךא",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	class ButtonEventMax implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 String text = input.getText();
			        int count = 0;
			        char [] consonant = ".או¸טמףû‎‏ÿ".toCharArray(); // [.,!\\s :;]
			        char [] suspect = text.toCharArray();
			        
			        for (int i = 0; i < suspect.length; ++i) {
			            for (int j = 0; j < consonant.length; j++) {
			                if(suspect[i] == consonant[j]) 
			                    count++;
			            }
			        }
		lmax.setText(String.valueOf(count)); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Îרטבךא",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	public static void main(String[] args) {
		Glasnie_soglasnie app = new Glasnie_soglasnie();
		app.setVisible(true);
	}
}


