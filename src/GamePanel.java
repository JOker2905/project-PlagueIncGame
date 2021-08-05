import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GamePanel extends JPanel{
    Font font=new Font("Times New Roman",Font.PLAIN,50);
    Font font2=new Font("Times New Roman",Font.PLAIN,15);
    static final int GAME_WIDTH = 1280;
    static final int GAME_HEIGHT = 720;
    static final int COUNTRY_WIDTH = 180;
    static final int COUNTRY_HEIGHT = 80;
    static final int PLANE_WIDTH=80;
    static final int PLANE_HEIGHT=50;
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
    Random random;
    Thread thread1 = null;
    Thread thread2 = null;
    Thread thread3=null;
    JButton cureupgrade1;
    JButton cureupgrade2;
    JButton hospitalupgrade1;
    JButton hospitalupgrade2;
    JButton infectionupgrade;
    JButton deaduprgade1;
    JButton deadupgrade2;
    Country country1;
    Country country2;
    Country country3;
    Country country4;
    Country country5;
    Country country6;
    Country country7;
    Country country8;
    Country country9;
    Country country10;
    Country country11;
    Country country12;
    GameScore gameScore;
    Plane plane;
    List<Score> gameScoreList=null;
    JTextField fName,furatowani,fzgony;
    JLabel lName,luratowani,lzgony;
    JButton addplayerbutton;
    boolean run=false;

    GamePanel(){
        this.setPreferredSize(SCREEN_SIZE);
        this.setLayout(null);
        this.setBackground(Color.black);
        newcountry();
        newplane();
        run = true;
        gameScore = new GameScore(GAME_WIDTH, GAME_HEIGHT);
        upgrades();
        thread2();
        thread1();
        thread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }
    public void newcountry(){
        country1=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\chiny.png","Chiny",50,50,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country2=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\anglia.png","Anglia",50,220,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country3=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\francja.png","Francja",50,390,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country4=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\hiszpania.png","Hiszpania",50,560,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country5=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\czechy.png","Czechy",280,50,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country6=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\polska.png","Polska",280,220,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country7=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\rosja.png","Rosja",280,390,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country8=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\stanyzjednoczone.png","Usa",280,560,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country9=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\wlochy.png","Włochy",510,50,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country10=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\meksyk.png","Meksyk",510,220,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country11=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\argentyna.png","Argentyna",510,390,COUNTRY_WIDTH,COUNTRY_HEIGHT);
        country12=new Country("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\brazylia.png","Brazylia",510,560,COUNTRY_WIDTH,COUNTRY_HEIGHT);
    }
    public void newplane(){
        random=new Random();
        switch (random.nextInt(11)){
            case 0 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country1.x,country1.y,PLANE_WIDTH,PLANE_HEIGHT,country9.x,country9.y);
            case 1 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country1.x,country1.y,PLANE_WIDTH,PLANE_HEIGHT,country12.x,country12.y);
            case 2 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country1.x,country1.y,PLANE_WIDTH,PLANE_HEIGHT,country4.x,country4.y);
            case 3 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country9.x,country9.y,PLANE_WIDTH,PLANE_HEIGHT,country4.x,country4.y);
            case 4 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country9.x,country9.y,PLANE_WIDTH,PLANE_HEIGHT,country12.x,country12.y);
            case 5 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country9.x,country9.y,PLANE_WIDTH,PLANE_HEIGHT,country1.x,country1.y);
            case 6 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country4.x,country4.y,PLANE_WIDTH,PLANE_HEIGHT,country1.x,country1.y);
            case 7 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country4.x,country4.y,PLANE_WIDTH,PLANE_HEIGHT,country12.x,country12.y);
            case 8 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country4.x,country4.y,PLANE_WIDTH,PLANE_HEIGHT,country9.x,country9.y);
            case 9 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country12.x,country12.y,PLANE_WIDTH,PLANE_HEIGHT,country1.x,country1.y);
            case 10 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country12.x,country12.y,PLANE_WIDTH,PLANE_HEIGHT,country4.x,country4.y);
            case 11 ->plane=new Plane("C:\\JAVA DLA INTELIJ\\PROJEKT2(PlagueInc)\\plane.jpg",country12.x,country12.y,PLANE_WIDTH,PLANE_HEIGHT,country9.x,country9.y);
        }
    }
    public void chechcolision(){
        if (plane.x==plane.endx&&plane.y==plane.endy){
            newplane();
        }
    }
    public void move(){
        plane.move();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if(run) {
            country1.draw(g);
            country2.draw(g);
            country3.draw(g);
            country4.draw(g);
            country5.draw(g);
            country6.draw(g);
            country7.draw(g);
            country8.draw(g);
            country9.draw(g);
            country10.draw(g);
            country11.draw(g);
            country12.draw(g);
            gameScore.draw(g);
            gameScore.draw1(g);
            gameScore.draw2(g);
            plane.draw(g);
        }else {
            gameovertext(g);
            readgamescorelist();
            addplayer();
        }
    }
    public void addplayer(){
        lName=new JLabel("Name:");
        lName.setForeground(Color.WHITE);
        lName.setBounds(100,100,50,50);
        luratowani=new JLabel("Uratowani:");
        luratowani.setForeground(Color.WHITE);
        luratowani.setBounds(100,200,70,50);
        lzgony=new JLabel("Zgony:");
        lzgony.setForeground(Color.WHITE);
        lzgony.setBounds(100,300,50,50);
        fName=new JTextField();
        fName.setBounds(180,115,50,20);
        furatowani=new JTextField();
        furatowani.setText(String.valueOf(gameScore.saved));
        furatowani.setBounds(200,215,70,20);
        furatowani.setEnabled(false);
        fzgony=new JTextField();
        fzgony.setText(String.valueOf(gameScore.deaths));
        fzgony.setBounds(180,315,70,20);
        fzgony.setEnabled(false);
        addplayerbutton=new JButton("ADD");
        addplayerbutton.setBounds(350,210,70,30);
        addplayerbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Score score=getData();
                gameScoreList.add(score);
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gamescoreList.obj"));
                    oos.writeObject(gameScoreList);
                    oos.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        this.add(lName);
        this.add(fName);
        this.add(luratowani);
        this.add(furatowani);
        this.add(lzgony);
        this.add(fzgony);
        this.add(addplayerbutton);
    }
    public void readgamescorelist(){
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("gamescoreList.obj"));
            gameScoreList=(ArrayList<Score>)ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
            gameScoreList=new ArrayList<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            gameScoreList=new ArrayList<>();
        }
    }
    public Score getData(){
        return new Score(
           fName.getText(),Long.parseLong(furatowani.getText()),Long.parseLong(fzgony.getText()),gameScore.second,gameScore.minute,gameScore.hour
        );
    }

    public void gameovertext(Graphics g){
        g.setColor(Color.red);
        g.setFont(font);
        g.drawString("Koniec Gry",(GAME_WIDTH/2)-70,50);
    }
    public void upgrades(){
        cureupgrade1=new JButton("CureUprgade nr 1");
        cureupgrade1.setVisible(true);
        cureupgrade1.setFont(font2);
        cureupgrade1.setBackground(Color.yellow);
        cureupgrade1.setForeground(Color.black);
        cureupgrade1.setBounds(GAME_WIDTH-550,300,150,50);
        cureupgrade1.setToolTipText("Upgrades the propability to make cure");
        cureupgrade1.setEnabled(false);
        cureupgrade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    gameScore.propabilitytosuccess = 4;
                    gameScore.score -= 500;
                    cureupgrade1.setEnabled(false);
            }
        });
        this.add(cureupgrade1);

        cureupgrade2=new JButton("CureUprgade nr 2");
        cureupgrade2.setVisible(true);
        cureupgrade2.setFont(font2);
        cureupgrade2.setBackground(Color.yellow);
        cureupgrade2.setForeground(Color.black);
        cureupgrade2.setBounds(GAME_WIDTH-380,300,150,50);
        cureupgrade2.setToolTipText("Upgrades the amount of cure");
        cureupgrade2.setEnabled(false);
        cureupgrade2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.percent=2;
                gameScore.score-=500;
                cureupgrade2.setEnabled(false);
            }
        });
        this.add(cureupgrade2);

        hospitalupgrade1=new JButton("HospitalUpgrade nr 1");
        hospitalupgrade1.setVisible(true);
        hospitalupgrade1.setFont(font2);
        hospitalupgrade1.setBackground(Color.yellow);
        hospitalupgrade1.setForeground(Color.black);
        hospitalupgrade1.setBounds(GAME_WIDTH-200,300,160,50);
        hospitalupgrade1.setToolTipText("Upgrades the propability to heal");
        hospitalupgrade1.setEnabled(false);
        hospitalupgrade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propabilitytocureinhospital=4;
                gameScore.score-=500;
                hospitalupgrade1.setEnabled(false);
            }
        });
        this.add(hospitalupgrade1);

        hospitalupgrade2=new JButton("HospitalUpgrade nr 2");
        hospitalupgrade2.setVisible(true);
        hospitalupgrade2.setFont(font2);
        hospitalupgrade2.setBackground(Color.yellow);
        hospitalupgrade2.setForeground(Color.black);
        hospitalupgrade2.setBounds(GAME_WIDTH-200,400,160,50);
        hospitalupgrade2.setToolTipText("Upgrades amount of heal");
        hospitalupgrade2.setEnabled(false);
        hospitalupgrade2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.healinhospital=200;
                gameScore.score-=500;
                hospitalupgrade2.setEnabled(false);
            }
        });
        this.add(hospitalupgrade2);

        infectionupgrade=new JButton("InfectionUpgrade");
        infectionupgrade.setVisible(true);
        infectionupgrade.setFont(font2);
        infectionupgrade.setBackground(Color.yellow);
        infectionupgrade.setForeground(Color.black);
        infectionupgrade.setBounds(GAME_WIDTH-380,400,150,50);
        infectionupgrade.setToolTipText("Decrease amount of infection");
        infectionupgrade.setEnabled(false);
        infectionupgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propablitytoinfect=10;
                gameScore.score-=500;
                infectionupgrade.setEnabled(false);
            }
        });
        this.add(infectionupgrade);

        deaduprgade1=new JButton("DeadUpgrade nr 1");
        deaduprgade1.setVisible(true);
        deaduprgade1.setFont(font2);
        deaduprgade1.setBackground(Color.yellow);
        deaduprgade1.setForeground(Color.black);
        deaduprgade1.setBounds(GAME_WIDTH-550,400,150,50);
        deaduprgade1.setToolTipText("Decrease propability of death");
        deaduprgade1.setEnabled(false);
        deaduprgade1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.propabilitytodied=70;
                gameScore.score-=500;
                deaduprgade1.setEnabled(false);
            }
        });
        this.add(deaduprgade1);

        deadupgrade2=new JButton("DeadUpgrade nr 2");
        deadupgrade2.setVisible(true);
        deadupgrade2.setFont(font2);
        deadupgrade2.setBackground(Color.yellow);
        deadupgrade2.setForeground(Color.black);
        deadupgrade2.setBounds(GAME_WIDTH-550,500,150,50);
        deadupgrade2.setToolTipText("Deacrease amount of death");
        deadupgrade2.setEnabled(false);
        deadupgrade2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameScore.amountofdied=500;
                gameScore.score-=500;
                deadupgrade2.setEnabled(false);
            }
        });
        this.add(deadupgrade2);

    }
    public void chechforuprades(){
        if(gameScore.score>=500&& gameScore.propabilitytosuccess!=4) {
            cureupgrade1.setEnabled(true);
        }else{
            cureupgrade1.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.percent!=2) {
            cureupgrade2.setEnabled(true);
        }else{
            cureupgrade2.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.propabilitytocureinhospital!=4) {
            hospitalupgrade1.setEnabled(true);
        }else{
            hospitalupgrade1.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.healinhospital!=200) {
            hospitalupgrade2.setEnabled(true);
        }else{
            hospitalupgrade2.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.propablitytoinfect!=10) {
            infectionupgrade.setEnabled(true);
        }else{
            infectionupgrade.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.propabilitytodied!=70) {
            deaduprgade1.setEnabled(true);
        }else{
            deaduprgade1.setEnabled(false);
        }
        if(gameScore.score>=500&& gameScore.amountofdied!=500) {
            deadupgrade2.setEnabled(true);
        }else{
            deadupgrade2.setEnabled(false);
        }
    }
    public void startinfection(){
        random=new Random();
        if(gameScore.infected < gameScore.populate && gameScore.cure!=100) {
            switch (random.nextInt(gameScore.propablitytoinfect)) {
                case 0 -> gameScore.infected += 1;
                case 1 -> gameScore.infected += 10;
                case 2 -> gameScore.infected += 100;
                case 3 -> gameScore.infected += 1000;
                case 4 -> gameScore.infected += 10000;
                case 5 -> gameScore.infected += 100000;
            }
        }
    }
    public void startmakingcure(){
        random=new Random();
        if(gameScore.infected >=50000000){
            if(gameScore.cure< gameScore.maxpercentcure){
                if(random.nextInt(gameScore.propabilitytosuccess)==0)
                    gameScore.cure+= gameScore.percent;
            }
        }
    }
    public void cureinhospital(){
        random=new Random();
        if (gameScore.infected < gameScore.populate && gameScore.saved < gameScore.populate) {
            if (random.nextInt(gameScore.propabilitytocureinhospital) == 0) {
                gameScore.saved += gameScore.healinhospital;
                gameScore.infected -= gameScore.healinhospital;
                gameScore.populate -= gameScore.healinhospital;
                gameScore.score+= gameScore.healinhospital;
            }
        }
    }
    public void someonedied(){
        random=new Random();
        if(gameScore.saved < gameScore.populate && gameScore.infected < gameScore.populate)
        if (random.nextInt(gameScore.propabilitytodied)==0){
            gameScore.deaths += gameScore.amountofdied;
            gameScore.infected -= gameScore.amountofdied;
            gameScore.populate -= gameScore.amountofdied;
        }
    }
    public void curepopulation(){
        if(gameScore.cure==100){
            if(gameScore.infected >0) {
                switch (random.nextInt(8)){
                    case 0:
                        if (gameScore.infected -1>=0){
                            gameScore.infected -=1;
                            gameScore.saved +=1;
                            gameScore.score+=1;
                        }
                        break;
                    case 1:
                        if (gameScore.infected -10>=0){
                            gameScore.infected -=10;
                            gameScore.saved +=10;
                            gameScore.score+=10;
                        }
                        break;
                    case 2:
                        if (gameScore.infected -100>=0){
                            gameScore.infected -=100;
                            gameScore.saved +=100;
                            gameScore.score+=100;
                        }
                        break;
                    case 3:
                        if (gameScore.infected -1000>=0){
                            gameScore.infected -=1000;
                            gameScore.saved +=1000;
                            gameScore.score+=1000;
                        }
                        break;
                    case 4:
                        if (gameScore.infected -10000>=0){
                            gameScore.infected -=10000;
                            gameScore.saved +=10000;
                            gameScore.score+=10000;
                        }
                        break;
                    case 5:
                        if (gameScore.infected -100000>=0){
                            gameScore.infected -=100000;
                            gameScore.saved +=100000;
                            gameScore.score+=100000;
                        }
                        break;
                    case 6:
                        if (gameScore.infected -1000000>=0){
                            gameScore.infected -=1000000;
                            gameScore.saved +=1000000;
                            gameScore.score+=1000000;
                        }
                        break;
                    case 7:
                        if (gameScore.infected -10000000>=0){
                            gameScore.infected -=10000000;
                            gameScore.saved +=10000000;
                            gameScore.score+=10000000;
                        }
                        break;
                }
            }
        }
    }
    public void gameover(){
        if(gameScore.infected <=0|| gameScore.infected == gameScore.populate){
            run=false;
            cureupgrade1.setVisible(false);
            cureupgrade2.setVisible(false);
            hospitalupgrade1.setVisible(false);
            hospitalupgrade2.setVisible(false);
            infectionupgrade.setVisible(false);
            deaduprgade1.setVisible(false);
            deadupgrade2.setVisible(false);
        }
    }

    public void thread1() {

        thread1=new Thread(()->{
        long lastTime = System.nanoTime();
        double amountOfTicks =60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(run) {
           long now = System.nanoTime();
            delta += (now -lastTime)/ns;
            lastTime = now;
            if(delta >=1) {
                     startinfection();
                     gameover();
                     chechforuprades();
                     move();
                     chechcolision();
                try {
                    Thread.sleep(50);
                 } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
                delta--;
            }
        }
     });
    }
    public void thread2() {

        thread2=new Thread(()->{
        long lastTime = System.nanoTime();
        double amountOfTicks =60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        while(run) {
            long now = System.nanoTime();
            delta += (now -lastTime)/ns;
            lastTime = now;
            if(delta >=1) {
                startmakingcure();
                curepopulation();
                someonedied();
                cureinhospital();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
                delta--;
            }
        }
        });
    }
    public void thread3() {

        thread3=new Thread(()->{
            while(run) {
                    gameScore.second++;
                    if(gameScore.second==60){
                        gameScore.second=0;
                        gameScore.minute++;
                    }
                    if(gameScore.minute==60){
                        gameScore.minute=0;
                        gameScore.hour++;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    repaint();
                }
        });
    }

}
