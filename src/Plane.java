import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Plane extends Rectangle {
    Image image;
    ImageObserver imageObserver;
    int endx;
    int endy;

    public Plane(String filename,int startx,int starty,int Plane_WIDTH, int Plane_HEIGHT,int endx,int endy){
        super(startx,starty,Plane_WIDTH,Plane_HEIGHT);
        ImageIcon icon = new ImageIcon(filename);
        image = icon.getImage();
        imageObserver = icon.getImageObserver();
        this.endx=endx;
        this.endy=endy;
    }
    public void move(){
        if(x<endx&&y<endy){
           if (x!=endx)
                x++;
            if(y!=endy)
                y++;
        }
        if(x>endx&&y>endy){
            if(x!=endx)
                x--;
            if (y!=endy)
                y--;
        }
        if (x<endx&&y>endy){
            if(x!=endx)
                x++;
            if (y!=endy)
                y--;
        }
        if (x>endx&&y<endy){
            if (x!=endx)
                x--;
            if (y!=endy)
                y++;
        }
        if (x>endx&&y==endy){
            if (x!=endx)
                x--;
        }
        if (x==endx&&y>endy){
            if (y!=endy)
                y--;
        }
        if(x<endx&&y==endy){
            if(x!=endx)
                x++;
        }
        if(x==endx&&y<endy){
            if (y!=endy)
                y++;
        }

    }
    public void draw(Graphics g){
        g.drawImage(image,x,y,width,height,imageObserver);
    }
}
