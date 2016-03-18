package study.com;

public class DotNew {
	public class Inner{
		public void print() {
			System.out.println("Dot.new test");
		}
	}
	
	public static void main(String[] args) {
		DotNew dn = new DotNew();
		DotNew.Inner dni = dn.new Inner();
		dni.print();
	}
}
