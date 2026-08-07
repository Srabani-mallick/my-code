package LINKLIST;
import java.util.*;
class link{
	int data;
	link next;
	
}
public class linklist_operations {
	static link start=null;
	public static void create(link node) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data:");
		node.data=sc.nextInt();
		node.next=null;
		System.out.println("Enter 0 tp exit and other no to continue:");
		int x=sc.nextInt();
		while(x!=0) {
			link curr=new link();
			System.out.println("Enter 0 tp exit and other no to continue:");
			curr.data=sc.nextInt();
			curr.next=null;
			node.next=curr;
			System.out.println("Enter 0 tp exit and other no to continue:");
			x=sc.nextInt();
			sc.close();
		}
	}
	public static void insert(link node) {
		Scanner sc=new Scanner(System.in);
		link temp=new link();
		link prev=new link();
		System.out.println("Enter the location:");
		int loc=sc.nextInt();
		if(loc==1) {
    	System.out.println("Enter the data:");
    	temp.data=sc.nextInt();
    	temp.next=node;
    	start=temp;
    }
		else {
			int i=1;
			while(i<loc) {
				prev=node;
				node=node.next;
				i++;
			}
			prev.next=temp;
			temp.next=node;
			sc.close();
		}	
  
	}
	public static void delete(link node) {
		Scanner sc=new Scanner(System.in);
		link prev=new link();
		System.out.println("Enter the location:");
		int loc=sc.nextInt();
		if(loc==1) {
    	start=node.next;
    }
		else {
			int i=1;
			while(i<loc) {
				prev=node;
				node=node.next;
				i++;
				node=node.next;
			}
			prev.next=node.next;
			sc.close();
		}	
  
	}
	public static void display(link node) {
		while(node!=null) {
			System.out.println(node.data+"--->");
			node=node.next;
		}
	}
	public static void average(link node) {
		int sum=0;
		int c=0;
		while(node!=null) {
			sum=sum+node.data;
			c++;
			node=node.next;
		}
		double avg=(double)sum/c;
		System.out.println("sum="+sum+"\nAverage="+avg);
	}
	public static void sort(link node) {
		link ptr1=new link();
		link ptr2=new link();
		for(ptr1=node;ptr1.next!=null;ptr1=ptr1.next) {
			for(ptr2=ptr1.next;ptr2.next!=null;ptr2=ptr2.next) {
				if(ptr1.data>ptr2.data) {
					int t=ptr1.data;
					ptr1.data=ptr2.data;
					ptr2.data=t;
				}
			}

		}
	}
	public static void search(link node,int key) {
		int f=0;
		while(node!=null) {
			if(node.data==key) {
				f=1;
				break;
			}
			node=node.next;
		}
		if(f==1) {
			System.out.println("Searching is successfull");
		}
		else {
			System.out.println("Searching is unsuccessfull");
		}
	}
	public static void printmid(link node) {
		link slow=node;
		link fast=node;
		if(node==null) {
			return;
		}
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println(slow.data);

	}
	public static void main(String[] args) {
		link node=new link();
		start=node;
		
	          
	

}
	}
