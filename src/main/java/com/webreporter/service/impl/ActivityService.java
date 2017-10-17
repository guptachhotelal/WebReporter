package com.webreporter.service.impl;

import com.webreporter.dao.IActivityDAO;
import com.webreporter.entity.Activity;
import com.webreporter.form.ActivityForm;
import com.webreporter.service.IActivityService;
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
public class ActivityService implements IActivityService {

    @Resource
    private IActivityDAO activityDAO;

    @Override
    public void createActivityForm(ActivityForm activityForm) {
        Activity activity = new Activity();
        activity.setActivityName(activityForm.getActivityName());
        activity.setRemark(activityForm.getRemark());
        activityDAO.createActivity(activity);
    }

    @Override
    public void updateActivity(ActivityForm activityForm) {
        Activity activity = activityDAO.findActivityById(activityForm.getAid());
        activity.setId(activityForm.getAid());
        activity.setActivityName(activityForm.getActivityName());
        activity.setRemark(activityForm.getRemark());
        activityDAO.updateActivity(activity);
    }

    @Override
    public List<ActivityForm> listAllActivityForm() {
        List<Activity> activities = activityDAO.listAllActivity();
        List<ActivityForm> listActivities = new ArrayList<>();

        for (Activity activity : activities) {
            ActivityForm af = new ActivityForm();
            af.setAid(activity.getId());
            af.setActivityName(activity.getActivityName());
            af.setRemark(activity.getRemark());
            listActivities.add(af);
        }
        return listActivities;
    }

    @Override
    public void deleteActivityForm(ActivityForm activityForm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ActivityForm findActivityFormById(long activityFormId) {
        Activity activity = activityDAO.findActivityById(activityFormId);
        ActivityForm af = new ActivityForm();
        af.setAid(activity.getId());
        af.setActivityName(activity.getActivityName());
        af.setRemark(activity.getRemark());
        return af;
    }

}
