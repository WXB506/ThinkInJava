package c18.study.com;

import java.util.regex.*;
import java.util.*;
import java.io.*;

public class DirList3 {
	public static void main(final String[] args) {
		File path = new File("./src/c18/study/com/");
		String[] list;
		
		if(args.length == 0)
			list = path.list();
		else
			// building the anonymous inner class "in-place"
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);
				
				@Override
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			});
		
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		for(String dirItem : list)
			System.out.println(dirItem);
	}
}
