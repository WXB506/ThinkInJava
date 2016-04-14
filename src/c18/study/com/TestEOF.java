package c18.study.com;

import java.io.*;

public class TestEOF {
	public static void main(String[] args) throws IOException {
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream(
						"./src/c18/study/com/TestEOF.java")));
		while(in.available() != 0)
			System.out.print((char)in.readByte());
	}
}
