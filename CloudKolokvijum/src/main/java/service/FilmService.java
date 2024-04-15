package service;


import model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IFilmRepository;
import service.interfaces.IFilmService;

import java.util.Collection;

@Service
public class FilmService implements IFilmService {

    @Autowired
    private IFilmRepository filmRepository;

    @Override
    public Collection<Film> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Film create(Film film) throws Exception {
        return filmRepository.save(new Film(film));
    }

}

