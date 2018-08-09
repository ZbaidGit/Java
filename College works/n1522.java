import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1522 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JLabel labelmt = new JLabel("Матрица:");
	private JLabel label = new JLabel("Максимальный элемент:");
	public n1522() {
	    super("Работа с матрицей");
	    this.setBounds(200,200,380,150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.setLayout(new FlowLayout (FlowLayout.LEFT, 10, 10));
	    container.add(labelmt);
	    container.add(label);
	    
	    button.addActionListener(new ButtonEventListener());
	    
	    container.add(button);

	    
	}
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {

			int[][] a=new int[5][5];
			String matrix = "<html>Матрица: <br>";
			String mn = "";
			  int min; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*11);
			      }
			     }
			  min= a[0][0];
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				
				if(i==0 || i == 4 || j == 0 || j == 4) 
				if (a[i][j]>min) min=a[i][j]; 
				matrix+=a[i][j]+" ";
			}
			matrix += "<br>"; 
			}
			matrix +="</html>";
			mn += "Максимальный элемент: "+ min; 
			
			labelmt.setText(String.valueOf(matrix)); 
			label.setText(String.valueOf(mn)); 		
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"Ошибка",
				    	    JOptionPane.PLAIN_MESSAGE);
			}
			}
	}
	public static void main(String[] args) {
		n1522 app = new n1522();
		app.setVisible(true);
		
		
	}
}
