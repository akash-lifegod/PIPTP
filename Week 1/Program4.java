package Week1;

public class Program4
{
	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(factorial(n));
		
		System.out.println(function(n));
		System.out.println(sumOfDigits(n));
		System.out.println(pseudoA(4, 3));
		System.out.println(pseudoB(2, 7));
		
		pattern(4);
		
	}
	
	private static int factorial(int n ){
	    if(n==0) return 1;
	    return n * factorial(n-1);
	}
	
	private static int function(int n){
	    if(n<=1) return n;
	    else if(n%2==0){
	        return n + function(n/2);
	    } else {
	        return function((n+1)/2) + function((n-1)/2);
	    }
	}
	
	private static int sumOfDigits(int n){
	    if(n<=0) return 0;
	    return n%10 + sumOfDigits(n/10);
	}
	
	private static int pseudoA(int x, int y){
	    if(y==0 || y==x){
	        return 1;
	    }
	    return pseudoA(x-1, y) + pseudoA(x-1, y-1);
	}
	
	
	private static int pseudoB(int x, int y){
	    if(x==y) return x*y;
	    return pseudoB(x, (x+y)/2) + pseudoB(((x+y)/2) + 1, y);
	}
	
	private static void pattern(int n){
	  if(n==0) return;
	  
	  pattern(n-1);
	  System.out.print(n+" ");
	  pattern(n-1);
	}
}