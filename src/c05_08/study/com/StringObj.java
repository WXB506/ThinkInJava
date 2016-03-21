package c05_08.study.com;

class Test {
	Test(String s) {
		System.out.println(s);
	}
}

public class StringObj {
	public static void main(String[] args) {
		Test[] tests = new Test[5];
		for(int i=0; i < tests.length; i++) {
			tests[i] = new Test( (new Integer(i)).toString() );
		}
		System.out.println(tests.length);
	}
}
