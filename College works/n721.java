
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n721 extends JFrame {
	private JButton bmin = new JButton("ׁמדכאסםûו"); 
	private JButton bmax = new JButton("ֳכאסםûו"); 
	private JTextField input = new JTextField("", 19); 
	private JLabel lmin = new JLabel("");
	private JLabel lmax = new JLabel("");
	public n721() {
	    super("Numar");
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
				    		"־רטבךא",
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
				    		"־רטבךא",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	public static void main(String[] args) {
		n721 app = new n721();
		app.setVisible(true);
	}
}


