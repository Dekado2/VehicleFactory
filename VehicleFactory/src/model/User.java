/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import utils.E_UserType;
import utils.E_SecretQuestion;
import java.io.Serializable;

/**
 *
 */
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private E_UserType type;
    private E_SecretQuestion secretQuestion;
    private String secretAnswer;
    
    /**
     * Constructor
     * @param username
     * @param password
     * @param type
     * @param secretQuestion
     * @param secretAnswer 
     */
  protected User(String username,String password, E_UserType type,E_SecretQuestion secretQuestion,String secretAnswer){
     setUsername(username);
     setPassword(password);
     this.type=type;
     this.secretQuestion=secretQuestion;
     setSecretAnswer(secretAnswer);
     }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        if (username.length()>=4)
        this.username = username;
    }
  
  public String getPassword() {
	return password;
}
  private void setPassword(String password) {
  	if (password.length()>=4)
            this.password=password;
     }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    private void setSecretAnswer(String secretAnswer) {
        if (secretAnswer.length()>=1)
        this.secretAnswer = secretAnswer;
    }

    public E_SecretQuestion getSecretQuestion() {
        return secretQuestion;
    }

    public E_UserType getType() {
        return type;
    }
  
  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", type=" + type + ", secretQuestion="
			+ secretQuestion + ", secretAnswer=" + secretAnswer + "]";
}
}
