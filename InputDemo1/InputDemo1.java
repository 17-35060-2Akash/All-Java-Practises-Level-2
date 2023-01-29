import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class InputDemo1 extends JFrame
{
	JFrame frame;
	JLabel userLabel;
	JPanel panel;
	public InputDemo1()
	{
		frame=new JFrame();
		this.setLocationRelativeTo(null);
		this.setSize(600,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		//setLayout(null);
		setBackground(Color.YELLOW);
		
		userLabel=new JLabel("User Name: ");
		setBounds(100,100,100,50);
		panel.add(userLabel);
		
		
	}
}