/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author phatvv
 */
public class TaskResponseDTO {

    private int id;
    private String requirementName;
    private String taskTypeName;
    private String date;
    private double time;
    private String assignee;
    private String reviewer;

    public TaskResponseDTO(int id, String requirementName, String taskTypeName, String date, double time,
            String assignee, String reviewer) {
        this.id = id;
        this.requirementName = requirementName;
        this.taskTypeName = taskTypeName;
        this.date = date;
        this.time = time;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String toString() {
        return String.format("%-5d %-15s %-12s %-12s %-10s %-12s %-12s",
                id, requirementName, taskTypeName, date, time, assignee, reviewer);
    }

}
