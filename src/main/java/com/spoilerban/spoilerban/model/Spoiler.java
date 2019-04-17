package com.spoilerban.spoilerban.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="spoilerban",type="spoiler",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spoiler {

    @Id
    private String id;
    private String spoilerWord;

}
