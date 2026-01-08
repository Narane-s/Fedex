package com.example.serverapp.ai_priority.repository;

import com.example.serverapp.ai_priority.model.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {}
