import java.awt.*;
import javax.swing.JFrame;

public class BoringTriangle extends Canvas
{
	public void paint( Graphics g )
	{
		Polygon tri = new Polygon();
		tri.addPoint(100,100);
		tri.addPoint(100,300);
		tri.addPoint(300,300);
		
		Color myPurple = new Color(102,51,255);
		g.setColor(myPurple);
		g.fillPolygon(tri);
	}
	
	 public static void main(String[] args)
    {
        JFrame win = new JFrame("Purple Triangle");
        win.setSize(1000,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoringTriangle canvas = new BoringTriangle();
        win.add( canvas );
        win.setVisible(true);
    }

}