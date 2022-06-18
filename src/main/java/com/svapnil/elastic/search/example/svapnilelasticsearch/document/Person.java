package com.svapnil.elastic.search.example.svapnilelasticsearch.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Data
@Document(indexName = "person")
public class Person {

    @Id
    @Field
    private String id;

    @Field
    private String name;
}
