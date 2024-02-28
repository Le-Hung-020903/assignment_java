package com.example.lab05.Dao;

import com.example.lab05.Entity.EMPLOYEE;

import java.math.BigDecimal;
import java.util.List;

public interface EmployedDAO {
    public List<EMPLOYEE> getAllEmployee();
    public EMPLOYEE getEmployeeByEMP_NAME(String EMP_NAME);

    boolean insertEmployee(EMPLOYEE employee);

    boolean updateEmployee(EMPLOYEE employee);

    boolean deleteProduct(BigDecimal EMP_ID);

}
