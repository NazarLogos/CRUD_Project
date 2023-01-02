package net.petproject.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.petproject.springproject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

}
