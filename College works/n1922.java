import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class n1922 extends JFrame {
	private JButton button = new JButton("�����"); 
	private JLabel labelmt = new JLabel("�������:");
	private JLabel label = new JLabel("���������� ��������� ������� 5: ");
	public n1922() {
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
			      a[i][j]=(int)(Math.random()*101);
			      }
			     }
			  min= 0;
			for (int i=0;i < a.length;i++){
			for (int j=0;j < a[i].length;j++){
				
				if (a[2][j]%5==0) min++; 
				matrix+=a[i][j]+" ";
			}
			matrix += "<br>"; 
			}
			
			matrix +="</html>";
			mn += "���������� ��������� ������� 5: "+ min; 
			
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
		n1922 app = new n1922();
		app.setVisible(true);
		
		
	}
}
