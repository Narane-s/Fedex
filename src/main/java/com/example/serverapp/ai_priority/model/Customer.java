package com.example.serverapp.ai_priority.model;

import com.example.serverapp.ai_priority.enums.RiskSegment;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Enumerated(EnumType.STRING)
    private RiskSegment riskSegment;

    public Long getCustomerId() { return customerId; }
    public String getCustomerName() { return customerName; }
    public RiskSegment getRiskSegment() { return riskSegment; }
} 
