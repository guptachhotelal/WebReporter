
package com.webreporter.form;

/**
 *
 * @author Chhotelal
 */
public class DoctorForm
{

	private long		id;
	private String		name;
	private String		degree;
	private String		type;
	private String		remark;
	private boolean		status;
	private TeamForm	teamForm;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDegree()
	{
		return degree;
	}

	public void setDegree(String degree)
	{
		this.degree = degree;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public boolean getStatus()
	{
		return status;
	}

	public void setStatus(boolean status)
	{
		this.status = status;
	}

	public TeamForm getTeamForm()
	{
		return teamForm;
	}

	public void setTeamForm(TeamForm teamForm)
	{
		this.teamForm = teamForm;
	}

	@Override
	public String toString()
	{
		return "DoctorForm{" + "id=" + id + ", name=" + name + ", degree=" + degree + ", type=" + type + ", remark=" + remark + '}';
	}

}
