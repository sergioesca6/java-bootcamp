import java.awt.*;
import javax.swing.JFrame;

public class Sierpinski extends Canvas
{
	public void paint( Graphics g ) throws InterruptedException
	{
		Random r = new Random();
		int count = 0, x1 = 512, x2 = 146, x3 = 876, y1 = 109, y2 = 654, y3 = 654, x = 512, y = 382;
		g.setColor(Color.black);
		while ( count <= 50000 )
		{
		count++;
		g.drawLine(x,y,x,y);
		Thread.sleep(100);
		
		
		 