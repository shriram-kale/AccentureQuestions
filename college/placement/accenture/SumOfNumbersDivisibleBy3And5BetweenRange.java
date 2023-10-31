package college.placement.accenture;

public class SumOfNumbersDivisibleBy3And5BetweenRange {
	
	public static int sum(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%15==0) {
				sum=sum+i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int num=sum(100,160);
		System.out.println(num);
	}
}
