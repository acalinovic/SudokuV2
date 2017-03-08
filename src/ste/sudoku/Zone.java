package ste.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zone {
	private Map<Integer, Value> map = new HashMap<>();
	
	public boolean isPresent(Integer i){
		return map.get(i) != null;
	}
	public void add(Value v, Integer i){
		this.map.put(i, v);
	}
	public void displayZone(){
		System.out.print(map.values());
	}
}
