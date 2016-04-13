package c18.study.com;

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class DirList2 {
	public static FilenameFilter filter(final String regex) {
		// Creation of anonymous inner class
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);
			
			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		};	// end of anonymous inner class
	}
	
	public static void main(String[] args) {
		File path = new File("./src/c18/study/com/");
		String[] list;
		
		if(args.length == 0)
			list = path.list(filter("[a-zA-Z0-9]*.java"));
		else
			list = path.list();
		
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}
