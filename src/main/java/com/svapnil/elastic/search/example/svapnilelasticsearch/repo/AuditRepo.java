package com.svapnil.elastic.search.example.svapnilelasticsearch.repo;

import com.svapnil.elastic.search.example.svapnilelasticsearch.document.Audit;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface AuditRepo extends ElasticsearchRepository<Audit, String> {
}
