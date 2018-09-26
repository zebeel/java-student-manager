import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author chuon-l
 *
 */
public class StudentManager {
	public static Scanner scanner = new Scanner(System.in);
	private List<Student> studentList;
	private int maxId;
	
	/**
	 * Constructor
	 */
	public StudentManager() {
		this.studentList = new ArrayList<>();
		this.maxId = 0;
	}
	
	/**
	 * Add new student to list
	 */
	public void addStudent() {	
		System.out.println("--- Add new student ---");
		int id = ++this.maxId;
		String name = this.inputName();
		int age = this.inputAge();
		String address = this.inputAddress();
		float gpa = this.inputGpa();
		
		Student newStd = new Student(id, name, age, address, gpa);
		this.studentList.add(newStd);
	}
	
	/**
	 * Input student GPA
	 * @return
	 */
	public float inputGpa() {
		System.out.print("Student GPA: ");
		while(true) {
			try {
				float gpa = Float.parseFloat((scanner.nextLine()));
				if (gpa > 0 && gpa <= 4) {
					return gpa;
				}
				throw new Exception();
			}catch(Exception e) {
				System.out.println("Invalid GPA, please try again!");
			}
		}
	}
	
	/**
	 * Input student address
	 * @return
	 */
	public String inputAddress() {
		System.out.print("Student Address: ");
		return scanner.nextLine();
	}
	
	/**
	 * Input student age
	 * @return
	 */
	public int inputAge() {
		System.out.print("Student Age: ");
		while(true) {
			try {
				int age = Integer.parseInt((scanner.nextLine()));
				if (age > 10 && age < 100) {
					return age;
				}
				throw new Exception();
			}catch(Exception e) {
				System.out.println("Invalid age, please try again!");
			}
		}
	}
	
	/**
	 * Input student name
	 * @return
	 */
	public String inputName() {
		System.out.print("Student Name: ");
		return scanner.nextLine();
	}
	
	/**
	 * Show all students
	 */
	public void showStudent() {
		if(this.studentList == null || this.studentList.isEmpty() == true) {
			System.out.println("Empty Student List!");
			return;
		}
		
		System.out.println("--- Student List ---");
		System.out.format("%5s | ", "ID");
		System.out.format("%20s | ", "Name");
		System.out.format("%5s | ", "Age");
		System.out.format("%25s | ", "Address");
		System.out.format("%10s | ", "GPA");
		System.out.println();
		for(int i=1; i<81; i++)
			System.out.print("-");
		System.out.println();
		for (Student student : this.studentList) {
			System.out.format("%5d | ", student.getId());
			System.out.format("%20s | ", student.getName());
			System.out.format("%5d | ", student.getAge());
			System.out.format("%25s | ", student.getAddress());
			System.out.format("%10.1f | ", student.getGpa());
			System.out.println();
			for(int i=1; i<81; i++)
				System.out.print("-");
			System.out.println();
		}
	}
}
