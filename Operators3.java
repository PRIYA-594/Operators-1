import java.util.Scanner;
public class Operators3 {
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Decimal Number ");
		int dec = s.nextInt();
		System.out.println("Binary Number ");
		String bin = Integer.toBinaryString(dec);
		System.out.println(bin);
		System.out.println("Octal Number ");
		String octal = Integer.toOctalString(dec);
		System.out.println(octal);
		System.out.println("Binary Number ");
		String hex = Integer.toHexString(dec);
		System.out.println(hex);
		s.close();
	}
}
