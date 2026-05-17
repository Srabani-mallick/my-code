package Array;
import java.util.Scanner;
public class Middle_element_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size 1st array:");
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size 2nd array:");
		int m=sc.nextInt();
		int[]b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}

	}

}
