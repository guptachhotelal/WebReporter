
package com.webreporter.entity;

/**
 *
 * @author Chhotelal
 */
public enum DoctorDegree {
	MBBS("MBBS", "MBBS"), MD("MD", "MD"), DM_CARDIO("DM_CARDIO", "DM-Cardiologist"), DM_NEPHRO("DM_NEPHRO", "DM-Nephrologist"), DM_ENDO("DM_ENDO", "DM-Endologist"), DM_NEURO("DM_NEURO", "DM-Neurologist"), DNB_CARDIO("DNB_CARDIO",
			"DNB-Cardiologist"), DNB_NEPHRO("DNB_NEPHRO", "DNB-Nephrologist"), DNB_ENDO("DNB_ENDO", "DNB-Endologist"), DNB_NEURO("DNB_NEURO", "DNB-Neurologist"), DDIBETO("DDIBETO", "Dibetologist");

	private final String	value;
	private final String	label;

	private DoctorDegree(String value, String label)
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
