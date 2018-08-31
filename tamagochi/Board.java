package tamagochi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Board extends JPanel {

	private Image image;

	private Creature creature = new Creature();

	private JProgressBar progressBarHungry = designJProgressBar(creature.getHunger());
	private JProgressBar progressBarTired = designJProgressBar(creature.getEnergy());
	private JProgressBar progressBarBored = designJProgressBar(creature.getBored());

	JButton btnFeed = designButton("Покормить");
	JButton btnPlay = designButton("Поиграть");
	JButton btnSleep = designButton("Поспать");

	BufferedImage img = null;

	public Board() {

		creature.setName(" " + JOptionPane.showInputDialog(Board.this, "<html><h2>Дай мне имя, пожалуйста</html>"));

		initBoard();

		Timer hTimer = new Timer();
		MyTimerHungerTask hMyTimerTask = new MyTimerHungerTask();
		// delay 1000ms, repeat in 7000ms
		hTimer.schedule(hMyTimerTask, 3000, 9000);

		Timer eTimer = new Timer();
		MyTimerEnergyTask eMyTimerTask = new MyTimerEnergyTask();
		// delay 1000ms, repeat in 5000ms
		eTimer.schedule(eMyTimerTask, 5000, 12000);

		Timer bTimer = new Timer();
		MyTimerBoredTask bMyTimerTask = new MyTimerBoredTask();
		// delay 1000ms, repeat in 5000ms
		bTimer.schedule(bMyTimerTask, 1000, 6000);

		Timer Timer = new Timer();
		StupidTask Task = new StupidTask();
		// delay 1000ms, repeat in 5000ms
		Timer.schedule(Task, 100);

	}

	class StupidTask extends TimerTask {
		public void run() {
			designImg("src/tamagochi/img/happy.png");
		}
	}

	class MyTimerHungerTask extends TimerTask {

		@Override
		public void run() {
			creature.decreaseHunger();
			reloadBoard();
			if (creature.getHunger() == 30) {
				progressBarHungry.setForeground(new Color(140, 8, 105));
			}
			if (creature.getHunger() == 10) {
				progressBarHungry.setForeground(new Color(140, 8, 47));
			}
			if (creature.getHunger() == 0)
				errorTray("Попробуй еще раз! ", "Я ушел");
		}
	}

	class MyTimerEnergyTask extends TimerTask {

		@Override
		public void run() {
			creature.decreaseEnergy();
			reloadBoard();
			if (creature.getEnergy() == 30) {
				progressBarTired.setForeground(new Color(140, 8, 105));
			}
			if (creature.getEnergy() == 10) {
				warningTray("Мне надо поспать! ", "Я устал");
				progressBarTired.setForeground(new Color(140, 8, 47));
			}

		}
	}

	class MyTimerBoredTask extends TimerTask {

		@Override
		public void run() {
			creature.increaseBored();
			reloadBoard();

			if (creature.getBored() == 70) {
				progressBarBored.setForeground(new Color(140, 8, 105));
			}
			if (creature.getBored() == 90) {
				warningTray("Теперь энергия снижается в два раза быстрее! ", "Я соскучился");
				progressBarBored.setForeground(new Color(140, 8, 47));
			}
			if (creature.getBored() == 100) {
				creature.decreaseEnergy();

			}

		}
	}

	private void errorTray(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
		creature = new Creature();
		reloadBoard();
	}

	private void warningTray(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

	}

	private void reloadBoard() {
		progressBarHungry.setValue(creature.getHunger());
		progressBarTired.setValue(creature.getEnergy());
		progressBarBored.setValue(creature.getBored());
		if (creature.getHunger() > 30) {
			progressBarHungry.setForeground(new Color(53, 4, 66));
		}
		if (creature.getBored() < 70) {
			progressBarBored.setForeground(new Color(53, 4, 66));
		}
		if (creature.getEnergy() > 30) {
			progressBarTired.setForeground(new Color(53, 4, 66));
		}

		// ----------------------------------------Imgs---------------------------------------
		// repaint();
		/*---*/if (creature.getBored() == 100 || creature.getEnergy() == 0 || creature.getHunger() == 0) {
			designImg("src/tamagochi/img/dead.png");
		} else if (creature.getBored() == 90 || creature.getEnergy() == 10 || creature.getHunger() == 10) {
			designImg("src/tamagochi/img/shoked.png");
		} else if (creature.getBored() == 80 || creature.getEnergy() == 20 || creature.getHunger() == 20) {
			designImg("src/tamagochi/img/angry.png");
		} else if (creature.getBored() == 70 || creature.getEnergy() == 30 || creature.getHunger() == 30) {
			designImg("src/tamagochi/img/sad.png");
		} else if (creature.getBored() == 60 || creature.getEnergy() == 40 || creature.getHunger() == 40) {
			designImg("src/tamagochi/img/surprised.png");
		} else if (creature.getBored() == 50 || creature.getEnergy() == 50 || creature.getHunger() == 50) {
			designImg("src/tamagochi/img/smile.png");
		} else if (creature.getBored() < 40 || creature.getEnergy() > 60 || creature.getHunger() > 60) {
			designImg("src/tamagochi/img/happy.png");
		}

	}

	private void initBoard() {

		loadImage();

		int w = image.getWidth(this);
		int h = image.getHeight(this);
		setPreferredSize(new Dimension(w, h));

	}

	private void loadImage() {

		ImageIcon ii = new ImageIcon("src/tamagochi/img/fon.jpg");
		Image newimg = ii.getImage().getScaledInstance(550, 450, java.awt.Image.SCALE_SMOOTH);

		ii = new ImageIcon(newimg);

		image = new ImageIcon(newimg).getImage();

		draw();
	}

	private JButton designButton(String text) {

		JButton btn = new JButton(text);
		btn.setContentAreaFilled(false);
		btn.setFont(new Font("SansSerif", Font.CENTER_BASELINE, 17));
		btn.setForeground(new Color(53, 4, 66));
		Border etched = new LineBorder(new Color(53, 4, 66), 2);
		btn.setPreferredSize(new Dimension(112, 39));
		btn.setBorder(etched);
		return btn;
	}

	private JProgressBar designJProgressBar(int val) {

		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(val);
		progressBar.setFont(new Font("SansSerif", Font.PLAIN, 15));
		progressBar.setForeground(new Color(53, 4, 66));
		return progressBar;
	}

	private JLabel designJLabel(String val) {

		JLabel label = new JLabel(val);

		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(new Color(53, 4, 66));
		label.setFont(new Font("SansSerif", Font.PLAIN, 17));

		return label;
	}

	private void designImg(String src) {

		try {
			img = ImageIO.read(new File(src));
		} catch (IOException e) {
		}

		Graphics g = getGraphics();
		g.drawImage(img, 30, 30, 300, 300, null);
	}

	private void draw() {

		btnFeed.addActionListener(new btnFeedEventListener());
		btnPlay.addActionListener(new btnPlayEventListener());
		btnSleep.addActionListener(new btnSleepEventListener());

		JPanel pButtons = new JPanel();
		pButtons.add(btnFeed);
		pButtons.add(new JLabel("   "));
		pButtons.add(btnPlay);
		pButtons.add(new JLabel("   "));
		pButtons.add(btnSleep);
		// pButtons.add(new JLabel(" "));
		pButtons.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new EmptyBorder(5, 5, 5, 5)));

		pButtons.setOpaque(false);

		JPanel pImg = new JPanel();
		pImg.add(new JLabel());

		pImg.setOpaque(false);
		pImg.setPreferredSize(new Dimension(280, 280));

		JPanel pCaracteristics = new JPanel();
		pCaracteristics.add(new JLabel("                                                             "));
		pCaracteristics.add(designJLabel("Сытость:"));
		pCaracteristics.add(progressBarHungry);
		pCaracteristics.add(designJLabel("Скука:"));
		pCaracteristics.add(progressBarBored);
		pCaracteristics.add(designJLabel("Энергия:"));
		pCaracteristics.add(progressBarTired);

		pCaracteristics.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new EmptyBorder(5, 5, 5, 5)));
		pCaracteristics.setOpaque(false);
		pCaracteristics.setPreferredSize(new Dimension(220, 320));

		this.setLayout(new BorderLayout(10, 1));

		JLabel name = designJLabel(creature.getName());
		name.setText("<html><h2>" + name.getText() + "</h2></html>");
		// name.setPreferredSize(new Dimension(220, 20));

		this.add(name, BorderLayout.NORTH);
		this.add(pButtons, BorderLayout.SOUTH);
		this.add(pImg, BorderLayout.CENTER);
		this.add(pCaracteristics, BorderLayout.EAST);

	}

	@Override
	public void paintComponent(Graphics g) {

		g.drawImage(image, 0, 0, null);
	}

	public class btnFeedEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			creature.increaseHunger();
			reloadBoard();
			designImg("src/tamagochi/img/smart.png");
		}
	}

	public class btnPlayEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			creature.decreaseBored();
			reloadBoard();
			designImg("src/tamagochi/img/in-love.png");
		}
	}

	public class btnSleepEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			creature.increaseEnergy();
			reloadBoard();
			designImg("src/tamagochi/img/calm.png");
		}
	}

}
