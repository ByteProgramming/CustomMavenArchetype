package ${package}.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.repository.${project-name}Repository;
import ${package}.model.${project-name};

@Service
public class ${project-name}ServiceImpl implements ${project-name}Service {

	private ${project-name}Repository employeeRepository;
	
	@Autowired
	public ${project-name}ServiceImpl(${project-name}Repository the${project-name}Repository) {
		employeeRepository = the${project-name}Repository;
	}
	
	@Override
	public List<${project-name}> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public ${project-name} findById(int theId) {
		Optional<${project-name}> result = employeeRepository.findById(theId);
		
		${project-name} the${project-name} = null;
		
		if (result.isPresent()) {
			the${project-name} = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return the${project-name};
	}

	@Override
	public void save(${project-name} the${project-name}) {
		employeeRepository.save(the${project-name});
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}






