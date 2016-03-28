package c10_06.study.com;

import c10_4.study.com.Contents;

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	public Contents contents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Parcel7b parcel7b = new Parcel7b();
		Contents contents = parcel7b.contents();
		System.out.println(contents.value());
	}
}
