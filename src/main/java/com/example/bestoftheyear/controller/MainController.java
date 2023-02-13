package com.example.bestoftheyear.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bestoftheyear.classes.Movie;
import com.example.bestoftheyear.classes.Song;


@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping()
	public String home(Model model) { 
		model.addAttribute("name", "Bianca");
		return "index";
	}
	
	@GetMapping("/movies") 
	public String viewMovies(Model m) {
		List<Movie> movies = getBestMovies();
		m.addAttribute("films", movies);
		return "movies";
	}
	
	@GetMapping("/songs") 
	public String viewSongs(Model s) {
		List<Song> songs = getBestSongs();
		s.addAttribute("songs", songs);
		return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String dettaglioMovie(Model model, @PathVariable("id") String id) {
		List<Movie> movies = getBestMovies();
		model.addAttribute("movie", movies.get(Integer.parseInt(id) - 1));
		return "movie";
	}
	
	@GetMapping("/songs/{id}")
	public String dettaglioSong(Model model, @PathVariable("id") String id) {
		List<Song> songs = getBestSongs();
		model.addAttribute("song", songs.get(Integer.parseInt(id) - 1));
		return "song";
	}
	
	private List<Movie> getBestMovies() {
		
		List<Movie> movies = new ArrayList<Movie>();
		
		Movie film1= new Movie(1, "Dune");
		movies.add(film1);
		
		Movie film2= new Movie(2, "Carter");
		movies.add(film2);
		
		Movie film3= new Movie(3, "Justice League");
		movies.add(film3);
		
		Movie film4= new Movie(4, "Venom");
		movies.add(film4);
		
		return movies;
	}
	
	private List<Song> getBestSongs() {
		
		List<Song> songs = new ArrayList<Song>();
		
		Song song1= new Song(1, "As it was");
		songs.add(song1);
		
		Song song2= new Song(2, "Stay");
		songs.add(song2);
		
		Song song3= new Song(3, "Enemy");
		songs.add(song3);
		
		return songs;
	}

}
