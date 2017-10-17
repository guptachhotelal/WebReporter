
package com.webreporter.form;

/**
 *
 * @author Chhotelal
 */
public class ActivityForm
{

	private long	aid;
	private String	activityName;
	private String	remark;
	private String	startDate;
	private String	endDate;

	public long getAid()
	{
		return aid;
	}

	public void setAid(long aid)
	{
		this.aid = aid;
	}

	public String getActivityName()
	{
		return activityName;
	}

	public void setActivityName(String activityName)
	{
		this.activityName = activityName;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	public String getEndDate()
	{
		return endDate;
	}

	public void setEndDate(String endDate)
	{
		this.endDate = endDate;
	}

}
