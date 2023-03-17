package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String,Integer> feeStruct;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFeeStruct() {
		return feeStruct;
	}
	public void setFeeStruct(Map<String, Integer> feeStruct) {
		this.feeStruct = feeStruct;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStruct=" + feeStruct + "]";
	} 
	
 
	 
	
}
