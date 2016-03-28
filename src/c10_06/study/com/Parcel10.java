package c10_06.study.com;

import c10_4.study.com.Destination;

public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100)
					System.out.println("Over budget!");
			}
			
			private String label = dest;
			public String readLable() {
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel10 parcel10 = new Parcel10();
		Destination destination = parcel10.destination("Tasmania", 101.385F);
		System.out.println(destination.readLable());
	}
}
