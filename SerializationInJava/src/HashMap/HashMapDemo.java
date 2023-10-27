package HashMap;

import java.io.*;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String, Myclass> map = new HashMap<String, Myclass>();
			
			Myclass m1 = new Myclass();
			m1.setNum(10);
			Myclass m2 = new Myclass();
			m2.setNum(20);
			
			map.put("Second", m2);
			map.put("First", m1);
			
			
		
			FileOutputStream fos;
			try {
				fos = new FileOutputStream("xyz.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(map);
				
				FileInputStream fis = new FileInputStream("xyz.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				Map<?, ?> h = (Map<?, ?>)ois.readObject();
				
				System.out.println(h);
				
				
//				Set <?>set = h.entrySet();
//				
//				Iterator<?> itr = set.iterator();
//				
//				while(itr.hasNext()) {
//					Map.Entry<?, ?> entry = (Map.Entry<?, ?>) itr.next();
//					System.out.println(entry.getKey() + "\t" + entry.getValue());
//				}
//				
				
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
