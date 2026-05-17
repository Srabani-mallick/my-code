package Array;

import java.util.Scanner;

public class first_last_equal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array:");
		int n=sc.nextInt();
		int[]ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		if(ar[0]==ar[n-1]) {
			System.out.println("true");
		}
		else {		
		System.out.println("false");
		}
		sc.close();
	}

}
