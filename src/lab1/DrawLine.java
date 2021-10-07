package lab1;


import java.awt.*;
import java.lang.Math;

public class DrawLine extends Component{
    public void paint(Graphics g) {

        // Retrieve the graphics context; this object is used to paint shapes

        Graphics2D g2d = (Graphics2D) g;

        int x1 = 0;

        int y1 = getHeight();

        int x2 = getWidth();

        int y2 = 0;

//        int a = (int) Math.ceil( -getHeight()/getWidth() );
        int a = -1;
        int b  = getHeight();


        System.out.printf("a: %d,b: %d \n",a,b);
        // Draw diagonal
        g2d.drawLine(x1,y1,x2,y2);

        // As the figure we will have 7 points
        int points = 7;
        System.out.printf("w: %d,h: %d \n",getWidth(),getHeight());

        // To calculate step we will divide with for point number
        int step = (int) getWidth() / points ;

        int curX = step;

        for (int i = 0 ; i < points; i++){
            int curY = (int) (a*curX + b);
            System.out.printf("x: %d,y: %d \n",curX,curY);
            g2d.drawLine(0,0,curX,curY);

            curX = curX + step;
        }
    }
}
