import java.io.Serializable;

/**
 * 
 * @author chuon-l
 *
 */
public class Student implements Serializable {
	private int id;
	private String name;
	private int age;
	private String address;
	private float gpa;
	
	/**
	 * Constructor for Student
	 * @param id
	 * @param name
	 * @param age
	 * @param address
	 * @param gpa
	 */
	public Student(int id, String name, int age, String address, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	
	/**
	 * Get student's id
	 * @return 
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Get student's name
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Get student's age
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Get student's address
	 * @return
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Get student's GPA
	 * @return
	 */
	public float getGpa() {
		return this.gpa;
	}
	
	/**
	 * Set student's ID
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Set student's name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Set student's age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Set student's address
	 * @param address
	 */
	public void setAddress (String address) {
		this.address = address;
	}
	
	/**
	 * Set student's Gpa
	 * @param gpa
	 */
	public void setGpa (float gpa) {
		this.gpa = gpa;
	}
}
