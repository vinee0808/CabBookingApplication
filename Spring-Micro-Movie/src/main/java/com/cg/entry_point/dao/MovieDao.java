package com.cg.entry_point.dao;

import com.cg.entry_point.dto.Movie;

public interface MovieDao {

	boolean saveMovie(Movie movie);
	
	Movie getMovie(int id);
}
