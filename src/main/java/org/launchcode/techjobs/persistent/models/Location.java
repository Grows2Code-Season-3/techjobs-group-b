package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location extends AbstractEntity {

    @ManyToMany(mappedBy = "locations")
    private List<Job> jobs = new ArrayList<>();

    private String jobLocation;

    public Location () {}

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
