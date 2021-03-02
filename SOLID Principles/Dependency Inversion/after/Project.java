package dip.after;

import java.util.List;

public class Project {

	private Developer developer;
	private List<Developer> developers;

	public Project(Developer developer) {

		this.developer = developer;
	}
	
	public Project(List<Developer> developers) {
		this.developers = developers;
	}
	
	
	

	public void implement() {

		developer.develop();
	}
	
	public void implementTogether() {
		
		developers.forEach(d -> d.develop());
	}
}
