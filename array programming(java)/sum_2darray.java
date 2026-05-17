package Array;
import java.util.Scanner;
public class sum_2darray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int r=sc.nextInt();
		System.out.println("Enter the column");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		int sum=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
				sum=sum+a[i][j];
			}
		}
		System.out.println("sum="+sum);
		sc.close();
	}

}
