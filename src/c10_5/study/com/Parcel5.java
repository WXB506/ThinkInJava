package c10_5.study.com;

// Nesting a class within a method

public class Parcel5 {
	
	public Destination destination(String s) {
		
		class PDestination implements Destination {
			private String label;
			
			private PDestination(String whereTo) {
				label = whereTo;
			}
			
			public String readLabel() {
				return label;
			}
		}
		
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination d = parcel5.destination("Nesting class");
		
		System.out.println(d.readLabel());
	}
}
