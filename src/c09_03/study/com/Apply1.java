package c09_03.study.com;

class StringPorcessor implements Processor1 {
	public static String s = "If she weight the same as a duck, shi's made of wood";
	
	public String name() {
		return getClass().getSimpleName();
	}

	@Override
	public Object process(Object input) {
		return input;
	}
}

class Upcase1 extends StringPorcessor {
}

public class Apply1 {
	public static void process(Processor1 p, Object s) {
		System.out.println("Using processor " + p.name());
		System.out.println(p.process(s));
	}
}
