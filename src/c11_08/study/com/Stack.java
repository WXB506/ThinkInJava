package c11_08.study.com;

import java.util.*;

public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T t) {
		storage.addFirst(t);
	}
	public T peek() {
		return storage.getFirst();
	}
	public T pop() {
		return storage.removeFirst();
	}
	public boolean empty() {
		return storage.isEmpty();
	}
	public String toString() {
		return storage.toString();
	}
}
