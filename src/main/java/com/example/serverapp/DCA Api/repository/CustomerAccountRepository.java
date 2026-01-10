package com.example.serverapp.repository;

import com.example.serverapp.model.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Long> {
}
