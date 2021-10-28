package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final SongRepository songRepository;
	private final ReleaseRepository releaseRepository;

	public DemoApplication(SongRepository songRepository, ReleaseRepository releaseRepository) {
		this.songRepository = songRepository;
		this.releaseRepository = releaseRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		for(Song song : songRepository.findAll()) {
//			System.out.println(song.getName());
//			for(AppearsOn appearsOn : song.getReleases()) {
//				System.out.println("   " + appearsOn.getSongNr() + " " + appearsOn.getRelease().getName());
//			}
//		}
		for(Release release : releaseRepository.findAll()) {
			System.out.println(release.getName());
			for(AppearsOnReverse appearsOnReverse : release.getAppearsOnReverses()) {
				System.out.println("   " + appearsOnReverse.getSongNr() + " " + appearsOnReverse.getSong().getName());
			}
		}
	}
}
