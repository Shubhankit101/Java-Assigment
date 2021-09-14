package geeksterAssingment;


import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Size");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		int []a=new int[n];
		System.out.println("Enter Elements");
		for(int i=0;n>i;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;n>i;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("largest element is "+ max);
	}

}
