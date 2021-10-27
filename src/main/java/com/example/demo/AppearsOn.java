package com.example.demo;

import org.springframework.data.neo4j.core.schema.*;

@RelationshipProperties
public class AppearsOn {

    @Id @GeneratedValue
    private Long id;
    @Property("song_nr")
    private Integer songNr;

    @TargetNode
    private Release release;

    public Integer getSongNr() {
        return songNr;
    }

    public Release getRelease() {
        return release;
    }
}
