package com.webreporter.service;

import com.webreporter.form.DoctorForm;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface IDoctorService {

    void createDoctorForm(DoctorForm doctorForm);

    void updateDoctorForm(DoctorForm doctorForm);

    List<DoctorForm> listAllDoctorForm();

    void deleteDoctorForm(DoctorForm doctorForm);

    DoctorForm findDoctorFormById(long doctorFormId);

    List<DoctorForm> findDoctorFormsByTeam(long tid);
}
