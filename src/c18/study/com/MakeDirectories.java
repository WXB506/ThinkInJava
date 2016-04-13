package c18.study.com;

import java.io.*;

public class MakeDirectories {
	private static void usage() {
		System.err.println(
				"Usage:MakeDirectories path1 ...\n" + 
				"Creates each path\n" +
				"Usage:MakeDirecoties -d path1 ...\n" + 
				"Deletes each path\n" + 
				"Usage:MakeDirectories -r path1 path2\n" +
				"Renames from path1 to path2"
				);
		System.exit(1);
	}
	
	private static void fileData(File f) {
		System.out.println(
				"Absolute path: " + f.getAbsolutePath() +
				"\n Can read: " + f.canRead() +
				"\n Can write: " + f.canWrite() +
				"\n getName: " + f.getName() +
				"\n getPatent: " + f.getParent() +
				"\n getPath: " + f.getPath() +
				"\n length: " + f.length() +
				"\n lastModified: " + f.lastModified()
				);
		if(f.isFile())
			System.out.println("It's a file");
		else {
			System.out.println("It's a directory");
		}
	}
	
	static String[] fnames = {"test.txt", "text.txt"};
	public static void main(String[] args) {
		if(fnames.length < 1)
			usage();
		if(fnames[0].equals("-r")) {
			if(fnames.length != 3)
				usage();
			
			File old = new File(fnames[1]);
			File rname = new File(fnames[2]);
			old.renameTo(rname);
			fileData(old);
			fileData(rname);
			
			return;
		}
		
		int count = 0;
		boolean del = false;
		if(fnames[0].equals("-d")) {
			count++;
			del = true;
		}
		count--;
		while(++count < fnames.length) {
			File f = new File(fnames[count]);
			if(f.exists()) {
				System.out.println(f + " exists");
				if(del) {
					System.out.println("deleting..." + f);
					f.delete();
				}
			} else {
				if(!del) {
					f.mkdirs();
					System.out.println("created " + f);
				}
				fileData(f);
			}
		}
	}
}
