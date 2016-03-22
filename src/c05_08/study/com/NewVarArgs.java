package c05_08.study.com;

public class NewVarArgs {
	static void printArray(Object... args) {
		for(Object object : args)
			System.out.println(object + "");
	}
	
	public static void main(String[] args) {
		printArray(new Integer(47), new Float(3.14));
		printArray((Object[])new Integer[]{1, 2, 3, 4, 5});
	}
}
