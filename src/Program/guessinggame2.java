package Program;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.Random;
	
	public class guessinggame2 extends JPanel implements ActionListener {
	JTextField inputTF = new JTextField();
	JButton reset = new JButton("reset");
	JPanel resetpanel = new JPanel();
	Timer timer = new Timer(1000,this);
	int remainingTime = 60;
	int userGuess=-1;
	int AI=-2;
	JFrame guess = new JFrame("Guessing Number Game");
	public guessinggame2()
	{
		reset.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		reset.setBackground(Color.WHITE);
		AI = (new Random().nextInt(100));
		resetpanel.setLayout(new FlowLayout());
		resetpanel.setBackground(new Color(255, 255, 216));
		resetpanel.add(reset);
		timer.start();
		
		reset.addActionListener(this);
		inputTF.addActionListener(this);
		inputTF.setFont(new Font("Berlin Sans FB",Font.PLAIN,40));
		
		guess.setLayout(new BorderLayout());
		this.setBackground(new Color(255, 255, 216));
		
		guess.add(this,BorderLayout.CENTER);
		guess.add(inputTF,BorderLayout.SOUTH);
		guess.add(resetpanel,BorderLayout.EAST);
		
		guess.setVisible(true);
		guess.setSize(700,300);
		guess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guess.setLocationRelativeTo(null);
	}
	
	
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Berlin Sans FB",Font.PLAIN,30));
		g.drawString("time: " + remainingTime,0,185);
		
		if (userGuess==-1)
		{
			g.drawString("Guess my number ", 190,100);
		}
		else if(remainingTime>0)
		{
			if(userGuess==AI)
			{
				g.drawString("Perfect!! The answer is "+ userGuess,190,100);
				timer.stop();
			}
			else if(userGuess<AI)
				g.drawString("Too low",180,100);
			else if (userGuess>AI)
				g.drawString("Too high",180,100);
		}
		else
		{
			g.drawString("Sorry You lose",180,100);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inputTF)
		{ 
				userGuess = Integer.parseInt(inputTF.getText());
				repaint();
		}
		if(e.getSource()==reset)
		{
			guess.dispose();
			new guessinggame();
		}
		else
		{
			remainingTime--;
			repaint();
			
			if(remainingTime<=0)
			{
				timer.stop();
			}
		}
	}
}