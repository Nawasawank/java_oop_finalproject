package Math;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CircleArea extends JFrame implements ActionListener {
	Circle circle;
	JPanel infopanel = new JPanel();
	JPanel computepanel = new JPanel();
	JPanel result = new JPanel();
	JLabel radius = new JLabel("Enter radius (cm): ");
	JLabel area = new JLabel("The area of Circle is ");
	JTextField tf = new JTextField(20);
	JButton compute = new JButton("Compute Area");
	
	public CircleArea(String s)
	{
		JFrame frame = new JFrame(s);
		frame.setVisible(true);
		frame.setSize(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		radius.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		area.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		tf.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		compute.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		compute.setBackground(Color.WHITE);
		infopanel.setLayout(new FlowLayout());
		infopanel.add(radius);
		infopanel.add(tf);
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
			double r = Double.parseDouble(tf.getText());
			Circle circle = new Circle(r);
			double area1 = circle.findArea();
			area.setText("The area of Circle which radius is "+circle.radius()+ " cm. is " + String.format("%.2f",area1)+" square cm.");
		
		}
	}
}
