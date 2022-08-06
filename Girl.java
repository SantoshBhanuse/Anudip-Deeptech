import java.io.*;
import java.lang.String;
interface in1
{
	final int c = 9;
	void display();
}
public class Girl  implements in1
{
	public void display()
	{
		System.out.println("Girl");
	}
	public static void main (String[] args)
	{
		Girl t = new Girl();
		t.display();
		System.out.println(c);
	}
}
