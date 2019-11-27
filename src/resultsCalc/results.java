package resultsCalc;

public class results {

	public static void examResults(int physScore, int chemScore, int bioScore) {
		int total = chemScore + physScore + bioScore;
		System.out.println("Your Chemistry exam result was: " + chemScore + "/150");
		System.out.println("Your Physics exam result was: " + physScore + "/150");
		System.out.println("Your Biology exam result was: " + bioScore + "/150");
		System.out.println("Your total exam result was: " + total + "/450");

	}

	public static void overallPercent(int physScore, int chemScore, int bioScore) {
		int total = chemScore + physScore + bioScore;
		double chemPercent = ((chemScore * 100) / 150);
		double physPercent = ((physScore * 100) / 150);
		double bioPercent = ((bioScore * 100) / 150);
		double percent = ((total * 100) / 450);
		System.out.println("Your overall exam percentage is " + percent + "%");
		int examsFailed = 0;
		if (percent < 60) {
			System.out.println("You have failed your exams :(");
		}

		if (chemPercent < 60) {
			System.out.println("You have failed your Chemistry exam :(");
			examsFailed++;
		}
		if (physPercent < 60) {
			System.out.println("You have failed your Physics exam :(");
			examsFailed++;
		}
		if (bioPercent < 60) {
			System.out.println("You have failed your Biology exam :(");
			examsFailed++;
		}
		if (examsFailed > 0) {
			System.out.println("You have failed " + examsFailed + " exam(s) overall.");
		} else {
			System.out.println("You have passed your exams :)");
		}

	}

}
