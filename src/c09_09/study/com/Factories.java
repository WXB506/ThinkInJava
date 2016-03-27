package c09_09.study.com;

interface Service {
	void f();
	void g();
}
interface ServiceFactory {
	Service getService();
}

class Imp1 implements Service {
	Imp1() {};
	
	public void f() {
		System.out.println("IMP1_f");
	}
	public void g() {
		System.out.println("IMP1_g");
	}
}
class Imp1Factory implements ServiceFactory {
	public Service getService() {
		return new Imp1();
	}
}

class Imp2 implements Service {
	Imp2() {}
	
	public void f() {
		System.out.println("IMP2_f");
	}
	public void g() {
		System.out.println("IMP2_g");
	}
}
class Imp2Factory implements ServiceFactory {
	public Service getService() {
		return new Imp2();
	}
}


public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.f();
		s.g();
	}
	
	public static void main(String[] args) {
		serviceConsumer(new Imp1Factory());
		serviceConsumer(new Imp2Factory());
	}
}
