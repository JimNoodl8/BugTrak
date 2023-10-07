package application;



import java.util.Date;

public class Project {
    private String name;
    private Date startDate;
    private String description;

    public Project(String name, Date startDate, String description) {
        this.name = name;
        this.startDate = startDate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
