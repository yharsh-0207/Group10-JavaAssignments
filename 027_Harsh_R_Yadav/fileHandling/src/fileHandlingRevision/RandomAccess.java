package fileHandlingRevision;

import java.io.*;

public class RandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile r = new RandomAccessFile("/Users/harsh/Desktop/programming/javaCore/fileHandling/bin/fileHandlingRevision/abc.txt", "rw");
			r.seek(r.length());
			byte[] b  = new byte[200];
			System.out.println("enter data:");
			int k = System.in.read(b);
			r.write(b, 0, k);
			
			r.seek(0);
			byte[] c = new byte[(int) r.length()];
			r.read(c);
			String ss = new String(c);
				System.out.println(ss);
			
			r.seek(r.length());
			System.out.println("enter data again: ");
			k = System.in.read(b);
			r.write(b, 0, k);
			c = new byte[(int) r.length()];
			r.seek(0);
			r.read(c);
			ss = new String(c);
				System.out.println(ss);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
