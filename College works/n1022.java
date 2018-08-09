import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1022 extends JFrame {
	private JButton button = new JButton("Нажми"); 
	private JLabel labelmt = new JLabel("Матрица:");
	private JLabel label = new JLabel("Сумма элементов матрицы:");
	public n1022() {
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
				sm[i]+=a[i][j]; 
				matrix+=a[i][j]+" ";
			}
			
			matrix += " | <i>"+ sm[i]+"</i> <br>"; 
			}
			matrix +="<br>";
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
		n1022 app = new n1022();
		app.setVisible(true);
		
		
	}
}
