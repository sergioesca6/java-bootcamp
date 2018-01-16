import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );
		drawBox( window, Color.CYAN,  100, 300, 100, 50 );
		drawBox( window, Color.PINK,  700, 220, 30, 150 );
		drawBox( window, Color.ORANGE,  400, 50, 50, 150 );
		drawBox( window, Color.BLACK,  20, 20, 30, 150 );
		drawBox( window, Color.GRAY,  260, 200, 60, 80 );
		drawBox( window, Color.GREEN,  100, 100, 150, 40 );

		// draw six more boxes -- different colors, different places, different sizes
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,w,h);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}