package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		System.out.println("Enter n:");
		int num = in.nextInt();
		int[] n = {2,3,4,5,6,7,8,9,10};
		boolean [] prime = new boolean [num+1];
		int i = 2;

		for (i=2;i<prime.length;i++) {
			prime[i]= true; 
		}

		for(int j=0;j<n.length/1;j++) {
			prime[i]= false;
			if (prime[i]= true)
			{
				System.out.println(i);
			}
		}
	}
}

