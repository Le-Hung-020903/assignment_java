package com.example.lab05.Main;

import com.example.lab05.Dao.IMPL.EmployedDAOIMPL;

import java.math.BigDecimal;
import java.util.Scanner;

public class testDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        BigDecimal Maspofdelete = sc.nextBigDecimal();
        boolean flagtodelete = new EmployedDAOIMPL().deleteProduct(Maspofdelete);
        if (flagtodelete == true ) System.out.println("Đã xóa sản phẩm thành công! ");
        else System.out.println("Sảy ra lỗi xóa sản phẩm! ");
    }
}
