import java.lang.*;
public class FinalDemo
{
	private final int a;
	
	public FinalDemo(){this.a = 100;}
	public FinalDemo(int a){
		this.a = a;
	}
	//public void setA(int a){this.a = a;}
	public int getA(){return a;}
	
	public final void show()
	{
		System.out.println("FinalDemo Show");
	}
}