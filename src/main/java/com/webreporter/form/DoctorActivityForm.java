
package com.webreporter.form;

import java.util.List;

/**
 *
 * @author Chhotelal
 */
public class DoctorActivityForm
{

	private long				daId;
	private DoctorForm			doctorForm;
	private List<ActivityForm>	activityForms;

	public long getDaId()
	{
		return daId;
	}

	public void setDaId(long daId)
	{
		this.daId = daId;
	}

	public DoctorForm getDoctorForm()
	{
		return doctorForm;
	}

	public void setDoctorForm(DoctorForm doctorForm)
	{
		this.doctorForm = doctorForm;
	}

	public List<ActivityForm> getActivityForms()
	{
		return activityForms;
	}

	public void setActivityForms(List<ActivityForm> activityForms)
	{
		this.activityForms = activityForms;
	}

}
