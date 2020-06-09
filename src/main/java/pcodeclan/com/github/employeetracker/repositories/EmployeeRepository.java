package pcodeclan.com.github.employeetracker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pcodeclan.com.github.employeetracker.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
