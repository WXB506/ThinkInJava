package c05_08.study.com;

public class OverloadingVarargs {
	static void f(Character... characters) {
		System.out.print("first ");
		for(Character character : characters) {
			System.out.print(character + " ");
		}
		System.out.println();
	}
	
	static void f(Integer... integers) {
		System.out.print("second ");
		for(Integer integer : integers) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
	
	static void f(Long... longs) {
		System.out.print("third ");
		for(Long l : longs) {
			System.out.print(l + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(0L);
		//f();
	}
}
