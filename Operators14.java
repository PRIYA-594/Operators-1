import java.util.*;
public class Operators14 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String n = Integer.toString(num);
		int len = n.length();
		int c = 1;
		while(--len!=0)
		{
			c*=10;
		}
		System.out.println((num/c)+(num%10));
		s.close();
	}
}
