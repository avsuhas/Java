package com.samson.sakilaproject.dbo;

public class InventoryDbo {
	
	int inverntoryId;
	int filmId;
	int storeId;
	public int getInverntoryId() {
		return inverntoryId;
	}
	public void setInverntoryId(int inverntoryId) {
		this.inverntoryId = inverntoryId;
	}
	public int getFilmId() {
		return filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "InventoryDbo [inverntoryId=" + inverntoryId + ", filmId=" + filmId + ", storeId=" + storeId + "]";
	}
	

}
