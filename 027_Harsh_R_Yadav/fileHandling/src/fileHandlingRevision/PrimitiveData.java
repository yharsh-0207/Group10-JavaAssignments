package fileHandlingRevision;

import java.io.*;
public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/harsh/Desktop/programming/javaCore/fileHandling/bin/fileHandlingRevision/abc.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(10);
			dos.writeChar('a');
			dos.writeBoolean(true);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
