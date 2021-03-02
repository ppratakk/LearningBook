package lsp.before;

public class Motorcycle extends Vehicle {

	@Override
	void name() {
		System.out.println("This is motorcycle.");
	}

	@Override
	void startEngine() {
		System.out.println("Engine start!!!");
	}

}
