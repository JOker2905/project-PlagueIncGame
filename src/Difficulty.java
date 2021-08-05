import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Difficulty extends JFrame {
    JButton easy;
    JButton medium;
    JButton hard;
    GameScore gameScore;
    Font font=new Font("Times New Roman",Font.PLAIN,20);

    Difficulty(){
        gameScore =new GameScore(1280,720);
        this.setSize(447,89);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);

        easy=new JButton("EASY");
        easy.setBackground(Color.black);
        easy.setForeground(Color.white);
        easy.setFont(font);
        easy.setBounds(0,0,130,50);
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propabilitytosuccess=5;
                easy.setVisible(false);
                medium.setVisible(false);
                hard.setVisible(false);
                GameWindow gameWindow=new GameWindow();
                dispose();
            }
        });

        medium=new JButton("MEDIUM");
        medium.setBackground(Color.black);
        medium.setForeground(Color.white);
        medium.setFont(font);
        medium.setBounds(150,0,130,50);
        medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propabilitytosuccess=10;
                easy.setVisible(false);
                medium.setVisible(false);
                hard.setVisible(false);
                GameWindow gameWindow=new GameWindow();
                dispose();
            }
        });

        hard=new JButton("HARD");
        hard.setBackground(Color.black);
        hard.setForeground(Color.white);
        hard.setFont(font);
        hard.setBounds(300,0,130,50);
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propabilitytosuccess=15;
                easy.setVisible(false);
                medium.setVisible(false);
                hard.setVisible(false);
                GameWindow gameWindow=new GameWindow();
                dispose();
            }
        });

        this.add(easy);
        this.add(medium);
        this.add(hard);

    }
}
