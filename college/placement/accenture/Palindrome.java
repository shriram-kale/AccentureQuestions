package college.placement.accenture;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		boolean value=true;
		char[] ch=str.toCharArray();
		
		for(int i=0,j=ch.length-1;i<ch.length;i++,j--) {
			if(ch[i]==ch[j]) {
				
			}
			else
				value=false;
		}
		
		return value;
	}
	
	public static void main(String[] args) {
		String str="racecar";
		boolean val=isPalindrome(str);
		
		if(val==true)
			System.out.println("palindrome");
		
		else
			System.out.println("not palindrome");
	}
}
