import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameIntro extends JFrame implements MouseListener, ActionListener
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
	Color myColor;
	Font myFont;
	
	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color(200, 230, 140);
		myFont = new Font("Cambria", Font.ITALIC | Font.BOLD, 28);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		userLabel = new JLabel("User Name : ");
		userLabel.setBounds(160, 115, 160, 30);
		userLabel.setBackground(Color.YELLOW);
		userLabel.setFont(myFont);
		userLabel.setOpaque(true);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(330, 115, 100, 30);
		userTF.setBackground(Color.CYAN);
		panel.add(userTF);
		
		passLabel = new JLabel("Password : ");
		passLabel.setBounds(200, 165, 100, 30);
		passLabel.setForeground(Color.BLUE);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(330, 165, 100, 30);
		panel.add(passPF);
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(220, 220, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		exitBtn = new JButton("Exit");
		exitBtn.setBounds(350, 220, 80, 30);
		exitBtn.setBackground(Color.RED);
		exitBtn.addMouseListener(this);
		exitBtn.addActionListener(this);
		panel.add(exitBtn);
		
		r1 = new JRadioButton("OOP1 G");
		r1.setBounds(450, 50, 80, 20);
		r1.setBackground(Color.ORANGE);
		panel.add(r1);
		
		r2 = new JRadioButton("OOP1 C");
		r2.setBounds(450, 80, 80, 20);
		r2.setOpaque(false);
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
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.BLUE);
			exitBtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitBtn)
		{
			exitBtn.setBackground(Color.RED);
			exitBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(loginBtn.getText().equals(command))
		{
			
			String s1 = userTF.getText();
			String s2 = passPF.getText();
			String s3="", s4="";
			
			if(r1.isSelected())
			{
				s3 = r1.getText();
			}
			else if(r2.isSelected())
			{
				s3 = r2.getText();
			}
			else if(r3.isSelected())
			{
				s3 = r3.getText();
			}
			else
			{
				
			}
			
			if(c1.isSelected())
			{
				s4 = c1.getText();
			}
			else if(c2.isSelected())
			{
				s4 = c2.getText();
			}
			else if(c3.isSelected())
			{
				s4 = c3.getText();
			}
			else
			{
				
			}
			
			String s5 = combo.getSelectedItem().toString();
			
			//JOptionPane.showMessageDialog(this, "Hello");
			SecondFrame sf = new SecondFrame(s1,s2,s3,s4,s5, this);
			sf.setVisible(true);
			this.setVisible(false);
		}
		else if(exitBtn.getText().equals(command))
		{
			System.exit(0);
		}
		else
		{
			
		}
	}
	
}