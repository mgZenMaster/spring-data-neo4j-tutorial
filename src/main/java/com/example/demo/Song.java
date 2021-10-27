package com.example.demo;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.LocalTime;
import java.util.List;

@Node
public class Song {

    @Id @GeneratedValue
    private Long id;
    private String name;
    private LocalTime length;

    @Relationship(type="APPEARS_ON", direction = Relationship.Direction.OUTGOING)
    private List<AppearsOn> releases;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getLength() {
        return length;
    }

    public void setLength(LocalTime length) {
        this.length = length;
    }

    public List<AppearsOn> getReleases() {
        return releases;
    }

    public void setReleases(List<AppearsOn> releases) {
        this.releases = releases;
    }
}
