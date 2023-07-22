package Math;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class CylinderArea extends JFrame implements ActionListener {
	Circle circle;
	JPanel infopanel = new JPanel();
	JPanel computepanel = new JPanel();
	JPanel result = new JPanel();
	JLabel radius = new JLabel("Enter radius (cm): ");
	JLabel height = new JLabel("Enter height (cm): ");
	JLabel area = new JLabel("The area of Cylinder is ");
	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);
	JButton compute = new JButton("Compute Area");
	
	public CylinderArea(String s)
	{
		JFrame frame = new JFrame(s);
		frame.setVisible(true);
		frame.setSize(650,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radius.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		height.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		area.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		tf1.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		tf2.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		compute.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		compute.setBackground(Color.WHITE);
		infopanel.setLayout(new GridLayout(2,2));
		infopanel.add(radius);
		infopanel.add(tf1);
		infopanel.add(height);
		infopanel.add(tf2);
		infopanel.setBackground(new Color( 216, 202, 255));
		
		computepanel.setLayout(new FlowLayout());
		computepanel.add(compute);
		computepanel.setBackground(new Color(255, 255, 216));
		
		result.setLayout(new BorderLayout());
		result.add(area,BorderLayout.WEST);
		result.setBackground(new Color(255, 255, 216));
		
		frame.setLayout(new GridLayout(3,1));
		frame.add(infopanel);
		frame.add(computepanel);
		frame.add(result);
		frame.setLocationRelativeTo(null);
		
		compute.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == compute)
		{
			double r = Double.parseDouble(tf1.getText());
			double h = Double.parseDouble(tf2.getText());
			Circle cylinder = new Cylinder(r,h);
			double area1 = cylinder.findArea();
			area.setText("The area of Cylinder which radius is "+cylinder.radius()+" cm. "+"and height is "+((Cylinder) cylinder).height() +" cm. is " + String.format("%.2f",area1)+" square cm.");
		}
	}
}