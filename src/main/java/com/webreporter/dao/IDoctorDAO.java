package com.webreporter.dao;

import com.webreporter.entity.Doctor;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface IDoctorDAO {

    void createDoctor(Doctor doctor);

    void updateDoctor(Doctor doctor);

    List<Doctor> listAllDoctor();

    void deleteDoctor(Doctor doctor);

    Doctor findDoctorById(long doctorId);
    
    List<Doctor> findDoctorsByTeam(long teamId);

}
