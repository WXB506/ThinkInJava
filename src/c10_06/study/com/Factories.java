package c10_06.study.com;

interface Service {
	void f1();
	void f2();
}
interface ServiceFactory {
	Service getService();
}

class Imp1 implements Service {
	private Imp1() {
	}
	public void f1() {
		System.out.println("implementation1 f1");
	}
	public void f2() {
		System.out.println("implementation1 f2");
	}
	
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Imp1();
		}
	};
}

class Imp2 implements Service {
	private Imp2() {
	}
	public void f1() {
		System.out.println("implementation2 f1");
	}
	public void f2() {
		System.out.println("implementation2 f2");
	}
	
	public static ServiceFactory factory = new ServiceFactory() {
		
		@Override
		public Service getService() {
			// TODO Auto-generated method stub
			return new Imp2();
		}
	};
}


public class Factories {
	public static void serviceConsumer(ServiceFactory fact) {
		Service service = fact.getService();
		service.f1();
		service.f2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(Imp1.factory);
		serviceConsumer(Imp2.factory);
	}
}
