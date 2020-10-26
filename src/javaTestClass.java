
public class javaTestClass {
    public static void main(String ar[]) {
    	String data = "Krishna Kiran";
    	char[] toChar = data.toCharArray();
    	System.out.println(data.length() + " " + toChar.length);
    	String str = "";
    	for ( int i=data.length()-1;i<toChar.length;i--) {
    		System.out.println("The Char Length is " + toChar[i]);
    		str = str + toChar[i];
    		if ( i==0)
    			break;
    	}
    	System.out.println(str);
    }
}
