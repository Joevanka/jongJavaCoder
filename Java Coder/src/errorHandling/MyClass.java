package errorHandling;

import java.util.Arrays;

public class MyClass {

	public void index() {
		String[] data = new String[3];
		System.out.println("-----set data-----");
		
		data[0] = "hallo";
		data[1] = "world";
		data[2] = "xsis";
		
		try {
		data[3] = "mitra";
		data[4] = "utama";
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(Arrays.toString(data));
	}
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.index();
	}
}
