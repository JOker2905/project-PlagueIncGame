import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Country extends Rectangle{
    Image image;
    ImageObserver imageObserver;
    String name;

    public Country(String filename,String name,int x, int y, int Country_WIDTH, int Country_HEIGHT){
        super(x,y,Country_WIDTH,Country_HEIGHT);
        ImageIcon icon = new ImageIcon(filename);
        image = icon.getImage();
        imageObserver = icon.getImageObserver();
        this.name=name;
    }

    public void draw( Graphics g ) {
        g.drawImage(image,  x , y , width , height, imageObserver);
        g.setColor(Color.white);
        g.drawString(name,x,y-5);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }
}
