package dip.after;

public class FrontEndDeveloper implements Developer {

	@Override
	public void develop() {
		writeJavascript();
	}
	
	public void writeJavascript() {
		System.out.println("coding in angular");
	}

	

}
