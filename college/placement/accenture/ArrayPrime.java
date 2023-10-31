package college.placement.accenture;

public class ArrayPrime {
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
	
	public static boolean isArrayPrime(int[] arr) {
		boolean value=true;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])==false){
				value=false;
			}
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {2,3,8,7,11,99};
		boolean val=isArrayPrime(arr);
		if(val==true) {
			System.out.println("prime array");
		}
		else
			System.out.println("not prime array");
	}
}
