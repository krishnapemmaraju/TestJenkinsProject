import java.*;
import java.util.Arrays;
public class TestDataClassPrac {
	
	public static void main(String ar[]) {
		
		int[] arr = new int[5];
		arr[0] = 30;
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 10;
		arr[4] = 8;
		int temp;
		
			for ( int i=0;i<arr.length;i++) {
			   for ( int j=i+1;j<arr.length;j++) {
			if ( arr[i] < arr[j] ) {
				   temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
			}
		}
		
	for(int h=0;h<arr.length;h++) {
		System.out.println(arr[h]);
	}
	} 
}
