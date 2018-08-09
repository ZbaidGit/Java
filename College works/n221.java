
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n221 extends JFrame {
	private JButton bred = new JButton("Красный"); 
	private JButton bgreen = new JButton("Зеленый");
	private JButton bblue = new JButton("Голубой");
	private JButton bblack = new JButton("Черный");
	private JButton byellow = new JButton("Желтый");
	
	public n221() {
	    super("Смена цвета");
	    this.setBounds(200,200,250,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,0));
	    
	    bred.addActionListener(new ButtonEventListener());
	    container.add(bred);
	    bgreen.addActionListener(new ButtonEventListener1());
	    container.add(bgreen);
	    bblue.addActionListener(new ButtonEventListener2());
	    container.add(bblue);
	    bblack.addActionListener(new ButtonEventListener3());
	    container.add(bblack);
	    byellow.addActionListener(new ButtonEventListener4());
	    container.add(byellow);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 getContentPane().setBackground(Color.RED);
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
			 try {
			
				 getContentPane().setBackground(Color.green);
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
	
	class ButtonEventListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 getContentPane().setBackground(Color.blue);
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
	
	class ButtonEventListener3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 getContentPane().setBackground(Color.black);
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
	
	class ButtonEventListener4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 getContentPane().setBackground(Color.yellow);
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
		n221 app = new n221();
		app.setVisible(true);
	}
}


