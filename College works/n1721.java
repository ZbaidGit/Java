import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n1721 extends JFrame {
	private JButton button = new JButton("Вычислить"); 
	private JTextField input = new JTextField("", 11); 
	private JTextField input1 = new JTextField("", 11);
	private JTextField input2 = new JTextField("", 7);
	private JTextField input3 = new JTextField("", 7);
	private JLabel l1 = new JLabel("Фамилия   ");
	private JLabel l2 = new JLabel("Имя       ");
	private JLabel l3 = new JLabel("Степень");
	private JLabel l4 = new JLabel("Количество часов");
	private JLabel l5 = new JLabel("З/п за час");
	private JLabel answ = new JLabel("");
	String[] chStrings = { "Первая степень", "Вторая степень", "Третья степень"};
	JComboBox chList = new JComboBox(chStrings);
	
	public n1721() {
	    super("Aplicatie");
	    this.setBounds(200,200,250,300);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(l1);
	    container.add(input);
	    container.add(l2);
	    container.add(input1);
	    container.add(l3);
	    container.add(chList);
	    container.add(l4);
	    container.add(input2);
	    container.add(l5);
	    container.add(input3);

	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			double a = Integer.parseInt(input3.getText());
			double b = Integer.parseInt(input2.getText());
			String c = String.valueOf(chList.getSelectedItem());
			String str ="";
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			
			if (c == "Первая степень") {
		        str=df.format(a + b * 1.5);
		      } else if (c == "Вторая степень") {
		    	  str=df.format(a + b * 1.4);
		      } else if (c == "Третья степень") {
		    	  str=df.format(a + b * 1.3);
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
		n1721 app = new n1721();
		app.setVisible(true);
	}
}
