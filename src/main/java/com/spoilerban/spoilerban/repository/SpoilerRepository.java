package com.spoilerban.spoilerban.repository;

import com.spoilerban.spoilerban.model.Spoiler;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SpoilerRepository extends ElasticsearchRepository<Spoiler, String> {
    List<Spoiler> findBySpoilerWord(String spoilerWord);
}
