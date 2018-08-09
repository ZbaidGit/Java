import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n421 extends JFrame {
	private JButton button = new JButton("="); 
	private JTextField input = new JTextField("", 4); 
	private JTextField input1 = new JTextField("", 4);
	private JLabel answ = new JLabel("");
	String[] chStrings = { "+", "-", "*", "/"};
	JComboBox chList = new JComboBox(chStrings);
	
	public n421() {
	    super("Aplicatie");
	    this.setBounds(200,200,350,100);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));

	    container.add(input);		    
	    container.add(chList);
	    container.add(input1);

	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			double a = Integer.parseInt(input.getText());
			double b = Integer.parseInt(input1.getText());
			char c = String.valueOf(chList.getSelectedItem()).charAt(0);
			String str ="";
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			
			if (c == '+') {
		        str=df.format(a+b);
		      } else if (c == '-') {
		    	  str=df.format(a-b);
		      } else if (c == '*') {
		    	  str=df.format(a*b);
		      }else if (c == '/') {
		    	  str=df.format(a/b);
		      }else {
		        str="Ошибка!";
		      }
			
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
		n421 app = new n421();
		app.setVisible(true);
	}
}
