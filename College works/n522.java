import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n522 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JLabel labelmt = new JLabel("Матрица:");
	private JLabel label = new JLabel("Количество нечетных элементов:");
	public n522() {
	    super("Работа с матрицей");
	    this.setBounds(200,200,580,250);
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

			int[][] a=new int[10][10];
			String matrix = "<html>Матрица: <br>";
			String mn = "";
			  int min; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*101);
			      }
			     }
			  min=0;
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				
				if (a[i][j]%2 != 0) min+=1; 
				matrix+=a[i][j]+" ";
			}
			matrix += "<br>"; 
			}
			matrix +="</html>";
			mn += "Количество нечетных элементов: "+ min; 
			
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
		n522 app = new n522();
		app.setVisible(true);
		
		
	}
}
