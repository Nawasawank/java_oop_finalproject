package Program;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawing extends JPanel implements ItemListener,MouseListener,MouseMotionListener {
	int x=0;
	int y=0;
	int r=20;
	boolean leftClick;
	JRadioButton red = new JRadioButton("RED");
	JRadioButton blue = new JRadioButton("BLUE");
	JRadioButton black = new JRadioButton("BLACK");
	JRadioButton green = new JRadioButton("GREEN");
	JRadioButton orange = new JRadioButton("ORANGE");
	JPanel colormenu = new JPanel();
	Color linecolor;
	
	public Drawing(String s)
	{
		JFrame drawingframe = new JFrame(s);
		colormenu.setLayout(new GridLayout(5,1));
		black.setBackground(new Color(255, 255, 216));
		blue.setBackground(new Color(255, 255, 216));
		red.setBackground(new Color(255, 255, 216));
		green.setBackground(new Color(255, 255, 216));
		orange.setBackground(new Color(255, 255, 216));
		colormenu.add(black);
		colormenu.add(blue);
		colormenu.add(red);
		colormenu.add(green);
		colormenu.add(orange);
		red.setFont(new Font("Berlin Sans FB",Font.PLAIN,12));
		black.setFont(new Font("Berlin Sans FB",Font.PLAIN,12));
		blue.setFont(new Font("Berlin Sans FB",Font.PLAIN,12));
		green.setFont(new Font("Berlin Sans FB",Font.PLAIN,12));
		orange.setFont(new Font("Berlin Sans FB",Font.PLAIN,12));
		drawingframe.setLayout(new BorderLayout());
		drawingframe.add(colormenu,BorderLayout.EAST);
		drawingframe.add(this,BorderLayout.CENTER);
		
		drawingframe.setVisible(true);
		drawingframe.setSize(800,400);
		drawingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawingframe.setLocationRelativeTo(null);
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		black.addItemListener(this);
		blue.addItemListener(this);
		red.addItemListener(this);
		green.addItemListener(this);
		orange.addItemListener(this);
		
		this.setBackground(Color.WHITE);
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if(leftClick) {

			g.setColor(linecolor);
			g.drawLine(x,y,e.getX(),e.getY());}
		else
		{
			g.setColor(getBackground());
			g.fillOval(e.getX()-r, e.getY()-r, 2*r, 2*r);
		}
		
		x=e.getX();
		y=e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e) {

		
	}
	@Override
	public void mouseClicked(MouseEvent e) {

		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		if (e.getButton()==MouseEvent.BUTTON1)
		{
			leftClick = true;
		}
		else
		{
			leftClick = false;
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {

		
	}
	@Override
	public void mouseEntered(MouseEvent e) {

	}
	@Override
	public void mouseExited(MouseEvent e) {

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource()==black)
		{
			linecolor=Color.BLACK;
			red.setSelected(false);
			blue.setSelected(false);
			orange.setSelected(false);
			green.setSelected(false);
		}
		if (e.getSource()==blue)
		{
			linecolor=Color.BLUE;
			red.setSelected(false);
			black.setSelected(false);
			orange.setSelected(false);
			green.setSelected(false);
		}
		if (e.getSource()==red)
		{
			linecolor=Color.RED;
			black.setSelected(false);
			blue.setSelected(false);
			orange.setSelected(false);
			green.setSelected(false);
		}
		if (e.getSource()==orange)
		{
			linecolor=Color.ORANGE;
			red.setSelected(false);
			blue.setSelected(false);
			black.setSelected(false);
			green.setSelected(false);
		}
		if (e.getSource()==green)
		{
			linecolor=Color.GREEN;
			red.setSelected(false);
			blue.setSelected(false);
			orange.setSelected(false);
			black.setSelected(false);
		}

	}
}
