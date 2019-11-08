import java.util.Scanner;
class Three
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		while(true){
		int i = scan.nextInt();
		int j = scan.nextInt();
		int max = 1;
		for(int loop = i;loop<j;loop++)
		{
			int num = loop;
			int count = 1;
			while(true)
			{
				if(num ==1) break;
				if(num%2==0) num = num/2;
				else num = num*3+1;
				
				count++;
			}
			if (count>max) max = count;
		}
		System.out.println(i + " " + j + " " + max);
	}}
}

1 10 
100 200
201 210
900 1000
