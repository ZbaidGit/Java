

import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
public class Matrix_sum extends JFrame {
	private JButton button = new JButton("Najmi"); 
	private JTextField input = new JTextField("", 14); 
	private JTextField input1 = new JTextField("", 14);
	private JLabel label1 = new JLabel("Kolichestvo strok: ");
	private JLabel label2 = new JLabel("Kolichestvo stolbtsov: ");

	private JLabel answ = new JLabel("");
	private JLabel answmin = new JLabel("");
	
	public Matrix_sum() {
	    super("Aplicatie");
	    this.setBounds(200,200,230,415);
	    
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(label1);
	    container.add(input);	    
	    container.add(label2);
	    container.add(input1);
	  
	    button.addActionListener(new ButtonEventListener());

	    container.add(button);

	    container.add(answ);
	    container.add(answmin);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try
			{
				int n = Integer.parseInt(input.getText());
				int m = Integer.parseInt(input1.getText());

				int[][] a=new int[n][m];
				String matrix = "<html>Matrix: <br>";
				String mn = "";
				  int min; 
				  for (int i=0;i < a.length;i++){
				    for (int j=0;j < a[i].length;j++){
				      a[i][j]=(int)(Math.random()*101);
				      }
				     }
				  min= 0;
				  for (int i=0;i < a.length;i++){
						for (int j=0;j < a[i].length;j++){
							min+=a[i][j]; 
							matrix+=a[i][j]+" ";
						}
						matrix += "<br>"; 
				}
				matrix +="</html>";
				mn += "Summa: "+ min; 
			
				answ.setText(matrix);
				answmin.setText(mn);
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
		Matrix_sum app = new Matrix_sum();
		app.setVisible(true);
	}
}
