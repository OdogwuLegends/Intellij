package eVotingApp;

import votingApplication.PvcDetails;

public class VotersDetails {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        }
    }

    public PvcDetails getPvcDetails() {
        return pvcDetails;
    }

    public void setPvcDetails(PvcDetails pvcDetails) {
        this.pvcDetails = pvcDetails;
    }

    private PvcDetails pvcDetails;
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VotersDetails{");
        sb.append("fistName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", pvcDetails=").append(pvcDetails);
        sb.append('}');
        return sb.toString();
    }

}
