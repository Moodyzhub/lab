package model;

import java.util.Date;

public class Task {
    //ID, TaskTypeID, Requirement Name, Date(dd-MM-yyyy), Plan From, Plan To, Assignee, Reviewer
    private int id;
    private String taskTypeID;
    private String requirementName;
    private Date date;
    private Double planFrom;
    private Double planTo;
    private String assignee;
    private String reviewer;

    public Task(){}

}
