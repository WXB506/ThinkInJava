package c10_5.study.com;

// Nesting a class within a scope

public class Parcel6 {
	private void internalTracking(boolean b) {
		if(b) {
			class TrackingSlip {
				private String id;
				
				public TrackingSlip(String s) {
					// TODO Auto-generated constructor stub
					id = s;
				}
				
				String getSlip() {
					return id;
				}
			}
			
			TrackingSlip tSlip = new TrackingSlip("slip");
			String s = tSlip.getSlip();
			
			System.out.println(s);
		}
		// can't use it here, out of scope
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}
