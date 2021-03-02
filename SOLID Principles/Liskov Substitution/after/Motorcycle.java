package lsp.after;

public class Motorcycle extends VehicleWithEngine {

	@Override
	void startEngine() {
		System.out.println("Engine start!!!!");
	}

	@Override
	void name() {
		System.out.println("This is motorbike!!!");
	}

}
