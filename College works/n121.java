
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n121 extends JFrame {
	private JButton button = new JButton(" вадрат целого числа"); 
	private JTextField input = new JTextField("", 5); 
	private JLabel label = new JLabel("");
	public n121() {
	    super(" вадрат числа");
	    this.setBounds(200,200,250,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,0));
	    
	    container.add(input);
	    container.add(label);
	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
			int n = Integer.parseInt(input.getText());
			double x = n*n;
			label.setText(String.valueOf(x)); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"ќшибка",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	public static void main(String[] args) {
		n121 app = new n121();
		app.setVisible(true);
	}
}


