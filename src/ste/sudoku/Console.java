package ste.sudoku;
import java.util.Scanner;
public class Console {
	Scanner sc = new Scanner(System.in);	

	public String getInput(){
		System.out.print("Enter a move :: <X> <Y> <VALUE> :: ");
		return sc.nextLine();
	}
}
