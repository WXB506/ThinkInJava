package c14.study.com;

public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
	}
}
