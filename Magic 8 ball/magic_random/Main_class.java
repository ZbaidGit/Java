package magic_random;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.*;

@SuppressWarnings("serial")
public class Main_class extends JFrame {

	private JButton button = new JButton("��������");
	private JLabel label = new JLabel(" ������� ��� ������:");
	private JLabel labelAnsver = new JLabel(" ");
	private JTextField input = new JTextField(" ", 5);
	private JLabel Newlabel = new JLabel(" ");
	private JLabel Newlabel2 = new JLabel(" ");
	private JLabel MyAnsver = new JLabel(" ��� �����: ");

	JTextPane dialogue; // area for dialog
	JTextField message; // field for entering messages
	JTextPane jpanel;

	final Random random = new Random();

	/**
	 * Constructor: Creating a window and all the necessary elements on it
	 * 
	 * @throws IOException
	 */
	Main_class() throws IOException {
		super("Magic 8 ball");
		setSize(400,170);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	
		Container container = this.getContentPane();
		container.setLayout(new BoxLayout(container, EXIT_ON_CLOSE));
		container.add(label);
		
		container.add(input);

		button.addActionListener(new ButtonEventListener());
		container.add(button);
		
		container.add(Newlabel);

		container.add(MyAnsver);
		container.add(labelAnsver);
		container.add(Newlabel2);
	}

	// ------------------------------------------------------------------------------------Answers
	final Map<String, String> ANSWERS = new HashMap<String, String>() {
		{

			// �������������
			put("0", "���������");
			put("1", "����������");
			put("2", "������� ��������");
			put("3", "���������� ��");
			put("4", "������ ���� ������ � ����");
			// ������������ �������������
			put("5", "��� ������� � ���");
			put("6", "��������� �����");
			put("7", "������� �����������");
			put("8", "����� ������� � ���");
			put("9", "��");
			// �������������
			put("10", "���� �� ����, �������� �����");
			put("11", "������ �����");
			put("12", "����� �� ������������");
			put("13", "������ ������ �����������");
			put("14", "��������������� � ������ �����");
			// ������������ �������������
			put("15", "���� �� �����");
			put("16", "��� ����� � ����");
			put("17", "�� ���� ������ � ����");
			put("18", "����������� �� ����� �������");
			put("19", "������ �����������");
		}
	};
	// -----------------------------------------------------

	public class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = " " + ANSWERS.get(String.valueOf(random.nextInt(19)));

			labelAnsver.setText(message);

		}
	}

	public static void main(String[] args) throws IOException {
		Main_class app = new Main_class();
		app.setVisible(true);
	}
	
	

}


