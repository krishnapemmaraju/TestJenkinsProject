import java.util.ArrayList;

public class collection {
	
	public static void main(String ar[]) {
		
		ArrayList< String> al = new ArrayList<String>();
		al.add("Test1");
		al.add("Test3");
		al.add("Test4");
		System.out.println(al.size());
		for ( int i=0;i<al.size();i++) {
			
			System.out.println("The Value of " + i + " is " + al.get(i));

		}
	}

	
}
