import java.util.Scanner;
import java.util.stream.*;
class Four
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		while(true){
			int stud = scan.nextInt();
			if(stud==0) break;
			float[] expense = new float[stud];
			float sum =0;
			for(int i=0;i<stud;i++)	
			{
				expense[i] = scan.nextFloat();
				sum += expense[i];
			}
			sum /= stud;
			float cost = 0;
			for(int i=0;i<stud;i++) 
				if(expense[i] > sum) cost += expense[i] - sum;
			System.out.println("INR " + cost);
		}
		
	}
}


3
10.00
20.00
30.00
4
15.00
15.01
3.00
3.01
0
