import java.util.Arrays;


public class arraySorting {
	public static int a[] = new int[] {12,3,14,5,6,10,1};
	public static String b[] = new String[] {"ab","df","2","zd","x"};
	public static String c = "qwertyuiopasdfghjklzxcvbnm";
	
	public static void arraySortAPI() {
		 Arrays.sort(a);
		 for ( int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }
	}
	
	public static void arraySortNotAPI() {
		int temp;
		for ( int i=1;i<a.length;i++) {
			for ( int j=i;j>0;j--) {
				if ( a[j] < a[j-1])
				{
				temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				}
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void arraySortStringNotAPI() {
        String temp;
		for ( int i=1;i<b.length;i++) {
			for ( int j=i;j>0;j--) {
				if ( b[j].compareTo(b[j-1]) >0)
				{
				temp = b[j];
				b[j] = b[j-1];
				b[j-1] = temp;
				}
			}
		}
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static void main (String ar[]) 	 
	{
		//arraySorting.arraySortAPI();
	//	arraySorting.arraySortNotAPI();
		arraySorting.arraySortStringNotAPI();
	}

}
