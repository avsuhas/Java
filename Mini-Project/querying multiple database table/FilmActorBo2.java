package com.samson.sakilaproject.bo;

import java.util.List;

public class FilmActorBo2 {
	
	int actorId;
	String title;
	List<FilmBo> filmList;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<FilmBo> getFilmList() {
		return filmList;
	}
	public void setFilmList(List<FilmBo> filmList) {
		this.filmList = filmList;
	}
	@Override
	public String toString() {
		return "FilmActorBo2 [actorId=" + actorId + ", title=" + title + ", filmList=" + filmList + "]";
	}
	
	

}
