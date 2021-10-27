package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final SongRepository songRepository;

	public DemoApplication(SongRepository songRepository) {
		this.songRepository = songRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(Song song : songRepository.findAll()) {
			System.out.println(song.getName());
			for(AppearsOn appearsOn : song.getReleases()) {
				System.out.println("   " + appearsOn.getSongNr() + " " + appearsOn.getRelease().getName());
			}
		}
	}
}
