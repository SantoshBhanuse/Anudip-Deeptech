import java.io.*;
import java.lang.String;
interface in1
{
	final int b = 7;
	void display();
}
public class Boy  implements in1
{
	public void display()
	{
		System.out.println("Boy");
	}
	public static void main (String[] args)
	{
		Boy t = new Boy();
		t.display();
		System.out.println(b);
	}
}
