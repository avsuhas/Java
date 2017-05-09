package com.samson.sakilaproject.bo;

public class InventoryBo {
	
	int inventoryId;
	int filmId;
	int storeId;
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
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
		return "InventoryBo [inventoryId=" + inventoryId + ", filmId=" + filmId + ", storeId=" + storeId + "]";
	}
	

}
