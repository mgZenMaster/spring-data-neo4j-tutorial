package com.example.demo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface SongRepository extends Neo4jRepository<Song, Long> {
}
