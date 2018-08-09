import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n1421 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 11);
	private JLabel label1 = new JLabel("Евро: " + System.lineSeparator());
	private JLabel label2 = new JLabel("Доллары: " + System.lineSeparator());
	private JLabel label3 = new JLabel("Румынские леи: " + System.lineSeparator());
	private JLabel label4 = new JLabel("Рубли: "+ System.lineSeparator());
	private JLabel label5 = new JLabel(System.lineSeparator());
	
	public n1421() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,350);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    
	    container.add(input);
	  
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(label5);
	    container.add(label1);	    
	    container.add(label2);
	    container.add(label3);
	    container.add(label4);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			
			label1.setText(System.lineSeparator()+System.lineSeparator()+"Евро: " + df.format(a*0.0494)+System.lineSeparator()); 
			label2.setText("Доллары: " + df.format(a*0.061)+System.lineSeparator()); 
			label3.setText("Румынские леи: " + df.format(a*0.2306)+System.lineSeparator()+System.lineSeparator()); 
			label4.setText("Рубли: " + df.format(a*3.7594)); 
			
			
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
		n1421 app = new n1421();
		app.setVisible(true);
	}
}
