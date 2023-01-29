import java.lang.*;
import java.util.*;

public class InputDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i, j;
		double d;
		char c;
		String s1, s2;
		
		System.out.print("PLease Enter an String: ");
		s1 = sc.nextLine();
		System.out.println("You have enterd: "+s1);
		
		System.out.print("PLease Enter an String: ");
		s2 = sc.nextLine();
		System.out.println("You have enterd: "+s2);
		
		
		System.out.print("PLease Enter an Integer: ");
		i = sc.nextInt();
		System.out.println("You have enterd: "+i);
		
		System.out.print("PLease Enter an Integer: ");
		j = sc.nextInt();
		System.out.println("You have enterd: "+j);
		
		System.out.print("PLease Enter a Double: ");
		d = sc.nextDouble();
		System.out.println("You have enterd: "+d);
		
		System.out.println("Sum: "+(i+j));
		
		System.out.print("Please Enter a Character: ");
		c = sc.next().charAt(0);
		System.out.println("You have enterd: "+c);
		
		
		
	

		
	}
}