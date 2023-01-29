import java.lang.*;
import javax.swing.*;


public class FrameIntro extends JFrame
{
	ImageIcon img;
	JLabel userLabel, passLabel, imgLabel;
	JTextField userTF;
	JPasswordField passPF;
	JButton loginBtn, exitBtn;
	JRadioButton r1, r2, r3;
	JCheckBox c1, c2, c3;
	ButtonGroup bg1;
	JComboBox combo;
	JPanel panel;
	
	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("User Name : ");
		userLabel.setBounds(200, 115, 100, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(330, 115, 100, 30);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(200, 165, 100, 30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(330, 165, 100, 30);
		panel.add(passPF);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(220, 220, 80, 30);
		panel.add(loginBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(350, 220, 80, 30);
		panel.add(exitBtn);
		
		r1 = new JRadioButton("OOP1 G");
		r1.setBounds(450, 50, 80, 20);
		panel.add(r1);
		
		r2 = new JRadioButton("OOP1 C");
		r2.setBounds(450, 80, 80, 20);
		panel.add(r2);
		
		r3 = new JRadioButton("OOP2 I");
		r3.setBounds(450, 110, 80, 20);
		panel.add(r3);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		bg1.add(r3);	
		
		c1 = new JCheckBox("FST");
		c1.setBounds(550, 50, 80, 20);
		panel.add(c1);
		
		c2 = new JCheckBox("FE");
		c2.setBounds(550, 80, 80, 20);
		panel.add(c2);
		
		c3 = new JCheckBox("FBA");
		c3.setBounds(550, 110, 80, 20);
		panel.add(c3);
		
		String item[] = {"CSE", "CS", "CSSE", "CIS", "SE", "CoE"};
		combo = new JComboBox(item);
		combo.setBounds(650, 50, 100, 30);
		panel.add(combo);
		
		img = new ImageIcon("oop1c.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(450, 150, 200, 112);
		panel.add(imgLabel);
		
		
		this.add(panel);
	}
	
	
}