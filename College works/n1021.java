
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1021 extends JFrame {
	private JButton button = new JButton("Количество слов"); 
	private JTextField input = new JTextField("", 29); 
	private JLabel label = new JLabel("Введите фразу:     ");
	private JLabel answ = new JLabel("Количество слов: ");
	public n1021() {
	    super("Numar");
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
			
				 String s = input.getText();
				 int wordCount = 0;
				 
			        boolean word = false;
			        int endOfLine = s.length() - 1;
			 
			        for (int i = 0; i < s.length(); i++) {
			            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
			                word = true;
			            } else if (!Character.isLetter(s.charAt(i)) && word) {
			                wordCount++;
			                word = false;
			            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
			                wordCount++;
			            }
			        }
			        
			      answ.setText("Количество слов: "+String.valueOf(wordCount)); 
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
		n1021 app = new n1021();
		app.setVisible(true);
	}
}


