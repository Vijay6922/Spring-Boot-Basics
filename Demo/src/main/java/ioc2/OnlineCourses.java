package ioc2;

import java.util.List;

import org.springframework.stereotype.Component;

@Component

public class OnlineCourses implements Courses {

	public OnlineCourses() {
		System.out.println("OnlineCourses()");
	}

	@Override
	public List<String> getCoursesList() {
		return List.of("c1", "sql1", "java1", "jdbc1", "jpa1");

	}

	@Override
	public List<String> getTrainersList() {
		return List.of("Ramana", "Anil", "JK", "Srikanth", "Srikanth");
	}

}