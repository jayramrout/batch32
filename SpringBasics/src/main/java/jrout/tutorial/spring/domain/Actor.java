package jrout.tutorial.spring.domain;

import java.sql.Date;

/**
 * POJO's
 * Domain Objects
 * DTO Data Transfer Object
 */
public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdatedDate;

    private Date clientRequestDate;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

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

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Date getClientRequestDate() {
        return clientRequestDate;
    }

    public void setClientRequestDate(Date clientRequestDate) {
        this.clientRequestDate = clientRequestDate;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdatedDate=" + lastUpdatedDate + '\''+
                ", clientRequestDate=" + clientRequestDate +
                '}';
    }
}
