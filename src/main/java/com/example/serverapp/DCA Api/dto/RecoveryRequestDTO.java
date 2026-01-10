package com.example.serverapp.dto;

public class RecoveryRequestDTO {

    private String closureReason;
    private Double recoveredAmount;
    private String remarks;

    public RecoveryRequestDTO() {}

    public String getClosureReason() {
        return closureReason;
    }

    public void setClosureReason(String closureReason) {
        this.closureReason = closureReason;
    }

    public Double getRecoveredAmount() {
        return recoveredAmount;
    }

    public void setRecoveredAmount(Double recoveredAmount) {
        this.recoveredAmount = recoveredAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
