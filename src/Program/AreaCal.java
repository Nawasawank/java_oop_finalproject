package Program;

import java.awt.*;
import javax.swing.*;
import Math.CircleArea;
import Math.CylinderArea;
import java.awt.event.*;

public class AreaCal extends JFrame implements ActionListener {
	JLabel text = new JLabel("Area Calculation");
	JButton circlebt = new JButton("CIRCLE");
	JButton cylinderbt = new JButton("CYLINDER");
	JPanel buttonpanel = new JPanel();
	JPanel textpanel = new JPanel();
	
	public AreaCal(String s)
	{
		JFrame area = new JFrame(s);
		text.setFont(new Font("Berlin Sans FB",Font.PLAIN,30));
		circlebt.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		cylinderbt.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		circlebt.setBackground(Color.WHITE);
		cylinderbt.setBackground(Color.WHITE);
		area.setLayout(new GridLayout(2,1));
		area.add(textpanel);
		area.add(buttonpanel);
		buttonpanel.setBackground(new Color(255, 255, 216));
		
		textpanel.setLayout(new FlowLayout());
		textpanel.add(text);
		textpanel.setBackground(new Color( 216, 202, 255));
		circlebt.setPreferredSize(new Dimension(140, 100));
		cylinderbt.setPreferredSize(new Dimension(140, 100));
		buttonpanel.add(circlebt);
		buttonpanel.add(cylinderbt);
		
		circlebt.addActionListener(this);
		cylinderbt.addActionListener(this);
		
		area.setVisible(true);
		area.setSize(600,300);
		area.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==circlebt)
		{
			new CircleArea("Circle");
		}
		if(e.getSource()==cylinderbt)
		{
			new CylinderArea("Cylinder");
		}
	}
}
