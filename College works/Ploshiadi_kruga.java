import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Ploshiadi_kruga extends JFrame {
	private JButton button = new JButton("Press"); 
	private JTextField input = new JTextField("", 10);
	private JLabel answ = new JLabel("Plosiadi: ");

	private JLabel lab = new JLabel("Radius: ");
	
	public Ploshiadi_kruga() {
	    super("Aplicatie");
	    this.setBounds(200,200,430,100);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(lab);
	    container.add(input);
	  
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			double x = 3.14*a*a;
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			String str = "Ploshiadi: "+ df.format(x) + " см2";
			if (a<=0) str="Radius doljen biti polojitelnim!";
			answ.setText(str); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Ошибка",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }

	}
	}
	public static void main(String[] args) {
		Ploshiadi_kruga app = new Ploshiadi_kruga();
		app.setVisible(true);
	}
}
