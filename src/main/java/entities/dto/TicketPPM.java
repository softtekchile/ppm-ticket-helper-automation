package entities.dto;

public class TicketPPM {

    private String orgUnit;
    private String wbs;
    private String requirementType;
    private String impact;
    private String urgency;
    private String priority;
    private String description;
    private String assignedTo;
    private String reason;
    private String clientId;
    private String requestorName;
    private String categoryApplication;
    private String location;
    private String detailedDescription;

    public String getOrgUnit() {
        return orgUnit;
    }

    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    public String getWbs() {
        return wbs;
    }

    public void setWbs(String wbs) {
        this.wbs = wbs;
    }

    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    public String getCategoryApplication() {
        return categoryApplication;
    }

    public void setCategoryApplication(String categoryApplication) {
        this.categoryApplication = categoryApplication;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDetailedDescription() {
        return detailedDescription;
    }

    public void setDetailedDescription(String detailedDescription) {
        this.detailedDescription = detailedDescription;
    }

    @Override
    public String toString() {
        return "TicketPPM{" +
                "orgUnit='" + orgUnit + '\'' +
                ", wbs='" + wbs + '\'' +
                ", requirementType='" + requirementType + '\'' +
                ", impact='" + impact + '\'' +
                ", urgency='" + urgency + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", reason='" + reason + '\'' +
                ", clientId='" + clientId + '\'' +
                ", requestorName='" + requestorName + '\'' +
                ", categoryApplication='" + categoryApplication + '\'' +
                ", location='" + location + '\'' +
                ", detailedDescription='" + detailedDescription + '\'' +
                '}';
    }
}
