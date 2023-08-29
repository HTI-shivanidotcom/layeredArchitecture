package com.hsbc.data;

public class StorageFactory {
	public static Storage getStorageCode(int code) {
		Storage empStorage = null;
		
		switch(code) {
		case 1: 
			empStorage=new StorageListImpl();
			break;
		}
		
		
		return empStorage;
	}
}
