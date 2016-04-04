package c13.study.com;

import java.io.*;

public class ReadSTD {
	public static void main(String[] args) {
		try {
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Please input a string : ");
			String str1 = stdin.readLine();
			System.out.println("string value : " + str1);
			
			System.out.print("Please input another string : ");
			String str2 = stdin.readLine();
			System.out.println("string value : " + str2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
