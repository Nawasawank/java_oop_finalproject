package Program;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Temp extends JFrame implements ItemListener {
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JButton compute = new JButton("Compute");
	JLabel Input = new JLabel("Input (Celcius)");
	JTextField Blank = new JTextField(15);
	JRadioButton k = new JRadioButton("Kelvin");
	JRadioButton f = new JRadioButton("Farenheit");
	JLabel result = new JLabel("Result = ");
	double K;
	
	Temp(String s)
	{
		JFrame frame = new JFrame(s);
		compute.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		compute.setBackground(Color.white);
		Input.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		Blank.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		k.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		k.setBackground(new Color(255, 255, 216));
		f.setBackground(new Color(255, 255, 216));
		f.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		result.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		//decorate p1
		p1.setLayout(new FlowLayout());
		p1.add(Input);
		p1.add(Blank);
		p1.setBackground(new Color( 216, 202, 255));
		
		//decorate p3
		p2.setLayout(new FlowLayout());
		p2.add(k);
		p2.add(f);
		p2.setBackground(new Color(255, 255, 216));
		//decorate p4
		p3.setLayout(new FlowLayout());
		p3.add(result);
		p3.setBackground(new Color(255, 255, 216));

						
		//decorate frame
		frame.setLayout(new GridLayout(3,1));
		frame.setSize(350,280);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.setLocationRelativeTo(null);
		
		k.addItemListener(this);
		f.addItemListener(this);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==k)
		{
			double c = Double.parseDouble(Blank.getText());
			double K = c + 273.15;
			result.setText("Result = " + String.format("%.2f",K)+" K");
			f.setSelected(false);
		}
		if(e.getSource()==f)
		{
			double c = Double.parseDouble(Blank.getText());
			double F = (c * 9/5) + 32;
			result.setText("Result = " + String.format("%.2f",F)+" F");
			k.setSelected(false);
		}
	}

}

