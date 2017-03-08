package ste.sudoku;

import java.util.HashMap;
import java.util.Map;

public class Model {
	private Map<Integer, Zone> horizontal = new HashMap<>();
	private Map<Integer, Zone> vertical = new HashMap<>();
	private Map<Integer, Zone> bloc = new HashMap<>();

	public Model(){
		for (int i=1; i<=9;i++) {
			horizontal.put(i, new Zone());
			vertical.put(i, new Zone());
			bloc.put(i, new Zone());
		}	
	}
	public void add(PositionnedValue pv){
		if (pv !=null){
		horizontal.get(pv.getY()).add(pv.getValue(), pv.getX());
		vertical.get(pv.getX()).add(pv.getValue(), pv.getY());
		bloc.get((pv.getY()+1/3)).add(pv.getValue(), pv.getX()+3);;
		
		}else{
			System.out.println("Valeur null, exit ->");
		}
	}
	public Map<Integer, Zone> getHorizontal() {
		return horizontal;
	}
	public Map<Integer, Zone> getVertical() {
		return vertical;
	}
	public Map<Integer, Zone> getBloc() {
		return bloc;
	}
	
}