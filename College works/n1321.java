
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1321 extends JFrame {
	private JButton button = new JButton("Количество слов"); 
	private JTextField input = new JTextField("", 29); 
	private JLabel label = new JLabel("Введите фразу:     ");
	private JLabel answ = new JLabel("Позиции вхождения буквы 'a': ");
	public n1321() {
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
			
				 String string = input.getText();
				 String pos = "";
				 
				 int count = 0;
				 for(int i =0; i < string.length(); i++)
				     if(string.charAt(i) == 'a' || string.charAt(i) == 'A' || string.charAt(i) == 'а' || string.charAt(i) == 'А')
				     {
				       pos += (i) + " ";
				       count++;
				     }
				        
			        
			      answ.setText("Буква 'a' входит в фразу " +String.valueOf(count) + " раз и находится на позициях " + pos); 
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
		n1321 app = new n1321();
		app.setVisible(true);
	}
}


