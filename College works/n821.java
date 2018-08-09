import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n821 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 5); 
	private JTextField input1 = new JTextField("", 5);
	private JLabel label1 = new JLabel("Меньшая сторона: ");
	private JLabel label2 = new JLabel("Большая сторона: ");
	private JLabel answ = new JLabel("");
	
	public n821() {
	    super("Aplicatie");
	    this.setBounds(200,200,450,150);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);	    
	    container.add(label2);
	    container.add(input1);
	  
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
			String str = " х = "+ df.format(a*b);
			if (a<=0 || b<= 0) str="Ошибка! Стороны должны быть положительными!";
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
		n821 app = new n821();
		app.setVisible(true);
	}
}
