package com.svapnil.elastic.search.example.svapnilelasticsearch.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Data
@Builder
@Document(indexName = "audit")
public class Audit {

    @Id
    @Field(type = FieldType.Keyword)
    private String id;

    @Field(type = FieldType.Text)
    private String appName;

    @Field(type = FieldType.Text)
    private String action;

    @Field(type = FieldType.Text)
    private String page;

    @Field(type = FieldType.Text)
    private String user;

    @Field(type = FieldType.Text)
    private String region;

}
