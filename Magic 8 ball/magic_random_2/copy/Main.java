package magic_random_2.copy;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {

    public Main() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        pack();

        setTitle("Magic 8 ball");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);        
        ImageIcon webIcon = new ImageIcon("src/magic_random_2/Magic-512.png");
        setIconImage(webIcon.getImage());
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
        	Main ex = new Main();
            ex.setVisible(true);
        });
    }
}