package Array;
import java.util.Scanner;
public class unique_element {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the array:");
	        int n=sc.nextInt();
	        int arr[]=new int[n];

	        for(int i=0;i<n;i++)
	            arr[i]=sc.nextInt();
	        for(int i=0;i<n;i++){
	            int count=0;
	            for(int j=0;j<n;j++){
	                if(arr[i]==arr[j]) {
	                	count++;
	                }
	            }
	            if(count==1)
	                System.out.print(arr[i]+" ");
	        }
	   
	        sc.close();
	    }
	}
