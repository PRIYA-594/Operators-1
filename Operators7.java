import java.util.*;
public class Operators7 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		String res = ((num&1)==1)?("Odd"):("Even");
		System.out.println(res);
		s.close();
	}
}
