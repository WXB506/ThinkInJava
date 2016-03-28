package c10_03.study.com;

public class Parcel3 {
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	class Destination {
		private String label;
		
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public static void main(String[] args) {
		Parcel3 parcel3 = new Parcel3();
		Parcel3.Contents pContents = parcel3.new Contents();
		Parcel3.Destination pDestination = parcel3.new Destination("Tasmania");
		System.out.println(pContents.value());
		System.out.println(pDestination.label);
	}
}
