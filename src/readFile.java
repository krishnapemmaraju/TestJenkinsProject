import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class readFile {
	
	public static void readFiledata() throws IOException {
        
	    File f = new File("C:\\KrishnaData\\Testfile.txt");
	    BufferedReader br1 = new BufferedReader(new FileReader(f));
	    String st = "";
	    while ( (st = br1.readLine())!= null) {
	    	System.out.println(st);
	    }
	}
	
	public static void main(String ar[]) throws IOException {
		 readFiledata();
	}

}
