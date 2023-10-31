package college.placement.accenture;

public class BinarySearch {
	
	public static int binarySearch(int[] arr,int n) {
		int index=-1;
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			index=(start+end)/2;
			
			if(n==arr[index]) {
				return index;
			}
			else if(n<arr[index]) {
				end=index-1;
			}
			else
				start=index+1;
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int n =8;
		int index=binarySearch(arr,n);
		System.out.println(index);
	}
}
