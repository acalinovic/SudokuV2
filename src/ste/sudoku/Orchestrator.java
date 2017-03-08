package ste.sudoku;

public class Orchestrator {

	public static void main(String[] args) {
		
		Console console = new Console();
		PositionnedValueFactory pvf = new PositionnedValueFactory();
		PositionnedValue pv = new PositionnedValue();
		Model model = new Model();
		while (pv != null){
			System.out.println(pv.toDisplayString());
			pv = pvf.build(console.getInput());
			model.add(pv);
			for (int i = 1;i<=9;i++){
				model.getHorizontal().get(i).displayZone();
				System.out.println();
			}
			System.out.println("---------");

			for (int i = 1;i<=9;i++){
				model.getVertical().get(i).displayZone();
				System.out.println();
			}			
			System.out.println("---------");

			for (int i = 1;i<=9;i++){
				model.getBloc().get(i).displayZone();
				System.out.println();
			}
		}
	}

}
