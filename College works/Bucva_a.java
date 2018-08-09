
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Bucva_a extends JFrame {
	private JButton button = new JButton("Press"); 
	private JTextField input = new JTextField("", 29); 
	private JLabel label = new JLabel("Vvedite frazu:     ");
	private JLabel answ = new JLabel("Pozitii vhojdenia bucvi 'a': ");
	public Bucva_a() {
	    super("Aplicatie");
	    this.setBounds(200,200,650,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label);
	    container.add(input);
	    
	    button.addActionListener(new ButtonEvent());
	    container.add(button);
	    
	    container.add(answ);
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
			
				 String string = input.getText();
				 String pos = "";
				 
				 int count = 0;
				 for(int i =0; i < string.length(); i++)
				     if(string.charAt(i) == 'a' || string.charAt(i) == 'A' || string.charAt(i) == 'à' || string.charAt(i) == 'À')
				     {
				       pos += (i) + " ";
				       count++;
				     }
				        
			        
			      answ.setText("Bucva 'a' vhodit v frazu " +String.valueOf(count) + " raz i nahoditsa na pozitiah " + pos); 
			 }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Error",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	public static void main(String[] args) {
		Bucva_a app = new Bucva_a();
		app.setVisible(true);
	}
}


