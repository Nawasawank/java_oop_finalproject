package Program;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Program extends JPanel implements ActionListener {
	JLabel WelcomeLB = new JLabel("WELCOME TO MY WORLD!");
	JLabel nameLB = new JLabel("Enter Your Name: ");
	JLabel idLB = new JLabel("Enter Your Student ID: ");
	JButton drawBT = new JButton("DRAWING");
	JButton bmiBT = new JButton("BMI CAL");
	JButton engBT = new JButton("ENG QUESTIONS");
	JButton guessBT = new JButton("GUESSING GAME");
	JButton areaBT = new JButton("AREA CAL");
	JButton tempBT = new JButton("Temp Convert");
	JTextField nameTF = new JTextField(40);
	JTextField idTF = new JTextField(40);
	JPanel welcome = new JPanel();
	JPanel info = new JPanel();
	JPanel welin = new JPanel();
	JPanel menu = new JPanel();
	String message1=" ";
	String message2=" ";
	String message3=" ";
	int check=0;
	
	public Program(String s)
	{
		JFrame frame = new JFrame(s);
		
		//Set Layout of frame
		frame.setLayout(new GridLayout(3,1));
		frame.add(welin);
		frame.add(this);
		frame.add(menu);
		
		
		//welcome panel
		welcome.setLayout(new FlowLayout());
		WelcomeLB.setFont(new Font("Berlin Sans FB",Font.PLAIN,32));
		welcome.add(WelcomeLB);
		welcome.setBackground(new Color( 216, 202, 255));
		
		//info panel
		info.setLayout(new GridLayout(2,2));
		nameLB.setFont(new Font("Berlin Sans FB",Font.PLAIN,18));
		idLB.setFont(new Font("Berlin Sans FB",Font.PLAIN,18));
		idTF.setFont(new Font("Berlin Sans FB",Font.PLAIN,18));
		nameTF.setFont(new Font("Berlin Sans FB",Font.PLAIN,18));
		info.add(nameLB);
		info.add(nameTF);
		info.add(idLB);
		info.add(idTF);
		info.setBackground(new Color(255, 255, 216));
		
		//welcome+info panel
		welin.setLayout(new GridLayout(2,1));
		welin.add(welcome);
		welin.add(info);
		

		drawBT.setBackground(Color.WHITE);
		bmiBT.setBackground(Color.WHITE);
		engBT.setBackground(Color.WHITE);
		guessBT.setBackground(Color.WHITE);
		areaBT.setBackground(Color.WHITE);
		tempBT.setBackground(Color.WHITE);
		drawBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		bmiBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		engBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		guessBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		areaBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		tempBT.setFont(new Font("Berlin Sans FB",Font.PLAIN,14));
		//menu panel
		menu.setLayout(new FlowLayout());
		drawBT.setPreferredSize(new Dimension(140, 100));
		bmiBT.setPreferredSize(new Dimension(140, 100));
		engBT.setPreferredSize(new Dimension(140, 100));
		guessBT.setPreferredSize(new Dimension(140, 100));
		areaBT.setPreferredSize(new Dimension(140, 100));
		tempBT.setPreferredSize(new Dimension(140, 100));
		menu.add(drawBT);
		menu.add(bmiBT);
		menu.add(engBT);
		menu.add(guessBT);
		menu.add(areaBT);
		menu.add(tempBT);
		menu.setBackground(new Color(255, 255, 216));
		
		this.setBackground(new Color(255, 255, 216));

		drawBT.addActionListener(this);
		bmiBT.addActionListener(this);
		engBT.addActionListener(this);
		guessBT.addActionListener(this);
		areaBT.addActionListener(this);
		nameTF.addActionListener(this);
		idTF.addActionListener(this);
		tempBT.addActionListener(this);
		
		frame.setVisible(true);
		frame.setSize(900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.black);
		Font myfont = new Font("Berlin Sans FB", Font.PLAIN,24);
		g.setFont(myfont);
		g.drawString(message1, 260, 50);
		g.drawString(message2, 340, 80);
		g.drawString(message3, 300, 110);
		g.setColor(new Color(255,255,130));
        g.fillOval(50, 40, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(70, 70, 15, 15);
        g.fillOval(110, 70, 15, 15);
        g.setColor(new Color(255,102,102));
        g.fillArc(75, 90, 50, 30, 180, 180);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==drawBT)
		{
			if (check>=2) {
				new Drawing("Drawing Board");
			}
		}
		if (e.getSource()==bmiBT)
		{
			if (check>=2) {
				new bmi("BMI Calculation");
			}
		}
		if (e.getSource()==engBT)
		{
			if (check>=2)
			{
				new English();
			}
		}
		if (e.getSource()==guessBT)
		{
			if (check>=2) {
				new guessinggame();
			}
		}
		if (e.getSource()==areaBT)
		{
			if (check>=2) {
				new AreaCal("Area Calculations");
			}
		}
		if(e.getSource()==nameTF)
		{
			check+=1;
			message1 = "Hi! "+e.getActionCommand();
		}
		if(e.getSource()==idTF)
		{
			check+=1;
			message2=e.getActionCommand();
			message3="Please Select Menu!";
		}
		if(e.getSource()==tempBT)
		{
			
			if (check>=2) {
			new Temp("Temperature Converter");
			}
		}
		repaint();
	}
}
