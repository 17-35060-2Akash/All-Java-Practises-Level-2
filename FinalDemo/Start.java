import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		FinalDemo fd1 = new FinalDemo();
		//fd1.setA(10);
		System.out.println(fd1.getA());
		
		FinalDemo fd2 = new FinalDemo(20);
		System.out.println(fd2.getA());
		
		MyClass mc = new MyClass();
		mc.show();
	}
}



