import com.trigyn.emp.Employee;
import com.trigyn.emp.Executive;
import com.trigyn.emp.Manager;

public class TestEmployee {
	public static void main(String[] args) {
		Manager mgr = new Manager("Polo", 7000, 3000);
		
		Executive exec = new Executive("Lili", 7000, 2000);
		
		showSalary(mgr);
		showSalary(exec);
		}
	
	private static void showSalary(Employee emp) {
		if (emp instanceof Manager) 
			System.out.println("manager Salary:" +emp.getSalary());
		else
			System.out.println("Exec Salary:" +emp.getSalary());	
		}
		
		//System.out.println("Employee Salary:" +emp.getSalary());
}

	/*private static void showSalary(Executive exec) {
		System.out.println("Executive Sal:" +exec.getSalary());
	}

	private static void showSalary(Manager mgr) {
		System.out.println("Manager Salary :" +mgr.getSalary());
		}
	*/



