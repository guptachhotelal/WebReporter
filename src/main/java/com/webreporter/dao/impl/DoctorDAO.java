package com.webreporter.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.webreporter.dao.IDoctorDAO;
import com.webreporter.entity.Doctor;

/**
 *
 * @author Chhotelal
 * @param <T>
 */
@Repository
public class DoctorDAO<T> extends BaseDAO<Doctor> implements IDoctorDAO {

    @Override
    public void createDoctor(Doctor doctor) {
        super.create(doctor);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        super.update(doctor);
    }

    @Override
    public List<Doctor> listAllDoctor() {
        return super.listAll(Doctor.class);
    }

    @Override
    public void deleteDoctor(Doctor doctor) {
        super.delete(doctor);
    }

    @Override
    public Doctor findDoctorById(long doctorId) {
        return super.findById(Doctor.class, doctorId);
    }

    @Override
    public List<Doctor> findDoctorsByTeam(long teamId) {
        CriteriaBuilder builder = getSession().getCriteriaBuilder();
        CriteriaQuery<Doctor> criteria = builder.createQuery(Doctor.class);
        Root<Doctor> root = criteria.from(Doctor.class);
        criteria.select(root);
        criteria.where(builder.equal(root.get("team.id"), teamId));
        return getSession().createQuery(criteria).getResultList();
    }
}
