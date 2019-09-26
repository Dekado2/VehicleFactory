/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 *
 */
public enum E_UserType {
    
    Admin ("Admin"),
    User("User");
    
    /** Text of the user type */
	public String text;
	/**
	 * Constructor
	 * @param text The text to set
	 */
	E_UserType(String text) {
		this.text = text;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return text;
	}
    
}
