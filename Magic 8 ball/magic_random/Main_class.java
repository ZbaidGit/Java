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

	private JButton button = new JButton("Спросить");
	private JLabel label = new JLabel(" Введите Ваш вопрос:");
	private JLabel labelAnsver = new JLabel(" ");
	private JTextField input = new JTextField(" ", 5);
	private JLabel Newlabel = new JLabel(" ");
	private JLabel Newlabel2 = new JLabel(" ");
	private JLabel MyAnsver = new JLabel(" Мой ответ: ");

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

			// Положительные
			put("0", "Бесспорно");
			put("1", "Предрешено");
			put("2", "Никаких сомнений");
			put("3", "Определённо да");
			put("4", "Можешь быть уверен в этом");
			// Нерешительно положительные
			put("5", "Мне кажется — «да»");
			put("6", "Вероятнее всего");
			put("7", "Хорошие перспективы");
			put("8", "Знаки говорят — «да»");
			put("9", "Да");
			// Положительные
			put("10", "Пока не ясно, попробуй снова");
			put("11", "Спроси позже");
			put("12", "Лучше не рассказывать");
			put("13", "Сейчас нельзя предсказать");
			put("14", "Сконцентрируйся и спроси опять");
			// Нерешительно положительные
			put("15", "Даже не думай");
			put("16", "Мой ответ — «нет»");
			put("17", "По моим данным — «нет»");
			put("18", "Перспективы не очень хорошие");
			put("19", "Весьма сомнительно");
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


