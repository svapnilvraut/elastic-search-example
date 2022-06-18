package com.svapnil.elastic.search.example.svapnilelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class SvapnilElasticSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvapnilElasticSearchApplication.class, args);
	}

}
