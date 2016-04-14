package c18.study.com;

import java.io.*;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile.read("./src/c18/study/com/MemoryInput.java"));
		int c;
		while((c = in.read()) != -1)
			System.out.println((char)c);
	}
}
