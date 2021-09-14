package geeksterAssingment;

import java.util.Scanner;

public class SumOFNNumbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum=n%10+sum;
			n=n/10;
		}

		System.out.println(sum);
	}

}
