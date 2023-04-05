package com.example.projectfinaljava4.repository;

import com.example.projectfinaljava4.Entity.ThucVat;
import com.example.projectfinaljava4.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.UUID;

public class ThucVatRepository {
    Session session = HibernateUtil.getFACTORY().openSession();

    public ArrayList<ThucVat> getAll() {
        Query query = session.createQuery("from ThucVat ");
        ArrayList<ThucVat> listThucVat = (ArrayList<ThucVat>) query.getResultList();
        return listThucVat;

    }

    public boolean add(ThucVat thucVat) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.save(thucVat);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(ThucVat thucVat) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.update(thucVat);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean delete(ThucVat thucVat) {
        Transaction transaction;
        try {
            transaction = session.beginTransaction();
            session.delete(thucVat);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ThucVat getById(int id) {
        ThucVat thucVat = new ThucVat();
        try {
            thucVat = session.get(ThucVat.class, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return thucVat;
    }


}

