package c10_04.study.com;

interface Contents {
	int value();
}
interface Destination {
	String readLabel();
}

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}


public class TestParcel {
	public static void main(String[] args) {
		Parcel4 parcel4 = new Parcel4();
		Contents contents = parcel4.contents();
		Destination destination = parcel4.destination("Tasmania");
		System.out.println(contents.value());
		System.out.println(destination.readLabel());
	}
}
