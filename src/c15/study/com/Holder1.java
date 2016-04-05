package c15.study.com;

class AutoMobile {}
// can only hold AutoMobile
public class Holder1 {
	private AutoMobile a;
	public Holder1(AutoMobile a) {
		this.a = a;
	}
	AutoMobile get() {
		return a;
	}
}
