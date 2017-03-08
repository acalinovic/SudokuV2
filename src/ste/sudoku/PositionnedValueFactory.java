package ste.sudoku;

import java.util.StringTokenizer;

public class PositionnedValueFactory {
	public PositionnedValue build(String s){
		if(s != null){
			PositionnedValue pv = new PositionnedValue();
			StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
			if(stringTokenizer.countTokens() >= 3){
				pv.setX(new Integer(stringTokenizer.nextToken()));
				pv.setY(new Integer(stringTokenizer.nextToken()));
				pv.setValue(Value.toValue(stringTokenizer.nextToken()));
				return pv;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}
}