package code.microsystem.service;

import java.util.List;
import java.util.Optional;

import code.microsystem.entity.Employee;

public interface EmployeeService {
	public Employee addNewEMp(Employee employee);

	

	

	Optional <Employee> findById(Integer id);

	public Optional<Employee> findByFname(String name);

	public Employee editEmp(int id, Employee employee);

//	public void deleteEmp(Employee emp);





	public List<Employee> getAllEmployee();




	

}
