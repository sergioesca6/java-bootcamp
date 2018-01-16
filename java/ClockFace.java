import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
	public void paint( Graphics g )
	{
	g.setColor(Color.black);
	g.drawOval(250,100,300,300);
	g.drawOval(395,245,10,10);
	g.drawString("12",395,120);
	g.drawString("1",460,135);
	g.drawString("2",510,180);
	g.drawString("3",540,250);
	g.drawString("4",515,325);
	g.drawString("5",470,370);
	g.drawString("6",395,390);
	g.drawString("7",320,370);
	g.drawString("8",270,320);
	g.drawString("9",255,250);
	g.drawString("10",280,175);
	g.drawString("11",323,133);
	g.drawLine(400,250,450,150);
	g.drawLine(400,250,450,300);

	}
	
	public static void main( String[] args )
	{
	JFrame win = new JFrame("Clock Face");
	win.setSize(800,600);
	win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ClockFace canvas = new ClockFace();
	win.add( canvas );
	win.setVisible(true);
	}
}