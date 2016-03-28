package c10_07.study.com;

public interface ClassInInterface {
	void howdy();
	
	class Test implements ClassInInterface {
		public void howdy() {
			System.out.println("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
