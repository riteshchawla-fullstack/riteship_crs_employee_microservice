package com.riteship.crs.employees.microservice.controller;
import com.riteship.crs.employees.microservice.convertor.EmployeeDataBeanConvertor;
import com.riteship.crs.employees.microservice.dtos.EmployeeDataBeanDTO;
import com.riteship.crs.employees.microservice.entities.EmployeeDataBean;
import com.riteship.crs.employees.microservice.impl.RiteShipEmployeeServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/riteship")
public class RiteShipEmployeeRestController {

    /*@Autowired
    private RiteShipEmployeeDBOperationsBean EmployeeDBOperationsBean;*/

    @Autowired
    private RiteShipEmployeeServiceBean<EmployeeDataBean, Integer> employeeServiceBean;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/employees/getAll")
    public @ResponseBody List<EmployeeDataBeanDTO> getAllEmployees() {
        return EmployeeDataBeanConvertor.convertEmployeeDataListToEmployeeDataBean(employeeServiceBean.getAllEmployee("1002"));
    }

    @PutMapping("/employees/save-employee")
    public @ResponseBody String saveEmployee(EmployeeDataBeanDTO companyData) {
        employeeServiceBean.saveEmployee((HashMap)EmployeeDataBeanConvertor.getMapOfEmployeeDataFromEmployeeDataBean(companyData));
        return "Success";
    }

    @GetMapping("/employees/get-employee")
    public @ResponseBody EmployeeDataBeanDTO getEmployeeDetails(int employee_id) {
        return EmployeeDataBeanConvertor.getemployeeDataBeanDTOFromDataMap(employeeServiceBean.getEmployeeDetails(employee_id));
    }

    @PatchMapping("/employees/update-employee")
    public @ResponseBody String updateEmployee(EmployeeDataBeanDTO companyData) {
        return employeeServiceBean.updateEmployee((HashMap)EmployeeDataBeanConvertor.getMapOfEmployeeDataFromEmployeeDataBean(companyData));
    }
}
