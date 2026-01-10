package com.example.serverapp.model;

import com.example.serverapp.model.enums.AgeingBucket;
import com.example.serverapp.model.enums.CollectionStage;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "customer_accounts")
public class CustomerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "outstanding_amount")
    private BigDecimal outstandingAmount;

    @Enumerated(EnumType.STRING)
    @Column(name = "ageing_bucket")
    private AgeingBucket ageingBucket;

    @Column(name = "delinquency_score")
    private BigDecimal delinquencyScore;

    @Enumerated(EnumType.STRING)
    @Column(name = "collection_stage")
    private CollectionStage collectionStage;

    // ===== GETTERS & SETTERS =====

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(BigDecimal outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public AgeingBucket getAgeingBucket() {
        return ageingBucket;
    }

    public void setAgeingBucket(AgeingBucket ageingBucket) {
        this.ageingBucket = ageingBucket;
    }

    public BigDecimal getDelinquencyScore() {
        return delinquencyScore;
    }

    public void setDelinquencyScore(BigDecimal delinquencyScore) {
        this.delinquencyScore = delinquencyScore;
    }

    public CollectionStage getCollectionStage() {
        return collectionStage;
    }

    public void setCollectionStage(CollectionStage collectionStage) {
        this.collectionStage = collectionStage;
    }
}
