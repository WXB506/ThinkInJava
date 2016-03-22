package c05_08.study.com;

public class VarargType {
	static void f(Character... characters) {
		System.out.print(characters.getClass());
		System.out.println(" length " + characters.length);
	}
	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}
	
	public static void main(String[] args) {
		f('a');
		f();
		
		g(1);
		g();
		
		System.out.println("int[]: " + new int[0].getClass());
	}
}
