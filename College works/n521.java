import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n521 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 5); 
	private JTextField input1 = new JTextField("", 5);
	private JLabel iks = new JLabel("x");
	private JLabel plus = new JLabel("+");
	private JLabel equal = new JLabel("=");
	private JLabel answ = new JLabel("");
	private JLabel zero = new JLabel("0");
	
	public n521() {
	    super("Решение уравлений первой степени");
	    this.setBounds(200,200,450,150);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));

	    container.add(input);
	   
	    container.add(iks);
	    container.add(plus);
	    container.add(input1);
	    container.add(equal);
	    container.add(zero);
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			int b = Integer.parseInt(input1.getText());
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			String str = " х = "+ df.format(-b/a);
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
		n521 app = new n521();
		app.setVisible(true);
	}
}
