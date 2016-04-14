package c18.study.com;

import java.io.*;

public class BasicFileOutput {
	static String file = "BasicFileOutput.txt";
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
				new StringReader(
						BufferedInputFile.read("./src/c18/study/com/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		
		System.out.print(BufferedInputFile.read(file));
	}
}
