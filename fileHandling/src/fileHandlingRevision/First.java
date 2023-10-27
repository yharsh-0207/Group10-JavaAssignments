package fileHandlingRevision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/harsh/Desktop/programming/javaCore/fileHandling/bin/fileHandlingRevision/abc.txt");
		if(!f.exists()) {
			System.out.println("file does not exist.");
			System.exit(0);
		}
		byte[] b = new byte[(int)f.length()];
		
		try(FileInputStream fis = new FileInputStream(f)){
			fis.read(b);
			String s = new String(b);
			System.out.println(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("/Users/harsh/Desktop/programming/javaCore/fileHandling/bin/fileHandlingRevision/xyz.txt", true);
			byte[] b1 = new byte[100];
			int k = System.in.read(b1);
			fos.write(b1, 0, k);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
