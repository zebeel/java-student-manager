import java.util.Comparator;
/**
 * 
 * @author chuon-l
 *
 */
public class SortStudentByGpa implements Comparator<Student>{
	/**
	 * Override
	 */
	public int compare(Student st1, Student st2) {
		return st1.getGpa() > st2.getGpa() ? 1 : -1;
	}
}
