package it.lessons.spring.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.lessons.spring.best_of_the_year.models.Movie;
import it.lessons.spring.best_of_the_year.models.Song;

@Controller
@RequestMapping("/")

public class GreetingController {

    @GetMapping("/")
    public String home(@RequestParam(name = "name") String name,
    Model model) {
        model.addAttribute("name", name);
    return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        List<Movie> movies = getBestMovie();
        model.addAttribute("listaMovies", movies);

/*      
Risoluzione Prima parte
        String films = "";
        for(Movie m : movies){
            films += m.getTitolo() + ", ";
        }
        films = films.substring(0, films.length() - 2);
        model.addAttribute("listaFilm", films); */
        return "movies";
    }

    @GetMapping("/songs")
    public String song(Model model) {
        List<Song> songs = getBestSong();
        model.addAttribute("listaSongs", songs);

/* 
Risoluzione Prima parte
        String canzoni = "";
        for(Song s : songs){
            canzoni += s.getTitolo() + ", ";
        }
        canzoni = canzoni.substring(0, canzoni.length() - 2);
        model.addAttribute("listaSong", canzoni);
*/
        return "songs"; 
    }

    @GetMapping("/song/{id}")
    public String songId(@PathVariable(name = "id") int id, Model model) {
        List<Song> songs = getBestSong();
        for(Song s : songs){
            if(s.getId() == id){
                model.addAttribute("song", s);
                break;
            }
        }
        return "searchSong";
    }

    @GetMapping("/movies/{id}")
    public String getMethodName(@PathVariable(name = "id") int id, Model model) {
        List<Movie> movies = getBestMovie();
        for(Movie m : movies){
            if(m.getId() == id){
                model.addAttribute("movie", m);
                break;
            }
        }
        
        return "searchMovie";
    }
    
    
    

    private List<Movie> getBestMovie(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Il gladiatore"));
        movies.add(new Movie(2, "Matrix"));
        movies.add(new Movie(3, "Il signore degli anelli"));
        return movies;
    }

    private List<Song> getBestSong(){
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Io ci sarò"));
        songs.add(new Song(2, "Perfect"));
        songs.add(new Song(3, "We are the champions"));
        return songs;
    }

}
