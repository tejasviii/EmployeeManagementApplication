package com.geekster.EmployeeManagementApplication.Repository;

import com.geekster.EmployeeManagementApplication.Model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Integer> {


    List<Employee> findAllByEmployeeName(String userName);

}
