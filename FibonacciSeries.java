package codingTest;

import java.util.Scanner;

public class FibonacciSeries {
	public static  void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	
	    System.out.print("Enter the number of terms: ");
	
	    int n= sc.nextInt();
	
	    int n1=0,n2=1;
	    
	    System.out.println("Fibonacci series upto "+ n+ " terms:");
	
	     for (int i=1;i<=n;++i) {
	    	 System.out.print(n1 + " ");
	    	 
	    	 int nextTerm= n1 +n2;
	    	 n1=n2;
	    	 n2= nextTerm;
		
	      }
	     
	     sc.close();
	
	}	

}
