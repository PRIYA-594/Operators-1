import java.util.*;
public class Operators1 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = s.nextInt();
		System.out.println("The last Digit is "+(num%10));
		s.close();
	}
}
