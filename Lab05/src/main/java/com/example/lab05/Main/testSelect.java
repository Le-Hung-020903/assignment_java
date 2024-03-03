package com.example.lab05.Main;

import com.example.lab05.Dao.IMPL.EmployedDAOIMPL;
import com.example.lab05.Entity.EMPLOYEE;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class testSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<EMPLOYEE> list = new EmployedDAOIMPL().getAllEmployee();
        if (list == null)
            return;
        for (EMPLOYEE item : list) {
            System.out.println(" " + item.getEMP_ID()
                    + "|" + item.getEMP_NAME()
                    + "|" + item.getEMP_NO()
                    + "|" + item.getHIRE_DATE()
                    + "|" + item.getIMAGE()
                    + "|" + item.getJOB()
                    + "|" + item.getDEPT_ID()
                    + "|" + item.getSALARY());
        }
        System.out.print("Nhập EMPLOYEE NAME : ");
        BigDecimal EMP_ID = sc.nextBigDecimal();
        EMPLOYEE employee = new EmployedDAOIMPL().getEmployeeByEMP_NAME(EMP_ID);
        System.out.println(" "+employee.getEMP_ID()
                +"|"+employee.getEMP_NAME()
                +"|"+employee.getEMP_NO()
                +"|"+employee.getHIRE_DATE()
                +"|"+employee.getIMAGE()
                +"|"+employee.getJOB()
                +"|"+employee.getDEPT_ID()
                +"|"+employee.getSALARY());
    }

}
