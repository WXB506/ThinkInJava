package c10_5.study.com;

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 12;
		
		public int value() {
			return i;
		}
	}
	
	public Contents contents() {
		return new MyContents();
	}
	
	public static void main(String[] args) {
		Parcel7b parcel7b = new Parcel7b();
		Contents c = parcel7b.contents();
		
		System.out.println(c.value());
	}
}
