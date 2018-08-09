
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Plosiadi_priamoug extends JFrame {
	private JButton button2 = new JButton("Plosiadi priamougolinica"); 
	private JTextField input = new JTextField("", 13); 
	private JTextField input1 = new JTextField("", 13);
	private JLabel l1 = new JLabel("Storona А");
	private JLabel l2 = new JLabel("Storona В");
	private JLabel l5 = new JLabel("");
	
	public Plosiadi_priamoug() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,200);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(l1);
	    container.add(input);
	    container.add(l2);
	    container.add(input1);

	    button2.addActionListener(new ButtonEventListener1());
	    container.add(button2);
	    container.add(l5);
	}

	
	class ButtonEventListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
				double a = Integer.parseInt(input.getText());
				double b = Integer.parseInt(input1.getText());
			    double ar;
			    String str="";
				
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			
			ar=a*b;
			str="Plosiadi: "+String.valueOf(ar) + " cm2";
			if (a<=0 || b<= 0) str="Ошибка! Стороны должны быть положительными!";
			l5.setText(str); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Error",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }

	}
	}
	public static void main(String[] args) {
		Plosiadi_priamoug app = new Plosiadi_priamoug();
		app.setVisible(true);
	}
}
