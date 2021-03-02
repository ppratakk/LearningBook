package dip.after;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Developer backendDeveloper = new BackEndDeveloper();
		Project backendProject = new Project(backendDeveloper);
		backendProject.implement();
		
		
		Developer frontendDeveloper = new FrontEndDeveloper();
		Project frontendProject = new Project(frontendDeveloper);
		frontendProject.implement();
		
		
		//OR
		
		List<Developer> developers = Arrays.asList(backendDeveloper, frontendDeveloper);
		Project project = new Project(developers);
		project.implementTogether();
	}

}
