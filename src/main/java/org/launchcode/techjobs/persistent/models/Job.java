package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Job extends AbstractEntity {

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;

    @ManyToMany
    private List<Location> locations;

    public Job() {
    }

    // added locations List along with access modifiers
    public Job(Employer anEmployer, List<Skill> someSkills, List<Location> someLocations) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
        this.locations = someLocations;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
