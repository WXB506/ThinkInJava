package c10_06.study.com;

import c10_4.study.com.Contents;

public class Parcel7 {
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			public int value() {
				return i;
			}
			public String test() {
				return "Contents";
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel7 parcel7 = new Parcel7();
		Contents contents = parcel7.contents();
		System.out.println(contents.value());
	}
}
