import java.util.Scanner;
public class question1recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    if(a*(a+1)==n) {
    	System.out.println("yes");
    }
    else {
    	System.out.println("no");
    }
	}

}
