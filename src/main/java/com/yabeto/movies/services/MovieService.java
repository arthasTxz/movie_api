package com.yabeto.movies.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yabeto.movies.entities.Movie;
import com.yabeto.movies.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(ObjectId id){
        System.out.println(movieRepository.findById(id));
        return movieRepository.findById(id);
    }

    public Optional<Movie> singleMovie(String imdbId) { return movieRepository.findMovieByImdbId(imdbId);}
}
