package c07_04.study.com;

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}
	
	float doh(float f) {
		System.out.println("doh(float)");
		return 3.14f;
	}
}

class Milhouse {
}

class Bart extends Homer {
	
	void doh(Milhouse m) {
		System.out.println("Milhouse");
	}
	
	@Override
	float doh(float f) {
		System.out.println("Override");
		return 3.15f;
	}
}

public class Hide {
	public static void main(String[] args) {
		Bart bart = new Bart();
		
		bart.doh(1);
		bart.doh('x');
		bart.doh(1.0f);
		bart.doh(new Milhouse());
	}
}
