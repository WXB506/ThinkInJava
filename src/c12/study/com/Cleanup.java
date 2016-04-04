package c12.study.com;

public class Cleanup {
	public static void main(String[] args) {
		try {
			InputFile in = new InputFile("E:/Java/workspace/ThinkInJava/src/c12/study/com/Cleanup.java");
			try {
				String s;
				while((s = in.getLine()) != null)
					System.out.println(s);
			} catch(Exception e) {
				System.out.println("Caught Exception in main.");
				e.printStackTrace(System.out);
			} finally {
				in.dispose();
			}
		} catch(Exception e) {
			System.out.println("InputFile construction failed.");
		}
	}
}
