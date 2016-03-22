package c05_08.study.com;

public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required : " + required + " ");
		
		for(String string : trailing)
			System.out.print(string + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		f(1, "one");
		f(2,  "two", "three");
		f(0);
	}
}
