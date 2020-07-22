package ${package}.service;

import java.util.List;

import ${package}.model.${project-name};

public interface ${project-name}Service {

	public List<${project-name}> findAll();
	
	public ${project-name} findById(int theId);
	
	public void save(${project-name} theEmployee);
	
	public void deleteById(int theId);
	
}
