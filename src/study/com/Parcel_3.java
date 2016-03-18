package study.com;

public class Parcel_3 {

	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	public static void main(String[] args) {
		Parcel_3 p = new Parcel_3();
		// must use instance of outer class
		// to create an instance of the inner class
		Parcel_3.Contents c = p.new Contents();
		Parcel_3.Destination d = p.new Destination("TASMANIA");
		
		System.out.println(c.value());
		System.out.println(d.readLabel());
	}
}
