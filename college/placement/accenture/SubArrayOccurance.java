package college.placement.accenture;

public class SubArrayOccurance {
	
	public static int subArrayCountInMainArray(int[] main,int[] subArray) {
		int count=0;
		boolean value=false;
		for(int i=0;i<main.length;i++) {
			if(subArray[0]==main[i]) {
				int l=i;
				for(int k=0;k<subArray.length;) {
					if(subArray[k]==main[l]) {
						value=true;
						l++;
					}else
						value=false;
						break;	
					}
					
				}
			    if(value==true) {
			    	count+=1;	
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] main = {1,2,4,6,0,6,8};
		int[] subArray = {1,2,4,6,0};
		
		int count=subArrayCountInMainArray(main, subArray);
		System.out.println(count);
	}
}
