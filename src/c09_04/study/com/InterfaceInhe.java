package c09_04.study.com;

interface base {
	void a();
}
interface layer1 extends base {
	void b();
}
interface layer2 extends base {
	void c();
}

interface layer3 extends layer1, layer2 {
	void d();
}
public class InterfaceInhe implements layer3 {
	public void a() {
		System.out.println("a ");
	}
	public void b() {
		System.out.println("b");
	}
	public void c() {
		System.out.println("c");
	}
	public void d() {
		System.out.println("d");
	}
	
	public static void main(String[] args) {
		InterfaceInhe x = new InterfaceInhe();
		x.a();
		x.b();
		x.c();
		x.d();
	}
}
