package lab1;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

public class SetCircles extends Component {
    public void paint(Graphics g) {

        // Retrieve the graphics context; this object is used to paint shapes

        Graphics2D g2d = (Graphics2D) g;
        Random rand = new Random();

        int curX = 50;
        int endX = 250;
        int r1 = 100;
        int r2 = 200;
        int a = 300 / 2;
        int b = 300 / 2;
        int step = 15;

        System.out.printf("a: %d , b: %d \n" , a, b);
        while(curX <= endX){
            int y1 = (int) (  Math.sqrt(Math.pow(r1,2) - Math.pow((curX - a),2)) + b );
            int y2 = (int) ( b - Math.sqrt(Math.pow(r1,2) - Math.pow((curX - a),2)) );
            System.out.printf("x: %d , y: %d \n" , curX, y1);
            System.out.printf("x: %d , y: %d \n" , curX, y2);

            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            Color randomColor = new Color(red, green, blue);
//            g2d.setColor(randomColor);
//            g2d.fillOval(curX,y1,r2,r2);
//            red = rand.nextFloat();
//            green = rand.nextFloat();
//            blue = rand.nextFloat();
//            randomColor = new Color(red, green, blue);
//            g2d.setColor(randomColor);
//            g2d.fillOval(curX,y2,r2,r2);

            g2d.setColor(randomColor);
            g2d.drawOval(curX,y1,r2,r2);
            red = rand.nextFloat();
            green = rand.nextFloat();
            blue = rand.nextFloat();
            randomColor = new Color(red, green, blue);
            g2d.setColor(randomColor);
            g2d.drawOval(curX,y2,r2,r2);

            curX += step;
        }
    }
}
