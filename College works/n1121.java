import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n1121 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 7); 
	private JTextField input1 = new JTextField("", 7);
	private JTextField input2 = new JTextField("", 7);
	private JTextField input3 = new JTextField("", 10);
	private JLabel label1 = new JLabel("Дисциплина 1: ");
	private JLabel label2 = new JLabel("Дисциплина 2: ");
	private JLabel label3 = new JLabel("Дисциплина 3: ");
	private JLabel label4 = new JLabel("Экзамен: ");
	private JLabel answ = new JLabel("");
	
	public n1121() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,350);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);	    
	    container.add(label2);
	    container.add(input1);
	    container.add(label3);
	    container.add(input2);
	    container.add(label4);
	    container.add(input3);
	  
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

			int c = Integer.parseInt(input2.getText());

			int d = Integer.parseInt(input3.getText());
			double x = 0.6*((a+b+c)/3) + 0.4*d;
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			String str = "Итого: "+ df.format(x);
			if (a<=0 || b<= 0 || c<= 0 || d<= 0) str="Оценки не положительные!";
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
		n1121 app = new n1121();
		app.setVisible(true);
	}
}
