package college.placement.accenture;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		boolean val=true;
		if(num==1) {
			val=false;
		}
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				val=false;
				break;
			}
		}
		return val;
		
		
	}
	
	public static void main(String[] args) {
		boolean val=isPrime(13);
		if(val==true)  
			System.out.println("prime");
		else 
			System.out.println("not prime");
	}
}
