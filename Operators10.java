import java.util.*;
public class Operators10 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		String res = ((year%4==0) && (year%400==0))?"leap Year":"Not a Leap Year";
		System.out.println(res);
		s.close();
	}
	
}
