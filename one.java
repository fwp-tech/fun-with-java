import java.util.Scanner;
public class One
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		float sum = 0;
		for(int i = 0; i<12; i++)
			sum += scan.nextFloat();
		
	System.out.println(sum/12);
	}
}
