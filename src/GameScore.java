import java.awt.*;
import java.text.DecimalFormat;

public class GameScore {
    DecimalFormat decimalFormat;

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    long populate=5000000000L;
    long saved =0L;
    long infected =1L;
    long deaths=0L;
    long score=0L;

    int maxpercentcure=100;
    int cure=0;
    int percent=1;
    int propabilitytosuccess=5;

    int amountofdied=1000;
    int propablitytoinfect=7;
    int propabilitytocureinhospital=5;
    int propabilitytodied=50;
    int healinhospital=100;

    int second=0;
    int minute=0;
    int hour=0;

    String ddsecond,ddminute,ddhour;


    GameScore(int GAME_WIDTH, int GAME_HEIGHT){
        GameScore.GAME_WIDTH = GAME_WIDTH;
        GameScore.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics g){
        g.setColor(Color.white);

        g.setFont(new Font("Consolas",Font.PLAIN,30));

        g.drawString("Infected:"+String.valueOf(infected),GAME_WIDTH-400,100);
        g.drawString("Healed:"+String.valueOf(saved),GAME_WIDTH-400,150);
        g.drawString("Deaths:"+String.valueOf(deaths),GAME_WIDTH-400,200);
        g.drawString("Vaccine:"+String.valueOf(cure),GAME_WIDTH-500,250);
    }
    public void draw2(Graphics g){
        g.setFont(new Font("Consolas",Font.PLAIN,50));
        g.setColor(Color.RED);
        g.drawString("SCORE:"+score,GAME_WIDTH-550,630);
    }
    public void draw1(Graphics g){
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,50));

        decimalFormat=new DecimalFormat("00");

        ddsecond=decimalFormat.format(second);
        ddminute=decimalFormat.format(minute);
        ddhour=decimalFormat.format(hour);

        g.drawString(ddhour+":"+ddminute+":"+ddsecond,GAME_WIDTH-450,50);
    }
}
