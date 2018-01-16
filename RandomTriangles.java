import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;

public class RandomTriangles extends Canvas
{
	public void paint( Graphics g )
	{
		Random r = new Random();
		int count = 0;
		
		while ( count <= 500 )
		{
		count ++;
		Color Random = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
		
		Polygon tri = new Polygon();
        tri.addPoint(r.nextInt(500),r.nextInt(500));
        tri.addPoint(r.nextInt(500),r.nextInt(500));
        tri.addPoint(r.nextInt(500),r.nextInt(500));
        g.setColor(Random);
        g.fillPolygon(tri);
        }
        
    }
    public static void main( String[] args )
    {
    JFrame win = new JFrame("Random Triangles");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	RandomTriangles canvas = new RandomTriangles();
	win.add( canvas );
	win.setVisible(true);
	}
}
