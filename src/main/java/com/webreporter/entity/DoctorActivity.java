package com.webreporter.entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public class DoctorActivity implements Serializable{

    private long id;
    private Activity activity;
    private List<Doctor> doctors;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

}
