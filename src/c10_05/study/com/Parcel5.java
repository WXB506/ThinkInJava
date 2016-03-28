package c10_05.study.com;

import c10_4.study.com.Destination;

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo) {
				label = whereTo;
			}
			public String readLable() {
				return label;
			}
		}
		
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("Tasmania");
		System.out.println(destination.readLable());
	}
}
