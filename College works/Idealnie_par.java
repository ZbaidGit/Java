
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Idealnie_par extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 25); 
	private JLabel label1 = new JLabel("Введите возраст: ");
	private JLabel gr = new JLabel("Идеальный вес: ");
	private JLabel in = new JLabel("Идеальный рост: ");
	
	public Idealnie_par() {
	    super("Aplicatie");
	    this.setBounds(200,200,450,130);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);
	    container.add(gr);
	    container.add(in);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			int a = Integer.parseInt(input.getText());
			
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			String greu = "Идеальный вес: "+ df.format(2 * a + 8) + " кг";
			if (a<=0 ) greu ="Ошибка! Возраст должен быть положительным!";
			gr.setText(greu); 
			String inal = "Идеальный рост: " +  df.format(5 * a + 80 ) + " см";
			if (a<=0 ) inal ="Ошибка! Возраст должен быть положительным!";
			in.setText(inal); 
			
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
		Idealnie_par app = new Idealnie_par();
		app.setVisible(true);
	}
}
