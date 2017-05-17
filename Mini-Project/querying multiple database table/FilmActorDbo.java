package com.samson.sakilaproject.dbo;

public class FilmActorDbo {
	
	int actor_id;
	int film_id;
	
	public int getActor_id() {
		return actor_id;
	}
	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	@Override
	public String toString() {
		return "FilmActorDbo [actor_id=" + actor_id + ", film_id=" + film_id + "]";
	}
	

}
