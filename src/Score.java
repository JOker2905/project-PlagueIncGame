import java.io.Serializable;

public class Score implements Serializable {
    private String name;
    private long saved;
    private long deaths;
    private int second;
    private int minute;
    private int hour;

    public Score(String name,long saved,long deaths,int second,int minute,int hour){
        this.name=name;
        this.saved =saved;
        this.deaths =deaths;
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public String getName() {
        return name;
    }

    public long getDeaths() {
        return deaths;
    }

    public long getUratowani() {
        return saved;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Name:"+getName()+"    "+"Uratowani:"+getUratowani()+"    "+"Zgony:"+ getDeaths()+"    "+"Czas: "+getHour()+":"+getMinute()+":"+getSecond();
    }
}
