
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Minim_maxim extends JFrame {
	private JButton bmin = new JButton("Minimum"); 
	private JButton bmax = new JButton("Maximum"); 
	private JTextField input = new JTextField("", 19); 
	private JLabel lmin = new JLabel("");
	private JLabel lmax = new JLabel("");
	public Minim_maxim() {
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
			
			int n = Integer.parseInt(input.getText());
						
			int digit = -1;
	        int count = 0;
	        int temp;
	        boolean isNextDigitIsMinimal;
	 
	        for (int i = n; i >= 1; i /= 10) {
	            temp = i % 10;
	            isNextDigitIsMinimal = temp == digit;
	            digit = digit < 0 ? temp : digit > temp ? temp : digit;
	            count = count == 0 ? ++count : isNextDigitIsMinimal ? ++count : temp == digit ? 1 : count;
	        }
	 
	        
			lmin.setText(String.valueOf(digit)); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Îøèáêà",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	class ButtonEventMax implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 int n = Integer.parseInt(input.getText());
					
					int digit = -1;
			        int count = 0;
			        int temp;
			        boolean isNextDigitIsMinimal;
			 
			        for (int i = n; i >= 1; i /= 10) {
			            temp = i % 10;
			            isNextDigitIsMinimal = temp == digit;
			            digit = digit < 0 ? temp : digit < temp ? temp : digit;
			            count = count == 0 ? ++count : isNextDigitIsMinimal ? ++count : temp == digit ? 1 : count;
			        }
			 
			        
					lmax.setText(String.valueOf(digit)); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Îøèáêà",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	public static void main(String[] args) {
		Minim_maxim app = new Minim_maxim();
		app.setVisible(true);
	}
}


