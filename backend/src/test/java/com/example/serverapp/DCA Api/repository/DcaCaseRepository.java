package com.example.serverapp.repository;

import com.example.serverapp.model.DcaCase;
import com.example.serverapp.model.CaseStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DcaCaseRepository extends JpaRepository<DcaCase, Long> {

    List<DcaCase> findByDcaId(Long dcaId);

    Optional<DcaCase> findByIdAndDcaId(Long caseId, Long dcaId);

    List<DcaCase> findByCaseStatusAndDcaId(CaseStatus status, Long dcaId);
}
