package college.placement.accenture;

public class MaxExponent {
	
	public static int findMaxExponentOf2Element(int a,int b) {
		int max=-1;
		int i=-1;
		for(i=a;i<=b;i++) {
			int limit=5;
			int temp=0;
			
			for(int j=1;j<=limit;j++) {
				temp=(int)Math.pow(2, j);
				if(i==temp) {
					max=temp;
				}
				if(i<temp) {
					break;
				}
				if(i<temp && j==limit) {
					limit=limit+5;
				}
			}
		}
		return i;
		
	}
	
	public static void main(String[] args) {
		int num=findMaxExponentOf2Element(1,33554432);
		System.out.println(num);
	}
}
