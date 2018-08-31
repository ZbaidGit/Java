package magic_random_2.copy;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import magic_random_2.copy.Main;

@SuppressWarnings({ "serial", "unused" })
public class Board extends JPanel {

	

	private JLabel labelAnsver = new JLabel("");

	JLabel bigLabel = new JLabel();

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

	private void loadImage() {

		ImageIcon ii = new ImageIcon("src/magic_random_2/orig.jpg");
		Image newimg = ii.getImage().getScaledInstance(400, 340, java.awt.Image.SCALE_SMOOTH);

		ii = new ImageIcon(newimg);

		image = new ImageIcon(newimg).getImage();

		draw();
	}

	private void draw() {

		labelAnsver.setVerticalAlignment(JLabel.CENTER);
		labelAnsver.setHorizontalAlignment(JLabel.CENTER);
		labelAnsver.setForeground(new Color(245, 244, 252));
		labelAnsver.setFont(new Font("SansSerif", Font.PLAIN, 17));
		labelAnsver.setPreferredSize(new Dimension(125, 283));

		ImageIcon icon = new ImageIcon("src/magic_random_2/Magic_eight_ball.png");
		Image newimg = icon.getImage().getScaledInstance(320, 320, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg);

		bigLabel = new JLabel(icon);
		bigLabel.setPreferredSize(new Dimension(320, 320));
		bigLabel.setLayout(new FlowLayout());
		bigLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bigLabel.setToolTipText("������� �� ��� ����� �������� ����� �� ������ ��/���.");
		bigLabel.add(labelAnsver);

		bigLabel.addMouseListener(new MouseAdapter());

		this.add(bigLabel);

	}

	@Override
	public void paintComponent(Graphics g) {

		g.drawImage(image, 0, 0, null);
	}

	public class MouseAdapter implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			String message = "<html><br><br><center>" + ANSWERS.get(String.valueOf(random.nextInt(19)))
					+ "</center><br></html>";
			labelAnsver.setText(message);
        }
    
         
		

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
	// ---------------------------Animation

	

//---------------------
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