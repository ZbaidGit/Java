
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.*;
public class n2221 extends JFrame {
	private JButton button = new JButton("���������"); 
	private JTextField input = new JTextField("", 35); 
	private JLabel label = new JLabel("������� ������ ��������� � ��������:     ");
	private JLabel label1 = new JLabel("�������� ��� ���������:                                                                          ");
	private JLabel answ = new JLabel("");
	
	JRadioButton Button1 = new JRadioButton("� ����");
	JRadioButton Button2 = new JRadioButton("� ������ ���. ����������");
	JRadioButton Button3 = new JRadioButton("�����������������");
	ButtonGroup group = new ButtonGroup();
	
	public n2221() {
	    super("Numar");
	    this.setBounds(200,200,450,240);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label);
	    container.add(input);
	    container.add(label1);
	    group.add(Button1);	    
	    group.add(Button2);
	    group.add(Button3);
	    
	    container.add(Button1);	    
	    container.add(Button2);
	    container.add(Button3);
	    
	    
	    button.addActionListener(new ButtonEvent());
	    container.add(button);
	    
	    container.add(answ);
	}
	
	class ButtonEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 try {
				 double a = Integer.parseInt(input.getText());
				 String s ="";
				 if(Button1.isSelected())
					 s= String.valueOf(a/60*0.75) + "���";
				 else
					 if(Button2.isSelected())
						 s= String.valueOf(a/60*1.76) + "���";
					 else
						 if(Button3.isSelected())
							 s= String.valueOf(a/60*2.5) + "���";
						 else 
							 s = "������! �� ������ �����.";
			      answ.setText("�����: "+s); 
			 
			        }
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"������",
				    	    JOptionPane.PLAIN_MESSAGE);	
			 }
			
	}
	}
	
	public static void main(String[] args) {
		n2221 app = new n2221();
		app.setVisible(true);
	}
}


