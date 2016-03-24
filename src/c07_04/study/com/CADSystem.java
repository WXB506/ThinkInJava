package c07_04.study.com;

class Shape {
	Shape(int i) {
		System.out.println("Shape constructor.");
	}
	void dispose() {
		System.out.println("Shape dispose.");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Circle constructor.");
	}
	void dispose() {
		super.dispose();
		System.out.println("Circle dispose.");
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		System.out.println("Triangle constructor.");
	}
	void dispose() {
		super.dispose();
		System.out.println("Triangle dispose.");
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end   = end;
		System.out.println("Line constructor.");
	}
	void dispose() {
		super.dispose();
		System.out.println("Line dispose.");
	}
}

public class CADSystem extends Shape {
	private Circle circle;
	private Triangle triangle;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i+1);
		
		for(int j=0; j < lines.length; j++)
			lines[j] = new Line(j, j*j);
		
		circle   = new Circle(1);
		triangle = new Triangle(1);
		
		System.out.println("Combined constructor.");
	}
	
	public void dispose() {
		for(int j=0; j < lines.length; j++)
			lines[j].dispose();
		
		triangle.dispose();
		circle.dispose();
		
		super.dispose();
		System.out.println("CADSystem dispose.");
	}
	
	public static void main(String[] args) {
		CADSystem xCadSystem = new CADSystem(3);
		try {
			System.out.println("try block.");
		} finally {
			xCadSystem.dispose();
		}
	}
}
