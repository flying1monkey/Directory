package edu.berliner.directory.repositories;

import edu.berliner.directory.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{
}
