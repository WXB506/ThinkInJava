package c10_04.study.com;

class Test {
	private int pi = 11;
	protected int ai = 12;
	public int bi = 13;
}

public class PrivateTest extends Test {
	public static void main(String[] args) {
		PrivateTest privateTest = new PrivateTest();
		//System.out.println(privateTest.pi);		// not visible
		System.out.println(privateTest.ai);
		System.out.println(privateTest.bi);
	}
}
