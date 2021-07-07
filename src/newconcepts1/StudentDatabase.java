package newconcepts1;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
	
	public static List<Student> getStudents(){
		
		List<Student> studentList=new ArrayList<>();
		studentList.add(new Student(111,"Ananad",800));
		studentList.add(new Student(333,"Chand",700));
		studentList.add(new Student(222,"Basand",900));
		studentList.add(new Student(555,"Devanand",999));
		studentList.add(new Student(444,"Echand",600));
		return studentList;
		
	}

}
