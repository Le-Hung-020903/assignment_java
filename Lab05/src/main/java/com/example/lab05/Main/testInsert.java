package com.example.lab05.Main;

import com.example.lab05.Dao.IMPL.EmployedDAOIMPL;
import com.example.lab05.Entity.EMPLOYEE;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class testInsert { public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        EMPLOYEE CreateEmployee = new EMPLOYEE();
        System.out.print("Nhập EMP_ID: ");
        BigDecimal id = sc.nextBigDecimal();
        System.out.print("Nhập EMP_NAME: ");
        String EMP_NAME = sc.next();
        System.out.print("Nhập EMP_NO: ");
        String EMP_NO = sc.next();
        sc.nextLine();
        System.out.println("Nhập ngày tháng năm theo định dạng dd-MM-yyyy: ");
        String dateString = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = dateFormat.parse(dateString);
        System.out.println("Ngày đã nhập: " + dateFormat.format(date));
        System.out.print("Nhập JOB: ");
        String JOB = sc.next();
        System.out.print("Nhập DEPT_ID: ");
        Integer DEPT_ID = sc.nextInt();
        System.out.print("Nhập MNG_ID: ");
        BigDecimal MNG_ID = sc.nextBigDecimal();
        System.out.print("Nhập SALARY: ");
        Double SALARY = sc.nextDouble();
        CreateEmployee.setEMP_ID(id);
        CreateEmployee.setEMP_NAME(EMP_NAME);
        CreateEmployee.setEMP_NO(EMP_NO);
        CreateEmployee.setHIRE_DATE(date);
        CreateEmployee.setIMAGE(null);
        CreateEmployee.setJOB(JOB);
        CreateEmployee.setDEPT_ID(DEPT_ID);
        CreateEmployee.setMNG_ID(MNG_ID);
        CreateEmployee.setSALARY(SALARY);
        boolean flag = new EmployedDAOIMPL().insertEmployee(CreateEmployee);
        if (flag == true) System.out.println("Thêm mới dữ liệu thành công! ");
        else System.out.println("Sảy ra lỗi thêm mới sản phẩm! ");
    } catch (Exception e) {
        System.out.println("Định dạng không hợp lệ. Hãy nhập theo định dạng dd-MM-yyyy.");
    }
}
}
