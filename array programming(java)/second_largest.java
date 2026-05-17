package Array;
import java.util.Scanner;
public class second_largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
	}
		int l1=ar[0];
		int l2=ar[1];
		if(ar[0]>ar[1]) {
			l1=ar[0];
			l2=ar[1];
		}
		else {
			l1=ar[1];
			l2=ar[0];
		}
		for(int i=2;i<n;i++) {
			if(ar[i]>l1) {
				l2=l1;
				l1=ar[i];
			}
			else if((ar[i]>l2)&&(ar[i]!=l1)){
				l2=ar[i];
			}
		}
		System.out.println("second largest:"+l2);
		sc.close();
	}
}
