package Array;
import java.util.Scanner;
public class matrix_maltiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		int r=sc.nextInt();
		System.out.println("Enter the column");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int[][] b=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		int mul[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				mul[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("The multiplication of two matrix of same size is:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(mul[i][j]+",");
			}
			System.out.println();
			sc.close();
	}

	}

}
