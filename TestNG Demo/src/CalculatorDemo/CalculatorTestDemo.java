package CalculatorDemo;

import org.testng.annotations.Test;

public class CalculatorTestDemo {
  
	int a=10, b=11;
	int s=0;
	@Test
	   public void addTest1() {
	      s=a+b;
	      if(s==21){
	    	  System.out.println("Yes,Adding Testing done");
	      }
		}
	
	/*
	@Test
	   public void addTest2() {
	      s=a+b;
	      if(s==11){
	    	  System.out.println("No, There is an error");
	      }
		}
	*/
	
	/*
	@Test
	   public void SubTest1() {
	      s=b-a;
	      if(s==1){
	    	  System.out.println("Yes,Subtracting Testing done");
	      }
		}
	*/
	
	/*
	@Test
	   public void MulTest1() {
	      s=a*b;
	      if(s==110){
	    	  System.out.println("Yes,Multiplication Testing done");
	      }
		}
	*/
	
	/*
	@Test
	   public void DivTest1() {
	      s=b/a;
	      if(s==1){
	    	  System.out.println("Yes,Division Testing done");
	      }
		}
	*/
	
	/*
	@Test
	public void checkEO() {
		int num;
		num=20;
		if (num % 2 == 0)
			System.out.println("So, the number is even");
		else
			System.out.println("So, the number is odd");
	}
	*/
	
	/*
	@Test
	public void checkEO1() {
	
		 int n = 20, n1 = 0, n2 = 1;
	        System.out.print("First " + n + " terms: ");

	        for (int i = 1; i <= n; ++i)
	        {
	            System.out.print(n1 + " + ");

	            int sum = n1 + n2;
	            n1 = n2;
	            n2 = sum;
	        }
	}
	*/
	
	
	
}

