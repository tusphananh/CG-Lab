package lab1;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class DrawStar extends Component {

    private double x;
    private double y;
    private double radius;

    private final static double FACTOR = 2.63;
    private final static double ALFA = 18*Math.PI/180;
    private final static double BETA = 54*Math.PI/180;

    private final static double[] X = {0,Math.cos(BETA)/FACTOR, Math.cos(ALFA ),
            Math.cos(ALFA )/FACTOR, Math.cos(BETA),0,
            -Math.cos(BETA),-Math.cos(ALFA)/FACTOR,
            -Math.cos(ALFA ),-Math.cos(BETA)/FACTOR,0};

    private final static double[] Y = {-1,-Math.sin(BETA)/FACTOR, -Math.sin(ALFA ),
            Math.sin(ALFA )/FACTOR, Math.sin(BETA),1/FACTOR,
            Math.sin(BETA),Math.sin(ALFA )/FACTOR,
            -Math.sin(ALFA ),-Math.sin(BETA)/FACTOR,-1};

    private int[] xCoordOfStar; // x coordinates of the vertices of the star as pixel
    private int[] yCoordOfStar; // x coordinates of the vertices of the star as pixel

    public DrawStar(double radius , double x, double y){
        this.x = x;
        this.y = y;
        this.radius = radius;
        xCoordOfStar= new int[X.length];
        yCoordOfStar= new int[Y.length];
        int i;
        for (i=0; i<X.length; i++){
            xCoordOfStar[i] = (int)(radius*X[i]+x);
            yCoordOfStar[i] = (int)(radius*Y[i]+y);
        }
    }

    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Point2D.Double[] points = new Point2D.Double[xCoordOfStar.length];
        Line2D.Double[] lines = new Line2D.Double[points.length];
        for (int i = 0 ; i < xCoordOfStar.length ; i++){
            points[i] = new Point2D.Double(xCoordOfStar[i], yCoordOfStar[i]);

        }
        for (int i = 0 ; i < xCoordOfStar.length - 1 ; i++){
            lines[i] = new Line2D.Double(points[i],points[i+1]);
            g2d.draw(lines[i]);
        }

        g2d.drawString("This is star",(int) ( this.x/2 ) , (int) ( this.y + this.radius));

    }
}
