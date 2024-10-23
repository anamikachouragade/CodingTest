package codingTest;

import java.util.Scanner;

public class FibonacciSeries {
	public static void printFibonacci(int n) {
            int n1=0,n2=1;
	    
	    System.out.println("Fibonacci series upto "+ n+ " terms:");
	
	     for (int i=1;i<=n;++i) {
	    	 System.out.print(n1 + " ");
	    	 
	    	 //Calculate the next term
	    	 int nextTerm= n1 +n2;
	    	 n1=n2;
	    	 n2= nextTerm;
		
	      }
		
	}
	
	public static  void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    //input number of terms
	    System.out.print("Enter the number of terms: ");
	
	    int n= sc.nextInt();
	
	    printFibonacci(n);//calling the function to print the Fibonacci series
	     
	     sc.close();
	
	}	

}
