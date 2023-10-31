package college.placement.accenture;

public class Fibonacci {
	
	public static void printFibonacci(int n) {
		System.out.print(0);
		System.out.print(" ");
		System.out.println(1);
		
		int incr=2;
		
		int b=1;
		int res=0;
		while(incr<=n) {
			res=res+b;
			b=res;
			System.out.print(res+" ");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		printFibonacci(n);
	}
}
