package controller;

import model.Film;
import service.interfaces.IFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("/api/films")
public class FilmController {

    @Autowired
    private IFilmService filmService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Film>> getFilms() {
        Collection<Film> films = filmService.findAll();
        return new ResponseEntity<Collection<Film>>(films, HttpStatus.OK);
    }

    @PostMapping(value="/add" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Film> createFilm(@RequestBody Film film) throws Exception {
        Film createdFilm = filmService.create(film);
        return new ResponseEntity<Film>(createdFilm, HttpStatus.CREATED);
    }
}

