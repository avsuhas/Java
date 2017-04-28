package com.samson;

public class FilmBO {
	
	int film_id;
	String title;
	String description;
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "FilmBO [film_id=" + film_id + ", title=" + title + ", description=" + description + "]";
	}
	

}
