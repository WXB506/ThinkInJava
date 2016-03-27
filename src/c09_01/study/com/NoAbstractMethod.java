package c09_01.study.com;

abstract class Test {
	public void play(String s) {
		System.out.println(s);
	}
}

public class NoAbstractMethod {
	public static void main(String[] args) {
		Test test = new Test() {
			public void play(String s) {
				System.out.println(s);
			}
		};
		
		test.play("fuck");
	}
}
