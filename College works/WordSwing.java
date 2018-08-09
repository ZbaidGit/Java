import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WordSwing extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JTextField input = new JTextField("", 5); 
	private JTextField input1 = new JTextField("", 5);
	private JLabel label = new JLabel("Размерность матрицы:");
	public WordSwing() {
	    super("Simple Example");
	    this.setBounds(200,200,250,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new GridLayout(0,1));
	    container.add(label);
	    container.add(input);
	    container.add(input1);
	    
	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			String message ="Матрица"+"\n";
			int n = Integer.parseInt(input.getText());
			int m = Integer.parseInt(input1.getText());
			int[][] a=new int[n][m];
			  int max,min; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*100);
			      }
			     }
			  min= a[0][0];
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				
				if (a[i][j]<min) min=a[i][j]; 
				message+=a[i][j]+" ";
			}
			message += "\n"; 
			}
			
			message += "\n"; 
			message += "Минимум: "+ min; 
			
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Минимум",
		    	    JOptionPane.PLAIN_MESSAGE);		}
	}
	public static void main(String[] args) {
		WordSwing app = new WordSwing();
		app.setVisible(true);
	}
}
