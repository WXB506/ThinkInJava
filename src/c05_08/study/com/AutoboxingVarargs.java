package c05_08.study.com;

public class AutoboxingVarargs {
	public static void f(Integer... args) {
		for(Integer integer : args) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f(new Integer(1), new Integer(2));
		f(4, 5, 6, 7, 8);
		f(10, new Integer(11), 12);
	}
}
