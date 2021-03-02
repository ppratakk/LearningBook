package lsp.after;

public class Bicycle extends VehicleWithoutEngine {

	@Override
	void startMoving() {
		System.out.println("Going forward slowly....");
	}

	@Override
	void name() {
		System.out.println("This is bike.");
	}

}
