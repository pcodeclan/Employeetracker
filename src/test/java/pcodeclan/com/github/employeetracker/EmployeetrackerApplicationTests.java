package pcodeclan.com.github.employeetracker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pcodeclan.com.github.employeetracker.models.Employee;
import pcodeclan.com.github.employeetracker.repositories.EmployeeRepository;

@SpringBootTest
class EmployeetrackerApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void canCreateAndSaveEmployee(){
		Employee employee = new Employee("Dave", "Izumi", "dave@gmail.com",3012);
		employeeRepository.save(employee);
	}

}
