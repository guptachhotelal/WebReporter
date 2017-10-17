package com.webreporter.dao.impl;

import com.webreporter.dao.IActivityDAO;
import com.webreporter.entity.Activity;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chhotelal
 */
@Repository
public class ActivityDAO<T> extends BaseDAO<Activity> implements IActivityDAO {

    @Override
    public void createActivity(Activity activity) {
        super.create(activity);
    }

    @Override
    public void updateActivity(Activity activity) {
        super.update(activity);
    }

    @Override
    public List<Activity> listAllActivity() {
        return super.listAll(Activity.class);
    }

    @Override
    public void deleteActivity(Activity activityForm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Activity findActivityById(long activityId) {
        return super.findById(Activity.class, activityId);
    }

}
