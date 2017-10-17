package com.webreporter.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Chhotelal
 */
public class ActivityDetail implements Serializable {

    private long adId;
    private String aName;
    private Date aStartDate;
    private Date aEndDate;

    public long getAdId() {
        return adId;
    }

    public void setAdId(long adId) {
        this.adId = adId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Date getaStartDate() {
        return aStartDate;
    }

    public void setaStartDate(Date aStartDate) {
        this.aStartDate = aStartDate;
    }

    public Date getaEndDate() {
        return aEndDate;
    }

    public void setaEndDate(Date aEndDate) {
        this.aEndDate = aEndDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.adId ^ (this.adId >>> 32));
        hash = 37 * hash + Objects.hashCode(this.aName);
        hash = 37 * hash + Objects.hashCode(this.aStartDate);
        hash = 37 * hash + Objects.hashCode(this.aEndDate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActivityDetail other = (ActivityDetail) obj;
        if (this.adId != other.adId) {
            return false;
        }
        if (!Objects.equals(this.aName, other.aName)) {
            return false;
        }
        if (!Objects.equals(this.aStartDate, other.aStartDate)) {
            return false;
        }
        if (!Objects.equals(this.aEndDate, other.aEndDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ActivityDetail{" + "adId=" + adId + ", aName=" + aName + ", aStartDate=" + aStartDate + ", aEndDate=" + aEndDate + '}';
    }
}
