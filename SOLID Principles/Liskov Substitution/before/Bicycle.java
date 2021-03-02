package lsp.before;

public class Bicycle extends Vehicle {

	@Override
	void name() {
		System.out.println("This is bicycle.");
	}

	@Override
	void startEngine() {
		throw new UnsupportedOperationException("Start Engine are not supported by Bicycle!!");
	}

}
