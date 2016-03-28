package c10_06.study.com;

import c10_4.study.com.Destination;

public class Parcel9 {
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			@Override
			public String readLable() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel9 parcel9 = new Parcel9();
		Destination destination = parcel9.destination("Tasmania");
		System.out.println(destination.readLable());
	}
}
