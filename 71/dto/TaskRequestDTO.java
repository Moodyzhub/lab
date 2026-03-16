/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author phatvv
 */
public class TaskRequestDTO {

    private String requirementName;
    private int taskTypeId;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    public TaskRequestDTO() {
    }

    public TaskRequestDTO(String requirementName,
            int taskTypeId,
            String date,
            double planFrom,
            double planTo,
            String assignee,
            String reviewer) {

        this.requirementName = requirementName;
        this.taskTypeId = taskTypeId;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    // getters
    public String getRequirementName() {
        return requirementName;
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public String getDate() {
        return date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }
}
