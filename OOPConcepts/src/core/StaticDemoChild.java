package core;

public class StaticDemoChild extends StaticDemo {

	static {
		System.out.println("Static block of child class");
	}

	public void display() {
		System.out.println("Just a Method of child class");
	}

	public static void main(String[] args) {
		StaticDemoChild obj = new StaticDemoChild();
		obj.display();
	}

}
