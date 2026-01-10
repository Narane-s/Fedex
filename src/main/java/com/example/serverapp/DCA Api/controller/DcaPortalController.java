package com.example.serverapp.controller;

import com.example.serverapp.model.DcaCase;
import com.example.serverapp.repository.DcaCaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dca")
public class DcaPortalController {

    private final DcaCaseRepository dcaCaseRepository;

    public DcaPortalController(DcaCaseRepository dcaCaseRepository) {
        this.dcaCaseRepository = dcaCaseRepository;
    }

    // 🔐 DCA can see ONLY their cases
    @GetMapping("/cases/{dcaId}")
    public List<DcaCase> getAssignedCases(@PathVariable Long dcaId) {
        return dcaCaseRepository.findByDcaId(dcaId);
    }
}
