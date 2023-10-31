package college.placement.accenture;

public class BitwiseOperator {
	
	public static int calculate(String str) {
		char[] charArray=str.toCharArray();

		int res=-1;
		char ch=' ';
		int a=-1;
		int b=-1;
		int incr=1;

		for(int i=0;i<(charArray.length/2);i++) {
			
			if(i==0) {
				res=Integer.parseInt(String.valueOf(charArray[i]));
				ch=charArray[i+1];
				b=Integer.parseInt(String.valueOf(charArray[i+2]));
			}
			else {
				res=(incr*2+1);
				ch=charArray[res];
				
			}
			if(ch==a) {
				res=res&b;
			}
			else if(ch==b) {
				res=res|b;
			}
			else {
				res=res^b;
			}
		}
		
		
		
		return res;
	}
	
	public static void main(String[] args) {
		String str = "0c1a1b1c1c1b0a0";
		int res=calculate(str);
		System.out.println(res);
	}
}
