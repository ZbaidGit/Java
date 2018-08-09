import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n2121 extends JFrame {
	private JButton button = new JButton("Вычислить"); 
	private JTextField input = new JTextField("", 5); 
	private JTextField input1 = new JTextField("", 10);
	private JTextField input2 = new JTextField("", 11);
	private JLabel l1 = new JLabel("Цена топлива (лей/л)");
	private JLabel l2 = new JLabel("Потребление");
	private JLabel l3 = new JLabel("Дистанция");
	private JLabel l4 = new JLabel("");
	
	public n2121() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,200);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(l1);
	    container.add(input);
	    container.add(l2);
	    container.add(input1);
	    container.add(l3);
	    container.add(input2);

	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	    container.add(l4);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			double a = Integer.parseInt(input.getText());
			double b = Integer.parseInt(input1.getText());
			double c = Integer.parseInt(input2.getText());
			String str =""+(c-a*b);
			
			
			l4.setText(str); 
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
		n2121 app = new n2121();
		app.setVisible(true);
	}
}
