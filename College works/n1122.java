import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1122 extends JFrame {
	private JButton button = new JButton("�����"); 
	private JLabel labelmt = new JLabel("�������:");
	private JLabel label = new JLabel("������������ �������:");
	public n1122() {
	    super("������ � ��������");
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
			String matrix = "<html>�������: <br>";
			String mn = "";
			  int min; 
			  for (int i=0;i < a.length;i++){
			    for (int j=0;j < a[i].length;j++){
			      a[i][j]=(int)(Math.random()*100);
			      }
			     }
			  min= a[2][0];
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				matrix+=a[i][j]+" ";
			}
			matrix += "<br>"; 
			}
			
				for (int j=0;j < a.length;j++){
					if (a[2][j]>min) min=a[2][j]; 
				}
			matrix +="</html>";
			mn += "������������ ������� 3-�� ������: "+ min; 
			
			labelmt.setText(String.valueOf(matrix)); 
			label.setText(String.valueOf(mn)); 		
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null,
						 String.valueOf(ex),
				    		"������",
				    	    JOptionPane.PLAIN_MESSAGE);
			}
			}
	}
	public static void main(String[] args) {
		n1122 app = new n1122();
		app.setVisible(true);
		
		
	}
}
