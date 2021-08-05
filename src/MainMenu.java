import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JFrame {

    GamePanel gamePanel=new GamePanel();
    public MainMenu(){
        this.setSize(800,600);
        this.getContentPane().setBackground(Color.black);
        this.setLayout(null);
        this.setTitle("Koronawirus AntiPlague");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        JPanel titleNamePanel=new JPanel();
        titleNamePanel.setBounds(50,50,700,150);
        titleNamePanel.setBackground(Color.black);
        JLabel titleNameLabel=new JLabel("CORONAVIRUS ANTIPLAGUE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(new Font("Time New Roman",Font.PLAIN,50));

        JPanel startButtonPanel=new JPanel();
        startButtonPanel.setBounds(300,200,200,100);
        startButtonPanel.setBackground(Color.black);

        JPanel highscorepanel=new JPanel();
        highscorepanel.setBounds(300,300,200,100);
        highscorepanel.setBackground(Color.black);

        JPanel exitpanel=new JPanel();
        exitpanel.setBounds(300,400,200,100);
        exitpanel.setBackground(Color.black);

        JButton startButton=new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(new Font("Times New Roman",Font.PLAIN,30));
        startButton.setToolTipText("Start a new game");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Difficulty difficulty =new Difficulty();
                dispose();
                //setVisible(false);
            }
        });

        JButton highscorebutton=new JButton("High Scores");
        highscorebutton.setBackground(Color.black);
        highscorebutton.setForeground(Color.white);
        highscorebutton.setFont(new Font("Times New Roman",Font.PLAIN,30));
        highscorebutton.setToolTipText("Show a scoreboard");
        highscorebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HighScore highScore=new HighScore();
            }
        });

        JButton exitbutton=new JButton("EXIT");
        exitbutton.setBackground(Color.black);
        exitbutton.setForeground(Color.white);
        exitbutton.setFont(new Font("Times New Roman",Font.PLAIN,30));
        exitbutton.setToolTipText("Exit the aplication");
        exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        highscorepanel.add(highscorebutton);
        exitpanel.add(exitbutton);

        this.add(titleNamePanel);
        this.add(startButtonPanel);
        this.add(highscorepanel);
        this.add(exitpanel);

    }

}
