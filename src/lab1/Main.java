package lab1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Window wd = new Window(600,600);

//        Ex1
            wd.add(new DrawLine());

//        Ex2
//        Draw Rectangle
//        wd.add(new DrawRectangle());
//        wd.add(new DrawEclipse());
//        wd.add(new DrawStar( 100 ,100 ,100));

//        Ex3
//         wd.add(new SetCircles());

//        Ex5 go to Hello2D

    }

}

class Window {
    // Create a frame
    int frameWidth;
    int frameHeight;
    Frame frame;

    Window(int frameWidth, int frameHeight) {
        this.frameWidth = frameWidth;

        this.frameHeight = frameHeight;
        this.frame = new Frame();

        this.frame.setSize(this.frameWidth, this.frameHeight);
        this.frame.setVisible(true);
        this.frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                frame.dispose();

            }
        }
        );
    }

    public void add(Component component){
        this.frame.add(component);
    }
}
