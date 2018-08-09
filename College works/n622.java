import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n622 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JLabel labelmt = new JLabel("Матрица:");
	private JLabel label = new JLabel("Сумма элементов матрицы:");
	public n622() {
	    super("Работа с матрицей");
	    this.setBounds(200,200,580,280);
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
			int[] sm =new int[10];
			String matrix = "<html>Матрица: <br>";
			String smx = "--------------------------<br>";
			String mn = "";
			  int min; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*2);
			      }
			     }
			  min=0;
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				
				min+=a[i][j]; 
				matrix+=a[i][j]+" ";
			}
			
			matrix += "<br>"; 
			}
			
			for (int j=0;j < a.length;j++){
				for (int i=0;i < a[j].length;i++){
					sm[j]+=a[i][j]; 
				}
				smx+=sm[j]+" ";
				 
				}
			
			matrix +=smx+"<br>";
			matrix +="</html>";
			mn += "Сумма элементов матрицы: "+ min; 
			
			labelmt.setText(matrix); 
			label.setText(mn); 		
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
		n622 app = new n622();
		app.setVisible(true);
		
		
	}
}
