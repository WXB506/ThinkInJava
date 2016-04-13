package c18.study.com;

import java.io.*;
import tk.java.util.PPrint;

public class DirectoryDemo {
	public static void main(String[] args) {
		// All directories
		PPrint.pprint(Directory.walk(".").dirs);
		
		// All files
		for(File file : Directory.local(".", "[a-z]*"))
			System.out.println(file);
		
		System.out.println("-------------------------");
		for(File file : Directory.local("./src/c18/study/com/", "[a-zA-Z0-9]*.java"))
			System.out.println(file);
		
		System.out.println("=========================");
		for(File file : Directory.walk(".", "[a-zA-Z0-9]*.class"))
			System.out.println(file);
	}
}
