package Program;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class finish extends JPanel implements ActionListener {
	JPanel mypanel = new JPanel();
	JLabel finish = new JLabel("Congrats!! You're finished.");
	Timer timer = new Timer(15,this);
	private int x=0;
	private int y = 60;
	
	finish()
	{
		setBackground(Color.WHITE);
		timer.start();
		add(finish);
		finish.setFont(new Font("Berlin Sans FB", Font.PLAIN, 20));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x+=1;
		finish.setLocation(x,y);
		repaint();
	}
}
