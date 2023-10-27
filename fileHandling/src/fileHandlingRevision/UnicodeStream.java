package fileHandlingRevision;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnicodeStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/harsh/Desktop/programming/javaCore/fileHandling/bin/fileHandlingRevision/abc.txt");
			try (FileWriter fw = new FileWriter(f)){
				
				char[] arr = {'a', 'b', 'c', 'd', 'e'};
				fw.write(arr);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			char[] arr1 = new char[(int) f.length()];
			try(FileReader fr = new FileReader(f)) {
				fr.read(arr1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i]);
			}
		
	}

}
