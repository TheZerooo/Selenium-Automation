package Inheritance;

public class NotExtend extends multiply {

	// default constructor -> constructor without parameter
	
	int a;
	public NotExtend(int a) {
		super(a); // esa likhne se parent ka costructor invoke ho jata h
		this.a=a;
	}
	public int increment() {
		a=a+1;
		return a;
	}
	
	public int decrement() {
		a=a-1;
		return a;
	}
}
