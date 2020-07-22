package ${package}.controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ${package}.model.${project-name};
import ${package}.service.${project-name}Service;

@RestController
@RequestMapping("/api")
public class ${project-name}Controller {

	@Autowired
	private ${project-name}Service service;
	
	
	
	// expose "/employees" and return list of employees
	@GetMapping("/employees")
	public List<${project-name}> findAll() {
		return service.findAll();
	}

	// add mapping for GET /employees/{employeeId}
	
	@GetMapping("/employees/{employeeId}")
	public ${project-name} getEmployee(@PathVariable int employeeId) {
		
		${project-name} theEmployee = service.findById(employeeId);
		
		if (theEmployee == null) {
			throw new RuntimeException("${project-name} id not found - " + employeeId);
		}
		
		return theEmployee;
	}
	
	// add mapping for POST /employees - add new employee
	
	@PostMapping("/employees")
	public ${project-name} addEmployee(@RequestBody ${project-name} theEmployee) {
		
		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		
		theEmployee.setId(0);
		
		service.save(theEmployee);
		
		return theEmployee;
	}
	
	// add mapping for PUT /employees - update existing employee
	
	@PutMapping("/employees")
	public ${project-name} updateEmployee(@RequestBody ${project-name} theEmployee) {
		
		service.save(theEmployee);
		
		return theEmployee;
	}
	
	// add mapping for DELETE /employees/{employeeId} - delete employee
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		${project-name} tempEmployee = service.findById(employeeId);
		
		// throw exception if null
		
		if (tempEmployee == null) {
			throw new RuntimeException("${project-name} id not found - " + employeeId);
		}
		
		service.deleteById(employeeId);
		
		return "Deleted employee id - " + employeeId;
	}
	
}


