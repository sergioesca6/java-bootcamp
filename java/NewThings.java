import java.awt.*;
import javax.swing.JFrame;

public class NewThings extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.red);
        g.drawRect(20,20,10,20);  // draw a rectangle
        g.fillOval(100,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,300,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("New");
        win.setSize(1000,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}