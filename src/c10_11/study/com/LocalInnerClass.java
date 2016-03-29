package c10_11.study.com;

interface Counter {
	int next();
}

public class LocalInnerClass {
	private int count = 0;
	
	Counter getCounter(final String name) {
		// a local inner class
		class LocalCounter implements Counter {
			public LocalCounter() {
				System.out.println("LocalCounter");
			}
			public int next() {
				System.out.println(name);
				return count++;
			}
		}
		
		return new LocalCounter();
	}
	
	// anonymous inner class
	Counter getCounter2(final String name) {
		return new Counter() {
			{
				System.out.println("Counter");
			}
			
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass liClass = new LocalInnerClass();
		Counter c1 = liClass.getCounter("Local Inner");
		Counter c2 = liClass.getCounter2("Anonymous Inner");
		
		for(int i = 0; i < 5; i++)
			System.out.println(c1.next());
		
		for(int i = 0; i < 5; i++)
			System.out.println(c2.next());
	}
}
