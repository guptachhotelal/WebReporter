
package com.webreporter.entity;

/**
 *
 * @author Chhotelal
 */
public enum DoctorType {
	CORE("CORE", "CORE"), SUPERCORE("SCORE", "SUPERCORE"), IMPORTANT("IMP", "IMPORTANT");

	private final String	value;
	private final String	label;

	private DoctorType(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	public String getValue()
	{
		return value;
	}

	public String getLabel()
	{
		return label;
	}
}
