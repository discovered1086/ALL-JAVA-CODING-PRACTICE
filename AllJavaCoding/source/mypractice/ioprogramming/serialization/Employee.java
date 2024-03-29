package mypractice.ioprogramming.serialization;

import java.io.Serializable;

/**
 * Created by kingshuk on 11/12/17.
 */
public class Employee implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7516150772023201954L;
	private String name;
    private String DOB;
    private String occupation;
    private transient Integer SSN;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getSSN() {
        return SSN;
    }

    public void setSSN(Integer SSN) {
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", occupation='" + occupation + '\'' +
                ", SSN=" + SSN +
                '}';
    }
}
