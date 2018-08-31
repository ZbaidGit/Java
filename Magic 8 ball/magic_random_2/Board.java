package magic_random_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Board extends JPanel {

	private JLabel labelAnsver = new JLabel("");
	
	
	final Random random = new Random();

	private Image image;

	public Board() {

		initBoard();
		
	}

	private void initBoard() {

		loadImage();

		int w = image.getWidth(this);
		int h = image.getHeight(this);
		setPreferredSize(new Dimension(w, h));

	}

	private JLabel setLabelStyle(JLabel label) {
		label.setForeground(new Color(245, 244, 252));
		label.setFont(new Font("SansSerif", Font.CENTER_BASELINE, 17));
		return label;
	}

	private void loadImage() {

		ImageIcon ii = new ImageIcon("src/magic_random_2/orig.jpg");
		Image newimg = ii.getImage().getScaledInstance(400, 480, java.awt.Image.SCALE_SMOOTH);

		ii = new ImageIcon(newimg);

		image = new ImageIcon(newimg).getImage();
		
		draw();
	}

	private void draw() {

		JLabel label = new JLabel("������� ��� ������:");

		this.add(setLabelStyle(label));

		JTextField input = new JTextField(" ");
		input.setColumns(22);
		input.setHorizontalAlignment(JTextField.LEADING);
		input.setFont(new Font("SansSerif", Font.CENTER_BASELINE, 17));
		input.setBackground(new Color(228, 224, 255));
		this.add(input);
		
		JButton button = new JButton("��������");
		button.addActionListener(new ButtonEventListener());
		button.setContentAreaFilled(false);
		button.setFont(new Font("SansSerif", Font.CENTER_BASELINE, 17));
		button.setForeground(new Color(228, 224, 255));
		Border etched = new LineBorder(new Color(228, 224, 255), 2);
		button.setPreferredSize(new Dimension(115, 42));
		button.setBorder(etched);
		
		labelAnsver.setVerticalAlignment (JLabel.CENTER);
		labelAnsver.setHorizontalAlignment (JLabel.CENTER);
		labelAnsver.setForeground(new Color(245, 244, 252));
		labelAnsver.setFont(new Font("SansSerif", Font.PLAIN, 17));
		labelAnsver.setPreferredSize(new Dimension(125, 283));
		
		ImageIcon icon = new ImageIcon("src/magic_random_2/Magic_eight_ball.png");
		Image newimg = icon.getImage().getScaledInstance(320, 320, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);

		
		JLabel bigLabel = new JLabel(icon);
        bigLabel.setLayout(new FlowLayout());
        bigLabel.add(labelAnsver);	
        
        
        this.add(button, BorderLayout.CENTER);
        
        this.add(bigLabel);
		
        this.add(new JLabel("(c) Babush Anastasia"));
	
	}

	@Override
	public void paintComponent(Graphics g) {

		g.drawImage(image, 0, 0, null);
	}

	public class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "<html><br><br><center>" + ANSWERS.get(String.valueOf(random.nextInt(19)))+"</center><br></html>";

			labelAnsver.setText(message);

		}
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

}