package com.hsbc.persistance;

public class StorageFactory {
	public static Storage getStorageCode(int code) {
		Storage empStorage =null;
		switch(code) {
		case 1:
			empStorage=new StorageImpList();
			break;
		case 2:
			empStorage=new StorageImpSet();
			break;
		case 3:
			empStorage=new StorageImpMap();
			break;
		default:
			System.exit(0);
		}
		return empStorage;
	}
}
