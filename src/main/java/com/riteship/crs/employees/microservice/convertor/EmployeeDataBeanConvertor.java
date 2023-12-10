package com.riteship.crs.employees.microservice.convertor;

import com.riteship.crs.employees.microservice.dtos.EmployeeDataBeanDTO;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDataBeanConvertor {

    public static List<EmployeeDataBeanDTO> convertEmployeeDataListToEmployeeDataBean(ArrayList employeeDataList) {
        List<EmployeeDataBeanDTO> employeeDataBeanDTOS = new ArrayList<>();
        if(!CollectionUtils.isEmpty(employeeDataList)) {
            employeeDataList.stream().forEach(data -> {
                if(data != null) {
                    HashMap companyData = (HashMap) data;
                    if(!CollectionUtils.isEmpty(companyData)) {
                        EmployeeDataBeanDTO employeeDataBeanDTO = getemployeeDataBeanDTOFromDataMap(companyData);
                        if(employeeDataBeanDTO != null) {
                            employeeDataBeanDTOS.add(employeeDataBeanDTO);
                        }
                    }
                }
            });
        }
        return employeeDataBeanDTOS;
    }

    public static EmployeeDataBeanDTO getemployeeDataBeanDTOFromDataMap(HashMap employeeData) {
        EmployeeDataBeanDTO employeeDataBeanDTO = null;
        if(!CollectionUtils.isEmpty(employeeData)) {
            employeeDataBeanDTO = new EmployeeDataBeanDTO();
            employeeDataBeanDTO.setEmployeeSal(String.valueOf(employeeData.get("employee_sal")));
            employeeDataBeanDTO.setEmployeeFirstName((String)employeeData.get("employee_first_name"));
            employeeDataBeanDTO.setEmployeeMiddleName((String)employeeData.get("employee_middle_name"));
            employeeDataBeanDTO.setEmployeeLastName((String)employeeData.get("employee_last_name"));
            employeeDataBeanDTO.setEmployeeGender((String)employeeData.get("employee_gender"));
            employeeDataBeanDTO.setEmployeeId(Integer.valueOf((String)employeeData.get("employee_id")));
            employeeDataBeanDTO.setEmployeeVillage((String)employeeData.get("employee_village"));
            employeeDataBeanDTO.setEmployeeState((String)employeeData.get("employee_state"));
            employeeDataBeanDTO.setEmployeeCountry((String)employeeData.get("employee_country"));
            employeeDataBeanDTO.setEmployeeLandline((String)employeeData.get("employee_landline"));
            employeeDataBeanDTO.setEmployeeMobile((String)employeeData.get("employee_mobile"));
            employeeDataBeanDTO.setEmployeeEmail((String)employeeData.get("employee_email"));
            employeeDataBeanDTO.setEmployeeStatus(String.valueOf(employeeData.get("employee_status")));
            employeeDataBeanDTO.setEmployeeDeparment(String.valueOf(employeeData.get("employee_deparment")));
            employeeDataBeanDTO.setEmployeeDob((String)employeeData.get("employee_dob"));
            employeeDataBeanDTO.setEmployeeNationalty((String)employeeData.get("employee_nationalty"));
            employeeDataBeanDTO.setEmployeeManagerId(String.valueOf(employeeData.get("employee_manager_id")));
            employeeDataBeanDTO.setEmployeeRole(String.valueOf(employeeData.get("employee_role")));
        }
        return employeeDataBeanDTO;
    }

    public static Map<String, String> getMapOfEmployeeDataFromEmployeeDataBean(EmployeeDataBeanDTO employeeDataBeanDTO) {
        Map<String, String> resultsArray = new HashMap<>();
        if(employeeDataBeanDTO != null) {
            resultsArray.put("employee_id",String.valueOf(employeeDataBeanDTO.getEmployeeId()));
            resultsArray.put("employee_manager_id",employeeDataBeanDTO.getEmployeeManagerId());
            resultsArray.put("employee_role",employeeDataBeanDTO.getEmployeeRole());
            resultsArray.put("employee_sal",employeeDataBeanDTO.getEmployeeSal());
            resultsArray.put("employee_first_name",employeeDataBeanDTO.getEmployeeFirstName());
            resultsArray.put("employee_middle_name",employeeDataBeanDTO.getEmployeeMiddleName());
            resultsArray.put("employee_last_name",employeeDataBeanDTO.getEmployeeLastName());
            resultsArray.put("employee_gender",employeeDataBeanDTO.getEmployeeGender());
            resultsArray.put("employee_address",employeeDataBeanDTO.getEmployeeAddress());
            resultsArray.put("employee_village",employeeDataBeanDTO.getEmployeeVillage());
            resultsArray.put("employee_state",employeeDataBeanDTO.getEmployeeState());
            resultsArray.put("employee_country",employeeDataBeanDTO.getEmployeeCountry());
            resultsArray.put("employee_landline",employeeDataBeanDTO.getEmployeeLandline());
            resultsArray.put("employee_mobile",employeeDataBeanDTO.getEmployeeMobile());
            resultsArray.put("employee_email",employeeDataBeanDTO.getEmployeeEmail());
            resultsArray.put("employee_status",employeeDataBeanDTO.getEmployeeStatus());
            resultsArray.put("employee_deparment",employeeDataBeanDTO.getEmployeeDeparment());
            resultsArray.put("employee_dob",employeeDataBeanDTO.getEmployeeDob());
            resultsArray.put("employee_nationalty",employeeDataBeanDTO.getEmployeeNationalty());
        }
        return resultsArray;
    }
}
