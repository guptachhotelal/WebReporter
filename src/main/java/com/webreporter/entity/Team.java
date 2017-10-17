
package com.webreporter.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Chhotelal
 */
@Entity
@Table(name = "team")
public class Team implements Serializable
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long			id;
	@Column(name = "teamName")
	private String			teamName;
	@Column(name = "remark")
	private String			remark;
	@OneToMany(mappedBy = "team")
	private List<Doctor>	doctors;

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getTeamName()
	{
		return teamName;
	}

	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}

	public String getRemark()
	{
		return remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public List<Doctor> getDoctors()
	{
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors)
	{
		this.doctors = doctors;
	}

}
