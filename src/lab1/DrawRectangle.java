package lab1;
import java.awt.*;

public class DrawRectangle extends Component {

    public void paint(Graphics g) {

        // Retrieve the graphics context; this object is used to paint shapes

        Graphics2D g2d = (Graphics2D) g;

        int x1 = 15;

        int y1 = 15;

        int w = 200;

        int h = 150;


        g2d.drawRect(x1,y1,w,h);


    }
}
