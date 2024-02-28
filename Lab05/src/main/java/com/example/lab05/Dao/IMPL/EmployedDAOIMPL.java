package com.example.lab05.Dao.IMPL;

import com.example.lab05.Dao.EmployedDAO;
import com.example.lab05.Entity.EMPLOYEE;
import com.example.lab05.Utils.HibernateUtils;
import org.hibernate.Session;

import java.math.BigDecimal;
import java.util.List;

public class EmployedDAOIMPL implements EmployedDAO {

    @Override
    public List<EMPLOYEE> getAllEmployee() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            List<EMPLOYEE> list = session.createQuery("from EMPLOYEE ").list();
            session.getTransaction();
            session.close();
            return list;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public EMPLOYEE getEmployeeByEMP_NAME(String EMP_NAME) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            EMPLOYEE employee = (EMPLOYEE) session.createQuery("from EMPLOYEE where EMP_NAME = :EMP_NAME").setParameter("EMP_NAME", EMP_NAME).uniqueResult();
            session.getTransaction();
            session.close();
            return employee;
        }catch (Exception e){
            e.printStackTrace();
            session.close();
        }
        return null;
    }

    @Override
    public boolean insertEmployee(EMPLOYEE employee) {
        return false;
    }

    @Override
    public boolean updateEmployee(EMPLOYEE employee) {
        return false;
    }

    @Override
    public boolean deleteProduct(BigDecimal EMP_ID) {
        return false;
    }
}
