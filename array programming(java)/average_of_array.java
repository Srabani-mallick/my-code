package Array;
import java.util.Scanner;
public class average_of_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		double avg=(double)sum/n;
		System.out.println("Average is:"+avg);
		sc.close();
	}

}
