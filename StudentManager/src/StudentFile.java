import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author chuon-l
 *
 */

public class StudentFile{
	/**
	 * Write student list to file
	 * @param std
	 */
	public void writeFile(List<Student> std) {
		try {
			FileOutputStream   f = new FileOutputStream(new File("student.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(std);
			
			o.close();
			f.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * Read student list from file
	 * @return
	 */
	public List<Student> readFile(){
		List<Student> std = new ArrayList<>();
		
		try {
			FileInputStream   f = new FileInputStream(new File("student.txt"));
			ObjectInputStream o = new ObjectInputStream(f);
			
			std = (List<Student>) o.readObject();
			
			o.close();
			f.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return std;
	}
}