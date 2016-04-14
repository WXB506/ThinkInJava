package c18.study.com;

import java.io.*;

public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(
					BufferedInputFile.read("./src/c18/study/com/FormattedMemoryInput.java").getBytes()));
			while(true)
				System.out.println((char)in.readByte());
		} catch(EOFException e) {
			System.err.println("End of stream.");
		}
	}
}
