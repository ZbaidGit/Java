import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class n2021 extends JFrame {
	private JButton button = new JButton("Тип треугольника"); 
	private JButton button2 = new JButton("Площадь треугольника"); 
	private JTextField input = new JTextField("", 11); 
	private JTextField input1 = new JTextField("", 11);
	private JTextField input2 = new JTextField("", 11);
	private JLabel l1 = new JLabel("Сторона А");
	private JLabel l2 = new JLabel("Сторона В");
	private JLabel l3 = new JLabel("Сторона С");
	private JLabel l4 = new JLabel("");
	private JLabel l5 = new JLabel("");
	
	public n2021() {
	    super("Треугольники");
	    this.setBounds(200,200,250,300);
	    
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
	    button2.addActionListener(new ButtonEventListener1());
	    container.add(button2);
	    container.add(l5);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
			double a = Integer.parseInt(input.getText());
			double b = Integer.parseInt(input1.getText());
			double c = Integer.parseInt(input2.getText());
			String str ="";
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			double max, min1, min2;
			max=0;min1=0;
			
			if ((a > b) && (a > c)) {
               max=a; min1=b; min2=c;}
           else
            if ((b>a) && (b>c)) 
            {
               max=b; min1=a; min2=c;
            }
            else
               {
                 max=c; min2=a; min2=b;
               }
			
			if ((a+b)>c && (a+c)>b && (c+b)>a) {
            if (max*max==(min1*min1)+min2*min2) 
               str ="Треугольник прямоугольный";
            else
              if ((max*max)<min1*min1+min2*min2) 
            	  str = "Треугольник остроугольный";
                  else  str ="Треугольник тупоугольный";
		      } else {
		        str="Стороны не образуют треугольник!";
		      }
			
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
	
	class ButtonEventListener1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
				double a = Integer.parseInt(input.getText());
				double b = Integer.parseInt(input1.getText());
				double c = Integer.parseInt(input2.getText());
			    double p = 0;
			    double ar;
			
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			p=((a+b+c)/2);
			ar=Math.sqrt((p*(p-a)*(p-b)*(p-c)));
			l5.setText(String.valueOf(ar)); 
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
		n2021 app = new n2021();
		app.setVisible(true);
	}
}
