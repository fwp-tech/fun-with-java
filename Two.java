import java.util.Scanner;
public class Two
{
	public static void main(String args[])
	{
		double test = 5.00;
		Scanner scan = new Scanner(System.in);
		while (test != 0.00)
		{
			float sum = 0;
			float count = 0;
			test = scan.nextDouble();
			if(test== 0.00) break;
			while(sum < test)
			{
				count+= 1;
				sum += 1/(count+1);
			}
			System.out.println(count + " card(s)");
		}
	}
}


1.00
3.71
0.04
5.19
0.00
