import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n1221 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 20);
	private JLabel answ = new JLabel("Площадь: ");
	
	public n1221() {
	    super("Aplicatie");
	    this.setBounds(200,200,480,100);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
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
			String str = "Площадь: "+ df.format(x) + " см2";
			if (a<=0) str="Радиус должен быть положительным!";
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
		n1221 app = new n1221();
		app.setVisible(true);
	}
}
