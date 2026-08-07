package Array;
import java.util.Scanner;
public class smallest_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int min=ar[0];
		for(int i=1;i<n;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("smallest element is:"+min);
		sc.close();
	}

}
