
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Posled_chisla extends JFrame {
	private JButton button = new JButton("Press"); 
	private JTextField input = new JTextField("", 11);
	private JTextField input1 = new JTextField("", 11);
	private JTextField input2 = new JTextField("", 11);
	private JLabel label1 = new JLabel("Cislo 1: ");
	private JLabel label2 = new JLabel("Cislo 2: ");
	private JLabel label3 = new JLabel("Cislo 3: ");

	private JLabel label4 = new JLabel("");
	
	public Posled_chisla() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,250);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);
	    container.add(label2);
	    container.add(input1);
	    container.add(label3);
	    container.add(input2);
	    
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);
	    container.add(label4);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			int b = Integer.parseInt(input1.getText());
			int c = Integer.parseInt(input2.getText());
			if (a<b && b<c)
				label4.setText("Posledovatelnie"); 
			else if (a==b || b==c)
				label4.setText("Esti odinacovie chisla"); 
			else
				label4.setText("Ne posledovatelnie");
			
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
		Posled_chisla app = new Posled_chisla();
		app.setVisible(true);
	}
}
