package com.webreporter.service;

import com.webreporter.form.ActivityForm;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface IActivityService {

    void createActivityForm(ActivityForm activityForm);

    void updateActivity(ActivityForm activityForm);

    List<ActivityForm> listAllActivityForm();

    void deleteActivityForm(ActivityForm activityForm);

    ActivityForm findActivityFormById(long activityFormId);
}
