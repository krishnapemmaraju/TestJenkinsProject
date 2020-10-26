import java.util.ArrayList;

public class SDETPracticeTests {
	
	public void reverseNumber(int number) {
		
		int temp , x=0;
		while ( number != 0) {
		temp = number % 10; 
		x = x * 10 + temp; 
		number = number / 10;}		
		System.out.println("The Reverse Number is " + x);	
	}
	
	public void swapTwoNumbers(int x , int y) {
		
		x = x + y; 
		y = x - y;
		x = x - y;
		System.out.println("The numbers got swapped are " + x + " and " + y);
	}
	
	public void stringReverse(String revString,int javamethod) {
		String tempStr = "";
		char[] strArray = revString.toCharArray();
		
		for ( int i=strArray.length-1;i>=0;i--) {
			tempStr = tempStr + strArray[i];
		}
		
		System.out.println("The String reversed is " + tempStr);
	}
	
	public void stringReverse(String revString,String Buffmethod) {
		StringBuffer strBuf = new StringBuffer(revString);
		System.out.println(strBuf.reverse());
	}
	
	
	public static void main(String ar[]) {
		SDETPracticeTests practTest = new SDETPracticeTests();
	//	practTest.reverseNumber(2363);
	//	practTest.swapTwoNumbers(110,120);
		practTest.stringReverse("Manasaaa",1);
		practTest.stringReverse("Manasaaa","buf");		
	}

}
