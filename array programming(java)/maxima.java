package Array;
import java.util.Scanner;
public class maxima {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
	}
	for(int i=0;i<ar.length;i++) {
		if((i==0 || ar[i]>ar[i-1])&&(i==ar.length-1 || ar[i]>ar[i+1])) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	sc.close();
	}
}
