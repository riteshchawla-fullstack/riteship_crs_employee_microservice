package com.riteship.crs.employees.microservice.impl;

import com.riteship.common.apis.services.impls.RiteShipGeneralServiceImpl;
import com.riteship.crs.employees.microservice.RiteShipEmployeeDBOperationsBean;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class RiteShipEmployeeServiceBean<EmployeeDataBean, Integer> extends RiteShipGeneralServiceImpl<EmployeeDataBean, Integer> {

        @PostConstruct
        public void initializeBean() {
            setRiteShipDatabaseOperationsBean(new RiteShipEmployeeDBOperationsBean().getDatabaseOperationsBean());
        }

}
