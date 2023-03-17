package com.adeebali.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
    return movieRepository.findAll();
}
public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findById(id);
}
}