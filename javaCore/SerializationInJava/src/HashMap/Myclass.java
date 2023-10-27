package HashMap;

import java.io.Serializable;

public class Myclass implements Serializable {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Myclass Num: " + num;
	}

}
