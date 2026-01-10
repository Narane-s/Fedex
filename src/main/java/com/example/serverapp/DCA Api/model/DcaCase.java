package com.example.serverapp.model;

import com.example.serverapp.model.enums.CaseStatus;
import com.example.serverapp.model.enums.ClosureReason;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "dca_cases")
public class DcaCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_id")
    private Long caseId;

    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "dca_id")
    private Long dcaId;

    @Column(name = "allocated_date")
    private LocalDateTime allocatedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "case_status")
    private CaseStatus caseStatus;

    @Column(name = "priority_score")
    private BigDecimal priorityScore;

    @Column(name = "sla_due_date")
    private LocalDate slaDueDate;

    @Column(name = "current_owner")
    private String currentOwner;

    @Enumerated(EnumType.STRING)
    @Column(name = "closure_reason")
    private ClosureReason closureReason;

    // ===== GETTERS & SETTERS =====

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getDcaId() {
        return dcaId;
    }

    public void setDcaId(Long dcaId) {
        this.dcaId = dcaId;
    }

    public LocalDateTime getAllocatedDate() {
        return allocatedDate;
    }

    public void setAllocatedDate(LocalDateTime allocatedDate) {
        this.allocatedDate = allocatedDate;
    }

    public CaseStatus getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(CaseStatus caseStatus) {
        this.caseStatus = caseStatus;
    }

    public BigDecimal getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(BigDecimal priorityScore) {
        this.priorityScore = priorityScore;
    }

    public LocalDate getSlaDueDate() {
        return slaDueDate;
    }

    public void setSlaDueDate(LocalDate slaDueDate) {
        this.slaDueDate = slaDueDate;
    }

    public String getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(String currentOwner) {
        this.currentOwner = currentOwner;
    }

    public ClosureReason getClosureReason() {
        return closureReason;
    }

    public void setClosureReason(ClosureReason closureReason) {
        this.closureReason = closureReason;
    }
}
