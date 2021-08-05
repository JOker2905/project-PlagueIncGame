import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class HighScore extends JFrame {
    List<Score> highscorelist=null;
    HighScore(){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("gamescoreList.obj"));
            highscorelist =(ArrayList<Score>)ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        DefaultListModel<Score> dlm=new DefaultListModel<>();
        for(Score score: highscorelist)
            dlm.add(0,score);


        JList<Score>jList=new JList<>(dlm);
        JPanel jPanel=new JPanel();
        jPanel.add(jList);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(jPanel);

        scrollPane.setPreferredSize(new Dimension(200,200));

        this.setResizable(false);
        this.add(scrollPane);
        this.pack();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}
