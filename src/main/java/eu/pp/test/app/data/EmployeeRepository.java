package eu.pp.test.app.data;

import java.util.List;

import eu.pp.test.app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

    List<Employee> findEmployeeById( Long id );

    List<Employee> findAll();

}
