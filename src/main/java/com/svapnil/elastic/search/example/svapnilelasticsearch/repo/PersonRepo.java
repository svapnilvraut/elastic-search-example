package com.svapnil.elastic.search.example.svapnilelasticsearch.repo;

import com.svapnil.elastic.search.example.svapnilelasticsearch.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends ElasticsearchRepository<Person, String> {
}
