import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n2222 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JLabel labelmt = new JLabel("Матрица:");
	private JLabel label = new JLabel("Максимальный элемент:");
	public n2222() {
	    super("Работа с матрицей");
	    this.setBounds(200,200,580,200);
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
			  int min, count; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*6);
			      }
			     }
			  min= a[0][0];
			  count = 0;
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				if(a[i][j]>min) min=a[i][j]; 
				matrix+=a[i][j]+" ";
			}
			matrix += "<br>"; 
			}
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				if(a[i][j]==min) count++;
			}
			}
			
			matrix +="</html>";
			mn += "Максимальный элемент: "+ min + ", количество его вхождений: " + count; 
			
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
		n2222 app = new n2222();
		app.setVisible(true);
		
		
	}
}
