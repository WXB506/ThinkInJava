package c10_05.study.com;

public class Parcel6 {
	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				TrackingSlip(String s) {
					id = s;
				}
				String getSlip() {
					return id;
				}
			}
			
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.println(s);
		}
	}
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}