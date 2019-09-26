/**
 * 
 */
package model;

import utils.E_PartCategory;
import java.io.Serializable;

/**
 * @author Java spring 2017
 *
 */
public class WorkStation implements Cloneable,Serializable{
    	private static final long serialVersionUID = 1L;
	/** Key: Work Station number */
	protected int stationNumber;
	/** Work Station category */
	protected E_PartCategory category;
	/**
	 * Full constructor
	 * @param stationNumber
	 * @param cat
	 */
	protected WorkStation(int stationNumber, E_PartCategory cat) {
		this.stationNumber = stationNumber;
		this.category = cat;
	}
    /**
     * 
     * @return Station Number
     */
    public int getStationNumber() {
        return stationNumber;
    }
    /**
     * 
     * @return Station Category
     */
    public E_PartCategory getCategory() {
        return category;
    }
        
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stationNumber;
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof WorkStation)
			if (((WorkStation)obj).stationNumber  == this.stationNumber)
				return true;
		return false;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WorkStation [stationNumber=" + stationNumber + ", category="
				+ category + "]";
	}
	
	protected Object clone() {
		return new WorkStation(stationNumber, category);
	}
}
