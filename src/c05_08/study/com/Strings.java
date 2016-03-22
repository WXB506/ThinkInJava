package c05_08.study.com;

class Test2 {
	static void main(String... args) {
		for(String string : args)
			System.out.print(string + " ");
	}
}
public class Strings {
	static String[] strings = {"a", "b", "c"};
	
	public static void main(String[] args) {
		Test2.main(strings);
	}
}
