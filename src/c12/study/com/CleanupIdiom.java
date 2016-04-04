package c12.study.com;

class NeedsCleanup {
	private static long counter = 1;
	private final long id = counter++;
	public void dispose() {
		System.out.println("NeedsCleanup " + id + " disposed.");
	}
}
class ConstructionException extends Exception {}
class NeedsCleanup2 extends NeedsCleanup {
	public NeedsCleanup2() throws ConstructionException {
	}
}


public class CleanupIdiom {
	public static void main(String[] args) {
		// section 1
		NeedsCleanup nc1 = new NeedsCleanup();
		try {
			//
		} finally {
			nc1.dispose();
		}
		
		// section 2
		NeedsCleanup nc2 = new NeedsCleanup();
		NeedsCleanup nc3 = new NeedsCleanup();
		try {
			//
		} finally {
			nc2.dispose();
			nc3.dispose();
		}
		
		// section 3
		try {
			NeedsCleanup2 nc4 = new NeedsCleanup2();
			try {
				NeedsCleanup2 nc5 = new NeedsCleanup2();
				try {
					//
				} finally {
					nc5.dispose();
				}
			} catch(ConstructionException e) {	// nc5 constructor
				System.out.println(e);
			} finally {
				nc4.dispose();
			}
		} catch(ConstructionException e) {		// nc4 constructor
			System.out.println(e);
		}
	}
}
