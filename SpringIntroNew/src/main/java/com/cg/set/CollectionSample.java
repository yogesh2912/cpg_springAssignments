package com.cg.set;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionSample {

	private Set<String> country;
	private List<String> myList;
	private Map<Integer, String> myMap;
	private Properties myProp;

	public List<String> getMyList() {
		return myList;
	}

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public Map<Integer, String> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProp() {
		return myProp;
	}

	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}

	public Set<String> getCountry() {
		return country;
	}

	public void setCountry(Set<String> set) {
		this.country = set;
	}

}
