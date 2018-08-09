
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
public class n1821 extends JFrame {
	private JButton button = new JButton("Вычислить"); 
	private JTextField input = new JTextField("", 29); 
	private JLabel label = new JLabel("Введите фразу:     ");
	private JTextField answ = new JTextField("", 30);
	public n1821() {
	    super("Numar");
	    this.setBounds(200,200,510,150);
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
			
				 String s = "";
				 String text = input.getText();
			        String[] wordArray = text.split("[\\s,.:!?]+");
			        Pattern pattern = Pattern.compile("^[аоэиуыеёюя].*$");
			        for (String word : wordArray) {
			            Matcher matcher = pattern.matcher(word);
			            if (matcher.find()) {
			                s+=word+" ";
			            }
			        }
			      answ.setText(s); 
			 
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
		n1821 app = new n1821();
		app.setVisible(true);
	}
}


