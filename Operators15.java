import java.util.*;
public class Operators15 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(((num/10)%10)+((num/100)%10));
		s.close();
	}
}
