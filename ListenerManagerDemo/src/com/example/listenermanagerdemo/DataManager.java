package com.example.listenermanagerdemo;

import java.util.List;
import java.util.ArrayList;

/**
 * This class is an example for the listener / manager pattern
 * 
 * @author ChrisOllenburg
 */
public class DataManager {
	private static DataManager instance;
	private List<DataListener> listeners;
	private String data;
	
	private DataManager() {
		listeners = new ArrayList<DataListener>();
		this.data = null;
	}
	
	public static DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}
	
	public void updateData(String data) {
		this.data = data;
		for (DataListener listener : listeners) {
			listener.dataUpdated(this.data);
		}
	}
	
	public void registerListener(DataListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(DataListener listener) {
		listeners.remove(listener);
	}
}
