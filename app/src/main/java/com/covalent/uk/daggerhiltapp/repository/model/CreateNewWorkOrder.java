package com.covalent.uk.daggerhiltapp.repository.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateNewWorkOrder {

    @SerializedName("oderNumber")
    @Expose
    private Integer oderNumber;
    @SerializedName("faultDescription")
    @Expose
    private String faultDescription;
    @SerializedName("faultObjectDescription")
    @Expose
    private String faultObjectDescription;
    @SerializedName("plannedStartDate")
    @Expose
    private String plannedStartDate;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("workType")
    @Expose
    private String workType;
    @SerializedName("maintOrg")
    @Expose
    private String maintOrg;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contactName")
    @Expose
    private String contactName;
    @SerializedName("phone")
    @Expose
    private Integer phone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("actualStart")
    @Expose
    private String actualStart;
    @SerializedName("actualFinish")
    @Expose
    private String actualFinish;
    @SerializedName("plannedStart")
    @Expose
    private String plannedStart;
    @SerializedName("plannedFinish")
    @Expose
    private String plannedFinish;
    @SerializedName("requestedStart")
    @Expose
    private String requestedStart;
    @SerializedName("requestedFinish")
    @Expose
    private String requestedFinish;

    public Integer getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(Integer oderNumber) {
        this.oderNumber = oderNumber;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public String getFaultObjectDescription() {
        return faultObjectDescription;
    }

    public void setFaultObjectDescription(String faultObjectDescription) {
        this.faultObjectDescription = faultObjectDescription;
    }

    public String getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(String plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public String getMaintOrg() {
        return maintOrg;
    }

    public void setMaintOrg(String maintOrg) {
        this.maintOrg = maintOrg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActualStart() {
        return actualStart;
    }

    public void setActualStart(String actualStart) {
        this.actualStart = actualStart;
    }

    public String getActualFinish() {
        return actualFinish;
    }

    public void setActualFinish(String actualFinish) {
        this.actualFinish = actualFinish;
    }

    public String getPlannedStart() {
        return plannedStart;
    }

    public void setPlannedStart(String plannedStart) {
        this.plannedStart = plannedStart;
    }

    public String getPlannedFinish() {
        return plannedFinish;
    }

    public void setPlannedFinish(String plannedFinish) {
        this.plannedFinish = plannedFinish;
    }

    public String getRequestedStart() {
        return requestedStart;
    }

    public void setRequestedStart(String requestedStart) {
        this.requestedStart = requestedStart;
    }

    public String getRequestedFinish() {
        return requestedFinish;
    }

    public void setRequestedFinish(String requestedFinish) {
        this.requestedFinish = requestedFinish;
    }

}
