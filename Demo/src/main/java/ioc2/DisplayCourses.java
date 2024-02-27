package ioc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication

public class DisplayCourses implements CommandLineRunner {

	@Autowired
   //@Qualifier(value = "onlineCourses")
	Courses courses;

	@Autowired
	public DisplayCourses(Courses courses) {
        this.courses=courses;
		System.out.println("DisplayCourses()");
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Courses List:");
		for (String course : courses.getCoursesList()) {
			System.out.println(course);
		}

		System.out.println("\nTrainers List:");
		for (String trainer : courses.getTrainersList()) {
			System.out.println(trainer);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DisplayCourses.class, args);
	}

}