package ioc2;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
@Primary

public class OfflineCourses implements Courses {

	public OfflineCourses() {
		System.out.println("OfflineCourses()");
	}

	@Override
	public List<String> getCoursesList() {
		return List.of("c", "sql", "java", "jdbc", "jpa");

	}

	@Override
	public List<String> getTrainersList() {
		return List.of("Roopa", "Ramu", "JK", "Srikanth", "Srikanth");
	}

}