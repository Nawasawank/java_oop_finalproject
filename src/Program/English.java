package Program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class English extends JPanel implements ItemListener,ActionListener {
	JRadioButton b1 = new JRadioButton("a. gathered");
	JRadioButton b2 = new JRadioButton("b. wrapped");
	JRadioButton b3 = new JRadioButton("c. launched");
	JRadioButton b4 = new JRadioButton("d. injected");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JLabel l1 = new JLabel("The clothing store H&M has recently ___ a new\r\n"
			+ "campaign targeting teenage girls.");
	String message = "";
	JButton next = new JButton("Next");
	JPanel p3 = new JPanel();
	JFrame frame = new JFrame("English Question1");
	int check = 0;
	
	English(){
		l1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		p1.setBackground(new Color( 216, 202, 255));
		p2.setBackground(Color.white);
		p2.setLayout(new GridLayout(1,4));
		b1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		b1.setBackground(Color.white);
		b2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		b2.setBackground(Color.white);
		b3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		b3.setBackground(Color.white);
		b4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
		b4.setBackground(Color.white);
		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.setBackground(new Color(255, 255, 216));
		p3.add(next);
		p3.setBackground(new Color(255, 255, 216));
		b1.addItemListener(this);
		b2.addItemListener(this);
		b3.addItemListener(this);
		b4.addItemListener(this);
		next.addActionListener(this);
		next.setBackground(Color.WHITE);
		next.setFont(new Font("Berlin Sans FB",Font.PLAIN,16));
		this.setBackground(new Color(255, 255, 216));
		frame.setLayout(new GridLayout(4,1));
		frame.add(p1);
		frame.add(p2);
		frame.add(this);
		frame.add(p3);
		frame.setSize(800,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
	
	public void itemStateChanged(ItemEvent e) {
		Graphics g= getGraphics();	
		Font myfont = new Font("Berlin Sans FB", Font.PLAIN,18);
		g.setFont(myfont);
		if(e.getSource() == b1 && e.getStateChange() == 1) {
			b1.setSelected(true);
			b2.setSelected(false);
			b3.setSelected(false);
			b4.setSelected(false);
			super.paintComponent(g);
			message = "Your answer is incorrect!";
			g.drawString(message, 300, 40);
			check=0;
		}  
		else if (e.getSource() == b2 && e.getStateChange() == 1) {
			b1.setSelected(false);
			b2.setSelected(true);
			b3.setSelected(false);
			b4.setSelected(false);
			message = "Your answer is incorrect!";
			super.paintComponent(g);
			g.drawString(message, 300, 40);
			check=0;
		} 
		else if (e.getSource() == b3 && e.getStateChange() == 1) {
			b1.setSelected(false);
			b2.setSelected(false);
			b3.setSelected(true);
			b4.setSelected(false);
			message = "Your answer is correct!";
			super.paintComponent(g);
			g.drawString(message, 300, 40);
			check=1;
		}
		else if (e.getSource() == b4 && e.getStateChange() == 1){
			b1.setSelected(false);
			b2.setSelected(false);
			b3.setSelected(false);
			b4.setSelected(true);
			message = "Your answer is incorrect!";
			super.paintComponent(g);
			g.drawString(message, 300, 40);
			check=0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (check>0)
			{
				if (e.getSource()==next)
					{
						frame.dispose();
						new English2();
		}
	}
}

}
