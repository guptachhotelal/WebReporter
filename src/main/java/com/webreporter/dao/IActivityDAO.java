package com.webreporter.dao;

import com.webreporter.entity.Activity;
import java.util.List;

/**
 *
 * @author Chhotelal
 */
public interface IActivityDAO {

    void createActivity(Activity activity);

    void updateActivity(Activity activity);

    List<Activity> listAllActivity();

    void deleteActivity(Activity activity);

    Activity findActivityById(long activityId);
}
