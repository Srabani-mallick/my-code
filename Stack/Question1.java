import java.util.Scanner;
public class Question1 {
	public static int palindrom(int n) {
		if(n<0) {
			return 0;
		}
		//int temp=n; 
		int rev=0;
		while (n>0){
         int d=n%10;
         rev=rev*10+d;
         n=n/10;
		}
		return rev;
		}
   public static void main(String[]args) {
       Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number:");
       int n=sc.nextInt();
       int res=palindrom(n);
       if(res==n) {
   			System.out.println(n+" is palindorm");
       }
       else {
    	   System.out.println(n+" is not palindorm");
       }
     sc.close();
     }
  }
