package lab1;
import java.awt.*;

public class DrawEclipse extends Component {
    public void paint(Graphics g) {

        // Retrieve the graphics context; this object is used to paint shapes

        Graphics2D g2d = (Graphics2D) g;

        int x = 15;
        int y = 15;
        int w = 150;
        int h = 150;


        g2d.drawOval(x, y, w, h);


    }
}
