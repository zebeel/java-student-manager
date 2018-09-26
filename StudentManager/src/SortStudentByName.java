import java.util.Comparator;

/**
 * 
 * @author chuon-l
 *
 */
public class SortStudentByName implements Comparator<Student>{
	/**
	 * Override
	 */
	public int compare(Student st1, Student st2) {
		return st1.getName().compareTo(st2.getName());
	}
}
