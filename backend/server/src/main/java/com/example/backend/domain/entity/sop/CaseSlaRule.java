package com.example.backend.domain.entity.sop;

import com.example.backend.domain.enums.sop.CollectionStage;
import com.example.backend.domain.enums.sop.Severity;
import jakarta.persistence.*;

@Entity
@Table(name = "Case_SLA_Rule")
public class CaseSlaRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "case_sla_id", nullable = false, updatable = false)
    private Long caseSlaId;

    @Enumerated(EnumType.STRING)
    @Column(name = "collection_stage")
    private CollectionStage collectionStage;

    @Column(name = "max_resolution_days")
    private Integer maxResolutionDays;

    @Enumerated(EnumType.STRING)
    @Column(name = "severity")
    private Severity severity;

    // Getters & Setters
    public Long getCaseSlaId() { return caseSlaId; }

    public CollectionStage getCollectionStage() { return collectionStage; }
    public void setCollectionStage(CollectionStage collectionStage) { this.collectionStage = collectionStage; }

    public Integer getMaxResolutionDays() { return maxResolutionDays; }
    public void setMaxResolutionDays(Integer maxResolutionDays) { this.maxResolutionDays = maxResolutionDays; }

    public Severity getSeverity() { return severity; }
    public void setSeverity(Severity severity) { this.severity = severity; }
}
