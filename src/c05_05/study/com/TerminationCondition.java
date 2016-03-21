package c05_05.study.com;

class Book {
	boolean checkedOut = false;
	
	public Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	
	void checkIn() {
		checkedOut = false;
	}
	
	protected void finalize() {
		System.out.println("finalize function");
		if(checkedOut) {
			System.out.println("Error: checked out");
		}
	}
}
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		
		System.out.println("seperate line");
		new Book(true);
		System.gc();
	}
}
