import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
	public void paint( Graphics g )
	{
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
		drawSmilingFace(g,400,50);
		drawSmilingFace(g,100,400);
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		
		g.setColor(Color.yellow);
		g.drawOval(x,y,200,200);
		g.setColor(Color.red);
		g.drawArc(x+50,y+70,100,100,180,180);
		g.setColor(Color.blue);
		g.drawOval(x+62,y+70,20,20);
		g.drawOval(x+112,y+70,20,20);
		
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}


}