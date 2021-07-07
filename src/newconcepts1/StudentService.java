package newconcepts1;

import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
	
	
	public static List<Student> evaluateMark(String input) {
		return (input.equalsIgnoreCase("mark"))
				? StudentDatabase.getStudents().stream().filter(stu -> stu.getSmark() <= 800).collect(Collectors.toList())
				: StudentDatabase.getStudents().stream().filter(stu -> stu.getSmark() < 800).collect(Collectors.toList());
						//.collect(Collectors.toList());

	}
	public static void main(String args[]) {
		
		
		System.out.println(evaluateMark("mark"));
	}


}
