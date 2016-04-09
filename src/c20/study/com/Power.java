package c20.study.com;

public class Power {
	long value() {
		long tmp=1;
		tmp <<= 32;
		tmp -= 1;
		System.out.println(tmp);
		return tmp;
	}
	public static void main(String[] args) {
		long num = 4000000000L;
		Power p = new Power();
		System.out.println(p.value());
		System.out.println(p.value() > num);
	}
}
