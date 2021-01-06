import java.util.Scanner;

public class ComputeFibonacci {

	public static void main(String[] args) throws Exception {
	  
		int index = 0;
		boolean continueInput = true;
	
	    Scanner input = new Scanner(System.in);
	    
	    do {
	    	try {
	    		System.out.print("Enter a non-zero integer for Fibonacci series: ");
	    	    index = input.nextInt();
	    	    
	    	    if (index < 0) {
	    	    	throw new Exception("Invalid input. Enter the number again.");
	    	    }
	    	    
	    	    continueInput = false;
	    	}
	    	catch (Exception e) {
	    		System.out.println("Invalid input. Enter the number again.");
	    	}
	    } while (continueInput);
	    
	    for (int i = 0; i < index; i++) {
	    	System.out.println(fib(i));
	    }
	    
	    input.close();
	  }

	  public static long fib(long index) {
		  if (index == 0) {
			  return 0;
		  }
		  else if (index == 1) {
			  return 1;
		  }
		  else {
			  return fib(index - 1) + fib(index - 2);
		  }
	  }
}