package main;

public class App {

	public static void main(String[] args) {
		int physScore = 50;
		int chemScore = 50;
		int bioScore = 50;
		resultsCalc.results.examResults(physScore, chemScore, bioScore);
		System.out.println("");
		resultsCalc.results.overallPercent(physScore, chemScore, bioScore);
		
	}

}
