import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class RandomRightTriangles extends Canvas
{
	public void paint( Graphics g )
	{
		Random r = new Random();
		int count = 0;
		
		while ( count <= 500 )
		{
		count ++;
		Color Random = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
		int a = r.nextInt(500), b = r.nextInt(500);
		Polygon tri = new Polygon();
        tri.addPoint(a,b);
        tri.addPoint(a,b+50);
        tri.addPoint(a+50,b+50);
        g.setColor(Random);
        g.fillPolygon(tri);
        }
        
    }
    public static void main( String[] args )
    {
    JFrame win = new JFrame("Random Right Triangles");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	RandomRightTriangles canvas = new RandomRightTriangles();
	win.add( canvas );
	win.setVisible(true);
	}
}
