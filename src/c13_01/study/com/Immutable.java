package c13_01.study.com;

public class Immutable {
	public static String  upcase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String s = "howdy";
		System.out.println(s);
		String u = upcase(s);
		System.out.println(u);
		System.out.println(s);
	}
}
