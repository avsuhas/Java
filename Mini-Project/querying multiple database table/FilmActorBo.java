package com.samson.sakilaproject.bo;

public class FilmActorBo {
	
	int actorId;
	int filmId;
	String title;
	String firstName;
	String lastName;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "FilmActorBo [actorId=" + actorId + ", filmId=" + filmId + ", title=" + title + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	

}
