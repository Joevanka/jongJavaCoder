package errorHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

public class MyClass {

	public void index() {
		String[] data = new String[3];
		System.out.println("-----set data-----");
		
		data[0] = "hallo";
		data[1] = "world";
		data[2] = "xsis";
		
		Connection conn = null;
		
		
		try {
		conn = DriverManager.getConnection(null);
		data[3] = "mitra";
		data[4] = "utama";
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(Arrays.toString(data));
	}
	
	public void index2() {
		String data = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String[] datas = new String[1];
		try {
			data = br.readLine();
			int angka = Integer.parseInt(data);
			datas[0] = "hallo";
			datas[1] = "world";
		} catch (NumberFormatException ex) {
		//	ex.printStackTrace();
			System.err.println("error : " + ex.getMessage());
		} catch(IndexOutOfBoundsException ex) {
			System.err.println("terjadi error pada array");
		} catch(Exception e) {
			System.err.println("terjasi error");
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
//		System.out.println("data : " + data);		
		
	}
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.index2();
	}
}
