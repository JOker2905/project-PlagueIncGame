import javax.swing.*;

public class GameWindow extends JFrame {
    GamePanel panel;
    GameWindow(){
        panel=new GamePanel();
        this.add(panel);
        this.setSize(1280,720);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
    }
}
