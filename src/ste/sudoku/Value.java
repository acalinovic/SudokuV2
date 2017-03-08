package ste.sudoku;
public enum Value {
	ONE(1),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9);
	
	private int value;
	
	private Value(int value){
		this.value = value;
	}
	
	public static Value toValue(String s){
		int v = new Integer(s);
		for(Value value:Value.values()){
			if(value.value == v){
				return value;
			}
		}
		return null;
	}
}