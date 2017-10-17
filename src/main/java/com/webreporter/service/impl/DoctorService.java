package com.webreporter.service.impl;

import com.webreporter.dao.IDoctorDAO;
import com.webreporter.dao.ITeamDAO;
import com.webreporter.entity.Doctor;
import com.webreporter.entity.Team;
import com.webreporter.form.DoctorForm;
import com.webreporter.form.TeamForm;
import com.webreporter.service.IDoctorService;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chhotelal
 */
@Service
@Transactional
public class DoctorService implements IDoctorService {

    @Resource
    private IDoctorDAO doctorDAO;

    @Resource
    private ITeamDAO teamDAO;

    @Override
    public void createDoctorForm(DoctorForm doctorForm) {
        Doctor doctor = new Doctor();
        doctor.setName(doctorForm.getName());
        doctor.setDegree(doctorForm.getDegree());
        doctor.setType(doctorForm.getType());
        doctor.setRemark(doctorForm.getRemark());
        doctor.setTeam(teamDAO.findTeamById(doctorForm.getTeamForm().getId()));
        doctor.setStatus(doctorForm.getStatus());
        doctorDAO.createDoctor(doctor);
    }

    @Override
    public void updateDoctorForm(DoctorForm doctorForm) {
        Doctor doctor = doctorDAO.findDoctorById(doctorForm.getId());
        doctor.setId(doctorForm.getId());
        doctor.setName(doctorForm.getName());
        doctor.setDegree(doctorForm.getDegree());
        doctor.setType(doctorForm.getType());
        doctor.setRemark(doctorForm.getRemark());
        doctor.setTeam(teamDAO.findTeamById(doctorForm.getTeamForm().getId()));
        doctor.setStatus(doctorForm.getStatus());
        doctorDAO.updateDoctor(doctor);
    }

    @Override
    public List<DoctorForm> listAllDoctorForm() {
        List<Doctor> doctors = doctorDAO.listAllDoctor();
        List<DoctorForm> listDoctor = new ArrayList<>();

        for (Doctor doctor : doctors) {
            Team team = teamDAO.findTeamById(doctor.getTeam().getId());

            TeamForm tf = new TeamForm();
            tf.setId(team.getId());
            tf.setTeamName(team.getTeamName());
            tf.setRemark(team.getRemark());
            DoctorForm df = new DoctorForm();
            df.setId(doctor.getId());
            df.setName(doctor.getName());
            df.setDegree(doctor.getDegree());
            df.setType(doctor.getType());
            df.setTeamForm(tf);
            df.setRemark(doctor.getRemark());
            df.setStatus(doctor.getStatus());
            listDoctor.add(df);
        }
        return listDoctor;
    }

    @Override
    public void deleteDoctorForm(DoctorForm doctorForm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DoctorForm findDoctorFormById(long doctorFormId) {
        Doctor doctor = doctorDAO.findDoctorById(doctorFormId);
        DoctorForm df = new DoctorForm();
        df.setId(doctor.getId());
        df.setDegree(doctor.getDegree());
        df.setName(doctor.getName());
        df.setRemark(doctor.getRemark());
        Team team = teamDAO.findTeamById(doctor.getTeam().getId());
        TeamForm tf = new TeamForm();
        tf.setId(team.getId());
        tf.setTeamName(team.getTeamName());
        tf.setRemark(team.getRemark());
        df.setTeamForm(tf);
        df.setType(doctor.getType());
        df.setStatus(doctor.getStatus());
        return df;
    }

    @Override
    public List<DoctorForm> findDoctorFormsByTeam(long tid) {
        List<Doctor> doctors = doctorDAO.findDoctorsByTeam(tid);
        List<DoctorForm> doctorForms = new ArrayList<>();
        for (Doctor doctor : doctors) {
            DoctorForm df = new DoctorForm();
            df.setId(doctor.getId());
            df.setName(doctor.getName());
            doctorForms.add(df);
        }
        return doctorForms;
    }
}
