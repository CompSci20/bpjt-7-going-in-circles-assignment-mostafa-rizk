import java.io.*;
import java.util.*;
public class RadiusOfCircle
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.print("What is the area? ");
		double area = kbReader.nextDouble();
		double radius = Math.sqrt(area / Math.PI);
		System.out.println("Radius of your circle is " + radius);
	}
}
