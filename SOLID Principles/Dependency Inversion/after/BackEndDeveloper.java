package dip.after;

public class BackEndDeveloper implements Developer {

	@Override
	public void develop() {
		writeJava();
		
	}
	
	public void writeJava() {
		System.out.println("coding in java");
	}

	

}
