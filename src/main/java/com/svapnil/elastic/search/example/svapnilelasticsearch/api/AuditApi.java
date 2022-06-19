package com.svapnil.elastic.search.example.svapnilelasticsearch.api;

import com.svapnil.elastic.search.example.svapnilelasticsearch.document.Audit;
import com.svapnil.elastic.search.example.svapnilelasticsearch.repo.AuditRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/api/audit")
public class AuditApi {

    private final AuditRepo auditRepo;

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Audit> updateAudit(@RequestBody List<Audit> audits){
        return auditRepo.saveAll(audits);
    }

    @GetMapping("/findAll")
    public Iterable<Audit> findAll(){
        return auditRepo.findAll();
    }

}
