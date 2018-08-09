
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
public class n1921 extends JFrame {
	JRadioButton winButton = new JRadioButton("Зима");
	JRadioButton sprButton = new JRadioButton("Весна");
	JRadioButton sumdButton = new JRadioButton("Лето");
	JRadioButton autButton = new JRadioButton("Осень");
	
	ButtonGroup group = new ButtonGroup();
	
	public n1921() {
	    super("Aplicatie");
	    this.setBounds(200,200,510,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    
	    group.add(winButton);	    
	    group.add(sprButton);
	    group.add(sumdButton);
	    group.add(autButton);
	    
	    winButton.addActionListener(new ButtonEvent());
	    container.add(winButton);
	    sprButton.addActionListener(new ButtonEvent1());
	    container.add(sprButton);
	    sumdButton.addActionListener(new ButtonEvent2());
	    container.add(sumdButton);
	    autButton.addActionListener(new ButtonEvent3());
	    container.add(autButton);
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
				 	getContentPane().setBackground(Color.WHITE);
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
	class ButtonEvent1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
				 getContentPane().setBackground(Color.BLUE);
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
	class ButtonEvent2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
				 	getContentPane().setBackground(Color.GREEN);
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
	class ButtonEvent3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				 try {
					 getContentPane().setBackground(Color.YELLOW);
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
		n1921 app = new n1921();
		app.setVisible(true);
	}
}


