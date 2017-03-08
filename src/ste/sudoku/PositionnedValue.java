package ste.sudoku;

public class PositionnedValue {
	private int x;
	private int y;
	private Value value;
	
	public PositionnedValue() {
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Value getValue() {
		return value;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setValue(Value value) {
		this.value = value;
	}

	public String toDisplayString() {
		return "PositionnedValue [x=" + x + ", y=" + y + ", value=" + value + "]";
	}

}
