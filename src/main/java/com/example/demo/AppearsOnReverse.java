package com.example.demo;

import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
public class AppearsOnReverse {

    @Id @GeneratedValue
    private Long id;
    @Property("song_nr")
    private Integer songNr;

    @TargetNode
    private Song song;

    public Integer getSongNr() {
        return songNr;
    }

    public Song getSong() {
        return song;
    }
}
