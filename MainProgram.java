import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainProgram {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CompactDisc compactDisc = (CompactDisc) context.getBean("com.soundsystem.beans.CompactDisc#0");
		System.out.println(compactDisc.getName());*/
		
		
		getEmployeeData(employeeList);
		HashMap<String,Employee> mapEmp = new HashMap<String,Employee>();
		for (Employee employee : employeeList) {
			String tiltKey = employee.getId() + "~" + employee.getName() + "~"
					+ employee.getTypeOfEmp() + "~" + employee.getJobLocation();
			mapEmp.put(tiltKey, employee);
		}
		
		System.out.println(mapEmp.entrySet().size());
		
	}

	private static List getEmployeeData(List<Employee> employeeList) {
		Employee e1 = new Employee(1,"Vivek", "Temp", "NYC");
		Employee e2 = new Employee(1,"Vivek", "Perm", "Jersey");
		Employee e3 = new Employee(2,"Shantanu", "Perm", "Pune");
		Employee e4 = new Employee(3,"Piyush", "Perm", "Pune");
		Employee e5 = new Employee(1,"Vivek", "Temp", "NYC");
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		return employeeList;
	}

}

class Employee{
	private long id;
	private String name;
	private String typeOfEmp;
	private String jobLocation;
	
	public Employee(long id, String name, String typeOfEmp, String jobLocation) {
		super();
		this.id = id;
		this.name = name;
		this.typeOfEmp = typeOfEmp;
		this.jobLocation = jobLocation;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfEmp() {
		return typeOfEmp;
	}
	public void setTypeOfEmp(String typeOfEmp) {
		this.typeOfEmp = typeOfEmp;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
}
