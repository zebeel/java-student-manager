import java.util.Scanner;

/**
 * 
 * @author chuon-l
 *
 */
public class Main {
	
	public static void main(String args[]) {
		StudentManager stdMan = new StudentManager();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			boolean isExit = false;
			showMenu();
			String mId = scanner.nextLine();
			switch(mId) {
			case "1":
				stdMan.addStudent();
				break;
			case "2":
				stdMan.editStudent();
				break;
			case "3":
				stdMan.deleteStudent();
				break;
			case "4":
				stdMan.sortByGpa();
				break;
			case "5":
				stdMan.sortByName();
				break;
			case "6":
				stdMan.showStudent();
				break;
			case "0":
				isExit = true;
				break;
			default:
				System.out.println(" > Invalid menu, please reselect bellow menu ");
			}
			
			if (isExit == true) {
				System.out.println(" > –”¡“x‚¨Šè‚¢‚¢‚½‚µ‚Ü‚·");
				break;
			}
				
		}
	}
	
	public static void showMenu() {
		System.out.println("--- Menu ---");
		System.out.println("1. Add student");
		System.out.println("2. Edit student by id");
		System.out.println("3. Delete student by id");
		System.out.println("4. Sort student by GPA");
		System.out.println("5. Sort student by name");
		System.out.println("6. Show student");
		System.out.println("0. Exit");
		System.out.print("Please select menu: ");
	}
	
}
