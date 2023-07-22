package Program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class bmi extends JPanel implements ActionListener  {
	JPanel panel1_UserInformation = new JPanel();
	JPanel panel2_HeightAndWeight = new JPanel();
	JPanel panel3_BMIResult = new JPanel();
	JLabel text = new JLabel("Enter your Information");
	JLabel height = new JLabel("Your height (cm): ");
	JLabel weight = new JLabel("Your weight (kg): ");
	JTextField height_tf = new JTextField(40);
	JTextField weight_tf = new JTextField(40);
	JButton computeBT = new JButton("Compute BMI");
	JLabel BMI = new JLabel("BMI = ");
	
	public bmi(String s)
	{
		
		JFrame bmi = new JFrame(s);
		panel1_UserInformation.setLayout(new FlowLayout());
		text.setFont(new Font("Berlin Sans FB",Font.PLAIN,20));
		panel1_UserInformation.add(text);
		panel1_UserInformation.setBackground(new Color( 216, 202, 255));
		
		height.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		height_tf.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		weight.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		weight_tf.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		computeBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		BMI.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		computeBT.setBackground(Color.WHITE);
		
		panel2_HeightAndWeight.setLayout(new GridLayout(2,2));
		panel2_HeightAndWeight.add(height);
		panel2_HeightAndWeight.add(height_tf);
		panel2_HeightAndWeight.add(weight);
		panel2_HeightAndWeight.add(weight_tf);
		panel2_HeightAndWeight.setBackground(new Color(255, 255, 216));
		
		panel3_BMIResult.setLayout(new GridLayout(2,1));
		panel3_BMIResult.add(computeBT);
		panel3_BMIResult.add(BMI);
		panel3_BMIResult.setBackground(new Color(255, 255, 216));
		
		bmi.setLayout(new GridLayout(3,1));
		bmi.add(panel1_UserInformation);
		bmi.add(panel2_HeightAndWeight);
		bmi.add(panel3_BMIResult);
		
		
		bmi.setVisible(true);
		bmi.setSize(500,300);
		bmi.setLocationRelativeTo(null);
		bmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		height_tf.addActionListener(this);
		weight_tf.addActionListener(this);
		computeBT.addActionListener(this);
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == computeBT)
			{
				double w = Double.parseDouble(weight_tf.getText());
				double h = Double. parseDouble(height_tf.getText())/100;
				double bmi =  w/Math.pow(h,2);
				
				if (bmi>0 && bmi<=18.5)
				{
					BMI.setText("BMI = " + String.format("%.2f",bmi)+" (Underweight)");
				}
				else if (bmi>18.5 && bmi<=24.9)
				{
					BMI.setText("BMI = " + String.format("%.2f",bmi)+" (Normal)");
				}
				else if (bmi>24.9 && bmi<=29.9)
				{
					BMI.setText("BMI = " + String.format("%.2f",bmi)+" (Overwight)");
				}
				else if (bmi>29.9 && bmi<=34.9)
				{
					BMI.setText("BMI = " + String.format("%.2f",bmi)+" (Obese)");
				}
				else
				{
					BMI.setText("BMI = " + String.format("%.2f",bmi)+" (Extremely Obese)");
				}
			}
		}
	}