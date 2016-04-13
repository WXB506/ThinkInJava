package c18.study.com;

// Display a directory listing using regular expressions

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class DirList {
	public static void main(String[] args) {
		File path = new File("./src/");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String dirItem : list)
			System.out.println(dirItem);
	}
	
}

class DirFilter implements FilenameFilter {
	private Pattern pattern;
	
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}