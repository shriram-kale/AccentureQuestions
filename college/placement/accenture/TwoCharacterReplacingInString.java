package college.placement.accenture;

public class TwoCharacterReplacingInString {
	public static String replace(String str, char ch1, char ch2) {
		if(str==null) {
			return null;
		}
		String newstr = str;
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			if (str.charAt(i) == ch1) {
					newstr = newstr.substring(0, i)+ch2+newstr.substring(i+1);

				
			} else if (str.charAt(i) == ch2) {
				newstr = newstr.substring(0, i)+ch1+newstr.substring(i+1);
			}
		}
		return newstr;
	}

	public static void main(String[] args) {
		String str = "apple";
		String newStr = replace(str, 'a', 'p');
		System.out.println(newStr);
		
		String s1=str.substring(0,0);
		System.out.println(s1);
	}
}
