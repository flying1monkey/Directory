package edu.berliner.directory.repositories;

import edu.berliner.directory.models.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Long>
{
}
