import java.util.*;
public class Operators8 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		int max = (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
		System.out.println(max);
		s.close();
	}
}
