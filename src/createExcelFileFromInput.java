import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class createExcelFileFromInput {
	
	public void copyFiles(String filePath,long startNum,int fileCount) {
		FileInputStream fis = null;
		FileOutputStream fout = null;
		FileOutputStream fout1 = null;

		try {
		File getFilePath = new File(filePath);
		String[] fileNames = getFilePath.list(); 
		for(String file : fileNames ) {
		File finput = new File(filePath+"\\"+file);
		System.out.println("the File Name is" + file);
		for ( int i=0;i<fileCount;i++) {
		startNum = startNum+1;
		String fileName = "PlanningBuyRecommendations_"+startNum+".csv";
		
		File foutput = new File(fileName);
	    fis = new FileInputStream(finput);
	    
		//fout = new FileOutputStream(createFolder(filePath+"\\ReleaseToExternal_"+startNum)+"\\"+fileName);
		fout1 = new FileOutputStream(new File(filePath+"\\"+fileName));
		byte[] buffer = new byte[1024];
		int len;
		
		while ((len = fis.read(buffer)) > 0){
			//fout.write(buffer, 0, len);
			fout1.write(buffer, 0, len);
	    }
		createZipFile(new File(filePath),fileName,startNum);
		
		fis.close();
		fout1.close();
		
		System.out.println("File Copied Successfully");
		
	} 
		 }
		}
  catch(Exception e) {
	  e.printStackTrace();
	  System.out.println("File Not Copied");
 }
	}	
	
 public void createZipFile(File filePath, String fileName,long startNum) throws IOException {
	     
	     String zipOutFilePath = filePath+"\\ReleaseToExternal_"+startNum+".zip";
         FileOutputStream fileOutputStream = new FileOutputStream(zipOutFilePath);
         ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
         ZipEntry zipEntry = new ZipEntry(fileName);
         System.out.println("The File Name is "+fileName);
         zipOutputStream.putNextEntry(zipEntry);

         FileInputStream fileInputStream = new FileInputStream(filePath+"\\"+fileName);
         byte[] buf = new byte[1024];
         int bytesRead;
         
         while ((bytesRead = fileInputStream.read(buf)) > 0) {
             zipOutputStream.write(buf, 0, bytesRead);
         }

         // close ZipEntry to store the stream to the file
         zipOutputStream.closeEntry();

         zipOutputStream.close();
         fileOutputStream.close();
 }
 
    public String createFolder(String filePath) {
	 File f = new File(filePath);
	 f.mkdir();
	 return filePath;
   }
	public static void main(String ar[]) throws IOException {
		createExcelFileFromInput creExcel = new createExcelFileFromInput();
		creExcel.copyFiles("C:\\KrishnaData\\FileCopy",96700,15);
	}
}