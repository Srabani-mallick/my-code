package Array;
import java.util.Scanner;
public class first_last_swaping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array:");
		int n=sc.nextInt();
		int[]ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int i=0;
		int j=n-1;
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
		for(int k=0;k<n;k++) {
			System.out.print(ar[k]+" ");
		}
		System.out.println();
		sc.close();
	}
}

