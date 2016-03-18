package study.com;

import study.com.Parcel_1.Contents;
import study.com.Parcel_1.Destination;

public class Parcel_2 {

	
	// inner class one
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	// inner class two
	class Destination {
		private String label;
		
		Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	// using inner class, return a reference
	// to inner class
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();	
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel_2 p = new Parcel_2();
		p.ship("Tasmania");
		
		Parcel_2 q = new Parcel_2();
		Parcel_2.Contents c = q.contents();
		Parcel_2.Destination d = q.to("Borneo");
		System.out.println(d.readLabel());
	}
	
}
