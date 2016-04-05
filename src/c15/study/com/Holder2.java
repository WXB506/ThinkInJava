package c15.study.com;

public class Holder2 {
	private Object a;
	
	public Holder2(Object a) {
		this.a = a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	
	public static void main(String[] args) {
		Holder2 h2 = new Holder2(new AutoMobile());
		AutoMobile a = (AutoMobile)h2.get();
		System.out.println(a);
		
		h2.set("Not an AutoMobile");
		String s = (String)h2.get();
		System.out.println(s);
		
		h2.set(1);
		Integer x = (Integer)h2.get();
		System.out.println(x);
	}
}
