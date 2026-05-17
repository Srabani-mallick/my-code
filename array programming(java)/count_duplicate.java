package Array;
import java.util.Scanner;
public class count_duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array:");
		int n=sc.nextInt();
		int[]ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(ar[i]==ar[j]) {
					c++;
					break;
				}
			}
		}
		System.out.println("Duplicate elements="+c);
		sc.close();
	}

}
