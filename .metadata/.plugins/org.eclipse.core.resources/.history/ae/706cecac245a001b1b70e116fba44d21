package com.cos.interexam.domain;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	
	public List<Movie> findAll() {
		List<Movie> movies = new ArrayList<>();
		
		movies.add(new Movie(1, "타이틀1", 4.5, new Timestamp(System.currentTimeMillis())));
		movies.add(new Movie(2, "타이틀2", 3.8, new Timestamp(System.currentTimeMillis())));
		movies.add(new Movie(3, "타이틀3", 4.9, new Timestamp(System.currentTimeMillis())));
		
		return movies;
	}
	
	public Movie findById(int id) {
		return new Movie(8, "타이틀8", 5.0, new Timestamp(System.currentTimeMillis()));
	}
	
	public void insert(InsertReqDto dto) {
		System.out.println("Movie 등록하기");
	}
	
	public void delete(int id) {
		System.out.println("Movie 삭제하기");
	}
	
	public void update(int id, UpdateReqDto dto) {
		System.out.println("Movie 수정하기");
	}
}
