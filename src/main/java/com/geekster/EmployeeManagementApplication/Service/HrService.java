package com.geekster.EmployeeManagementApplication.Service;

import com.geekster.EmployeeManagementApplication.Model.Employee;
import com.geekster.EmployeeManagementApplication.Model.HR;
import com.geekster.EmployeeManagementApplication.Repository.IEmployeeRepository;
import com.geekster.EmployeeManagementApplication.Repository.IHrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {
    @Autowired
    private IHrRepository hrRepository;

    @Autowired
    private IEmployeeRepository employeeRepository;
    public String addHR(HR newHr) {
        hrRepository.save(newHr);
        return "Added successfully";
    }

    public List<HR> getAllHr() {
        return hrRepository.findAllHr();
    }

    //    @Transactional
    public void deleteHrByName(Integer id) {
        hrRepository.deleteById(id);
    }

    public String addListOfEmployee(List<Employee> employeeList) {
        employeeRepository.saveAll(employeeList);
        return "Added Successfully";
    }
}